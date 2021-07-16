package ch.ffhs.ti.umk.skript.instr;

import java.util.List;

public class InstructionBlock extends Instruction
{

    final List<Instruction> statements;

    final Instruction lastInstruction;
    
        
    public InstructionBlock(List<Instruction> statements)
    {
        this.statements = statements;
        this.lastInstruction = null;
    }

    public InstructionBlock(List<Instruction> statements, Instruction lastInstruction)
    {
        this.statements = statements;
        this.lastInstruction = lastInstruction;
    }
    
    
    @Override
    public <R> R acceptVisitor(InstructionVisitor<R> visitor)
    {
        return visitor.visitBlock(this);
    }

}
