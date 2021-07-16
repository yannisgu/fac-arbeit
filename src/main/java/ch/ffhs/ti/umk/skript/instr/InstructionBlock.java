package ch.ffhs.ti.umk.skript.instr;

import java.util.List;

public class InstructionBlock extends Instruction
{

    final List<Instruction> statements;
    
        
    public InstructionBlock(List<Instruction> statements)
    {
        this.statements = statements;
    }
    
    
    @Override
    public <R> R acceptVisitor(InstructionVisitor<R> visitor)
    {
        return visitor.visitBlock(this);
    }

}
