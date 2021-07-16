package ch.ffhs.ti.yannis.skript.instr;

public class InstructionCondition extends Instruction
{

    final ConditionOperator operator;
    
    final Instruction leftOperand;
    
    final Instruction rightOperand;
    
    public InstructionCondition(ConditionOperator operator, Instruction leftOperand, Instruction rightOperand)
    {
        this.operator = operator;
        this.leftOperand = leftOperand;
        this.rightOperand = rightOperand;
    }
    
    @Override
    public <R> R acceptVisitor(InstructionVisitor<R> visitor)
    {
        return visitor.visitCondition(this);
    }
 

}
