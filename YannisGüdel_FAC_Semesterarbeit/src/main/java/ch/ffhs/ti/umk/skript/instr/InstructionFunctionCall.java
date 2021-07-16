package ch.ffhs.ti.yannis.skript.instr;

public class InstructionFunctionCall extends Instruction
{
    final String name;
    
    public InstructionFunctionCall(String name)
    {
        this.name = name;
    }
    
    @Override
    public <R> R acceptVisitor(InstructionVisitor<R> visitor)
    {
        return visitor.visitFunctionCall(this);
    }
 

}
