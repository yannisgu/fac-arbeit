package ch.ffhs.ti.umk.skript.instr;

import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;

/**
 * Ein Evaluator zum Auswerten von Instructions. Die Klasse ist eine
 * Visitorklasse und wird wie folgt verwendet:
 * instruction.acceptVisitor(evaluator);
 * 
 * @author urs-martin
 */
public class Evaluator implements InstructionVisitor<BigInteger> {
    /** Eine Map mit Namen-Wert Paaren für Variable */
    private Map<String, BigInteger> context;

    /**
     * Erzeugt einen Evaluator mit leerem Context und leerer FunktionsLibrary.
     */
    public Evaluator() {
        this(new HashMap<String, BigInteger>());
    }

    /**
     * Erzeugt einen Evaluator
     * 
     * @param context Vordefinierte Variablenwerte
     */
    public Evaluator(Map<String, BigInteger> context) {
        this.context = context;
    }

    // Ohne weitere Kommentare: Auswertungsmethoden für alle Instruktionstypen.

    @Override
    public BigInteger visitConstant(InstructionConstant instructionConstant) {
        return (BigInteger) instructionConstant.value;
    }

    @Override
    public BigInteger visitGetVariable(InstructionGetVariable instructionGetVariable) {
        if (context.containsKey(instructionGetVariable.name)) {
            return context.get(instructionGetVariable.name);
        } else {
            throw new RuntimeException("Variable " + instructionGetVariable.name + " not initialized.");
            // TODO spezifischere Exception
        }
    }

    @Override
    public BigInteger visitSetVariable(InstructionSetVariable instructionSetVariable) {
        BigInteger evaluatedValue = instructionSetVariable.value.acceptVisitor(this);
        context.put(instructionSetVariable.name, evaluatedValue);
        return null;
    }

    @Override
    public BigInteger visitBinaryOperation(InstructionBinaryOperation instructionBinOp) {
        BigInteger left = instructionBinOp.leftOperand.acceptVisitor(this);
        BigInteger right = instructionBinOp.rightOperand.acceptVisitor(this);
        switch (instructionBinOp.operator) {
            case PLUS:
                return left.add(right);
            case MINUS:
                return left.subtract(right);
            case TIMES:
                return left.multiply(right);
            case DIV:
                return left.divide(right);
            case MOD:
                return left.mod(right);
            case POW:
                return left.pow(right.intValue()); // TODO overflow abfangen
            default:
                assert false;
                return null;
        }
    }

    @Override
    public BigInteger visitNegation(InstructionNegate instructionNegate) {
        BigInteger operand = instructionNegate.operand.acceptVisitor(this);
        return operand.negate();
    }

    @Override
    public BigInteger visitScript(InstructionScript instructionScript) {
        for (Instruction instr : instructionScript.assignments) {
            instr.acceptVisitor(this);
        }
        return instructionScript.lastInstruction.acceptVisitor(this);
    }

    @Override
    public BigInteger visitIf(InstructionIf instructionIf) {
        if (instructionIf.condition.acceptVisitor(this).equals(BigInteger.ONE))
            return instructionIf.script.acceptVisitor(this);

        return null;
    }

    @Override
    public BigInteger visitCondition(InstructionCondition instructionCondition) {
        BigInteger left = instructionCondition.leftOperand.acceptVisitor(this);
        BigInteger right = instructionCondition.rightOperand.acceptVisitor(this);
        switch (instructionCondition.operator) {
            case EQ:
                return left.equals(right) ? BigInteger.ONE : BigInteger.ZERO;
            case NE:
                return !left.equals(right) ? BigInteger.ONE : BigInteger.ZERO;
            case LT:
                return left.compareTo(right) < 0 ? BigInteger.ONE : BigInteger.ZERO;
            case LTE:
                return left.compareTo(right) <= 0 ? BigInteger.ONE : BigInteger.ZERO;
            case GT:
                return left.compareTo(right) > 0 ? BigInteger.ONE : BigInteger.ZERO;
            case GTE:
                return left.compareTo(right) >= 0 ? BigInteger.ONE : BigInteger.ZERO;
            default:
                assert false;
                return null;
        }
    }

    @Override
    public BigInteger visitBlock(InstructionBlock instructionBlock) {
        for (Instruction instr : instructionBlock.statements) {
            instr.acceptVisitor(this);
        }
        return null;
    }

    @Override
    public BigInteger visitWhile(InstructionWhile instructionWhile) {
        while (instructionWhile.condition.acceptVisitor(this) == BigInteger.ONE) {
            instructionWhile.script.acceptVisitor(this);
        }
        return null;
    }

}
