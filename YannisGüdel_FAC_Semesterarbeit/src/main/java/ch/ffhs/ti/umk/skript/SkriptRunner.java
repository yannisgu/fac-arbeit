package ch.ffhs.ti.yannis.skript;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import java_cup.runtime.Symbol;
import ch.ffhs.ti.yannis.skript.instr.Evaluator;
import ch.ffhs.ti.yannis.skript.instr.Instruction;
import ch.ffhs.ti.yannis.skript.instr.Validator;
import ch.ffhs.ti.yannis.skript.parser.parser;
import ch.ffhs.ti.yannis.skript.parser.Scanner;

/**
 * Interaktiver Interpreter als Konsonen-Applikation. 
 * Ein Skript-Teil wird jeweils nach Eingabe einer Leerzeile ausgeführt.
 *  
 * @author urs-martin
 */
public class SkriptRunner
{
    public static void main(String[] args)
    {
        Map<String,Object> context = new HashMap<String,Object>();
        for (;;)
        {
            try
            {
                StringBuilder sb = new StringBuilder();
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                for (;;)
                {
                    System.out.print("> ");
                    String line = br.readLine();
                    if (line.trim().length() == 0) break;
                    sb.append(line);
                    sb.append('\n');
                }
                String script = sb.toString();
                if (script.trim().length() == 0)
                {
                    System.out.println("DONE");
                    return;
                }
                parser parser = new parser(new Scanner(new StringReader(script)));
                Symbol symbol = parser.parse();
                Instruction instr = (Instruction) symbol.value;
                Validator validator = new Validator();
                instr.acceptVisitor(validator);
                if (! validator.getUnusedVariables().isEmpty())
                {
                    System.out.println("Warning: Unused variables: " +
                            setToString(validator.getUnusedVariables()));
                }
                if (! validator.getUndefinedVariables().isEmpty())
                {
                    System.out.println("Error: Undefined variables: " + 
                            setToString(validator.getUndefinedVariables()));
                }
                else
                {
                    Evaluator evaluator = new Evaluator(context);
                    BigInteger result = instr.acceptVisitor(evaluator);
                    System.out.println("---> " + result);
                }
            }
            catch (Exception ex)
            {
                //System.out.println(ex.getMessage());
                ex.printStackTrace();
            }
        }
    }
    
    private static String setToString(Set<String> set)
    {
        return set.toString();
    }
}
