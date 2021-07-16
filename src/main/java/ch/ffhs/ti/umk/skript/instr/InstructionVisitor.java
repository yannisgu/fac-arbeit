package ch.ffhs.ti.umk.skript.instr;

public interface InstructionVisitor<R>
{
    public R visitScript(InstructionScript instructionScript);

    public R visitBinaryOperation(InstructionBinaryOperation instructionBinOperation);

    public R visitNegation(InstructionNegate instructionUnaryOperation);

    public R visitConstant(InstructionConstant instructionConstant);

    public R visitGetVariable(InstructionGetVariable instructionGetVariable);

    public R visitSetVariable(InstructionSetVariable instructionSetVariable);

    public R visitIf(InstructionIf instructionSetVariable);

    public R visitCondition(InstructionCondition instructionCondition);

    public R visitBlock(InstructionBlock instructionBlock);

    public R visitWhile(InstructionWhile instructionWhile);


}
