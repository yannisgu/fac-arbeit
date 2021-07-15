package ch.ffhs.ti.umk.skript.instr;

/**
 * Basisklasse für alle Instruktionen.
 * 
 * @author urs-martin
 */
public abstract class Instruction
{
    public abstract <R> R acceptVisitor(InstructionVisitor<R> visitor);
        
}
