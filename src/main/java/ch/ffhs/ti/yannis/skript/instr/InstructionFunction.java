package ch.ffhs.ti.yannis.skript.instr;

public class InstructionFunction extends Instruction
{

    final String name;
    
    final Instruction script;
    
    
    public InstructionFunction(String name, Instruction script)
    {
        this.name = name;
        this.script = script;
    }
    
    @Override
    public <R> R acceptVisitor(InstructionVisitor<R> visitor)
    {
        return visitor.visitFunction(this);
    }
 

}
