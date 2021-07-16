package ch.ffhs.ti.umk.skript.instr;

public class InstructionWhile extends Instruction
{

    final InstructionCondition condition;
    
    final Instruction script;
    
    
    public InstructionWhile(InstructionCondition condition, Instruction script)
    {
        this.condition = condition;
        this.script = script;
    }
    
    @Override
    public <R> R acceptVisitor(InstructionVisitor<R> visitor)
    {
        return visitor.visitWhile(this);
    }
 

}
