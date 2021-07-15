
//----------------------------------------------------
// The following code was generated by CUP v0.11b 20160615 (GIT 4ac7450)
//----------------------------------------------------

package ch.ffhs.ti.umk.skript.parser;

import java.util.ArrayList;
import java_cup.runtime.*;
import ch.ffhs.ti.umk.skript.instr.*;
import java_cup.runtime.XMLElement;

/** CUP v0.11b 20160615 (GIT 4ac7450) generated parser.
  */
@SuppressWarnings({"rawtypes"})
public class parser extends java_cup.runtime.lr_parser {

 public final Class getSymbolContainer() {
    return sym.class;
}

  /** Default constructor. */
  @Deprecated
  public parser() {super();}

  /** Constructor which sets the default scanner. */
  @Deprecated
  public parser(java_cup.runtime.Scanner s) {super(s);}

  /** Constructor which sets the default scanner. */
  public parser(java_cup.runtime.Scanner s, java_cup.runtime.SymbolFactory sf) {super(s,sf);}

  /** Production table. */
  protected static final short _production_table[][] = 
    unpackFromStrings(new String[] {
    "\000\024\000\002\002\004\000\002\002\005\000\002\003" +
    "\002\000\002\003\004\000\002\011\002\000\002\011\003" +
    "\000\002\004\006\000\002\005\003\000\002\005\004\000" +
    "\002\005\005\000\002\005\005\000\002\006\003\000\002" +
    "\006\005\000\002\006\005\000\002\006\005\000\002\007" +
    "\003\000\002\007\005\000\002\010\003\000\002\010\003" +
    "\000\002\010\005" });

  /** Access to production table. */
  public short[][] production_table() {return _production_table;}

  /** Parse-action table. */
  protected static final short[][] _action_table = 
    unpackFromStrings(new String[] {
    "\000\042\000\012\005\uffff\013\uffff\016\uffff\017\uffff\001" +
    "\002\000\004\002\044\001\002\000\012\005\006\013\012" +
    "\016\010\017\016\001\002\000\010\013\012\016\010\017" +
    "\021\001\002\000\012\002\ufffd\004\023\005\024\015\041" +
    "\001\002\000\024\002\uffef\004\uffef\005\uffef\006\uffef\007" +
    "\uffef\010\uffef\011\uffef\014\uffef\015\uffef\001\002\000\012" +
    "\005\ufffe\013\ufffe\016\ufffe\017\ufffe\001\002\000\012\005" +
    "\006\013\012\016\010\017\021\001\002\000\022\002\ufffa" +
    "\004\ufffa\005\ufffa\006\030\007\027\010\026\014\ufffa\015" +
    "\ufffa\001\002\000\024\002\ufff2\004\ufff2\005\ufff2\006\ufff2" +
    "\007\ufff2\010\ufff2\011\035\014\ufff2\015\ufff2\001\002\000" +
    "\022\002\ufff6\004\ufff6\005\ufff6\006\ufff6\007\ufff6\010\ufff6" +
    "\014\ufff6\015\ufff6\001\002\000\024\002\ufff0\004\ufff0\005" +
    "\ufff0\006\ufff0\007\ufff0\010\ufff0\011\ufff0\012\017\015\ufff0" +
    "\001\002\000\012\005\006\013\012\016\010\017\021\001" +
    "\002\000\010\004\023\005\024\015\022\001\002\000\024" +
    "\002\ufff0\004\ufff0\005\ufff0\006\ufff0\007\ufff0\010\ufff0\011" +
    "\ufff0\014\ufff0\015\ufff0\001\002\000\012\005\ufffb\013\ufffb" +
    "\016\ufffb\017\ufffb\001\002\000\010\013\012\016\010\017" +
    "\021\001\002\000\010\013\012\016\010\017\021\001\002" +
    "\000\022\002\ufff7\004\ufff7\005\ufff7\006\030\007\027\010" +
    "\026\014\ufff7\015\ufff7\001\002\000\010\013\012\016\010" +
    "\017\021\001\002\000\010\013\012\016\010\017\021\001" +
    "\002\000\010\013\012\016\010\017\021\001\002\000\022" +
    "\002\ufff5\004\ufff5\005\ufff5\006\ufff5\007\ufff5\010\ufff5\014" +
    "\ufff5\015\ufff5\001\002\000\022\002\ufff4\004\ufff4\005\ufff4" +
    "\006\ufff4\007\ufff4\010\ufff4\014\ufff4\015\ufff4\001\002\000" +
    "\022\002\ufff3\004\ufff3\005\ufff3\006\ufff3\007\ufff3\010\ufff3" +
    "\014\ufff3\015\ufff3\001\002\000\022\002\ufff8\004\ufff8\005" +
    "\ufff8\006\030\007\027\010\026\014\ufff8\015\ufff8\001\002" +
    "\000\010\013\012\016\010\017\021\001\002\000\022\002" +
    "\ufff1\004\ufff1\005\ufff1\006\ufff1\007\ufff1\010\ufff1\014\ufff1" +
    "\015\ufff1\001\002\000\010\004\023\005\024\014\040\001" +
    "\002\000\024\002\uffee\004\uffee\005\uffee\006\uffee\007\uffee" +
    "\010\uffee\011\uffee\014\uffee\015\uffee\001\002\000\004\002" +
    "\ufffc\001\002\000\004\002\000\001\002\000\022\002\ufff9" +
    "\004\ufff9\005\ufff9\006\030\007\027\010\026\014\ufff9\015" +
    "\ufff9\001\002\000\004\002\001\001\002" });

  /** Access to parse-action table. */
  public short[][] action_table() {return _action_table;}

  /** <code>reduce_goto</code> table. */
  protected static final short[][] _reduce_table = 
    unpackFromStrings(new String[] {
    "\000\042\000\006\002\003\003\004\001\001\000\002\001" +
    "\001\000\014\004\010\005\006\006\012\007\014\010\013" +
    "\001\001\000\010\006\042\007\014\010\013\001\001\000" +
    "\004\011\041\001\001\000\002\001\001\000\002\001\001" +
    "\000\012\005\036\006\012\007\014\010\013\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\012\005\017\006\012\007\014\010\013\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\010\006\033\007\014\010\013\001\001\000\010\006" +
    "\024\007\014\010\013\001\001\000\002\001\001\000\006" +
    "\007\032\010\013\001\001\000\006\007\031\010\013\001" +
    "\001\000\006\007\030\010\013\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\006\007\035\010\013\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001" });

  /** Access to <code>reduce_goto</code> table. */
  public short[][] reduce_table() {return _reduce_table;}

  /** Instance of action encapsulation class. */
  protected CUP$parser$actions action_obj;

  /** Action encapsulation object initializer. */
  protected void init_actions()
    {
      action_obj = new CUP$parser$actions(this);
    }

  /** Invoke a user supplied parse action. */
  public java_cup.runtime.Symbol do_action(
    int                        act_num,
    java_cup.runtime.lr_parser parser,
    java.util.Stack            stack,
    int                        top)
    throws java.lang.Exception
  {
    /* call code in generated class */
    return action_obj.CUP$parser$do_action(act_num, parser, stack, top);
  }

  /** Indicates start state. */
  public int start_state() {return 0;}
  /** Indicates start production. */
  public int start_production() {return 0;}

  /** <code>EOF</code> Symbol index. */
  public int EOF_sym() {return 0;}

  /** <code>error</code> Symbol index. */
  public int error_sym() {return 1;}


/** Cup generated class to encapsulate user supplied action code.*/
@SuppressWarnings({"rawtypes", "unchecked", "unused"})
class CUP$parser$actions {
  private final parser parser;

  /** Constructor */
  CUP$parser$actions(parser parser) {
    this.parser = parser;
  }

  /** Method 0 with the actual generated action code for actions 0 to 300. */
  public final java_cup.runtime.Symbol CUP$parser$do_action_part00000000(
    int                        CUP$parser$act_num,
    java_cup.runtime.lr_parser CUP$parser$parser,
    java.util.Stack            CUP$parser$stack,
    int                        CUP$parser$top)
    throws java.lang.Exception
    {
      /* Symbol object for return from actions */
      java_cup.runtime.Symbol CUP$parser$result;

      /* select the action based on the action number */
      switch (CUP$parser$act_num)
        {
          /*. . . . . . . . . . . . . . . . . . . .*/
          case 0: // $START ::= SCRIPT EOF 
            {
              Object RESULT =null;
		int start_valleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int start_valright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		Instruction start_val = (Instruction)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		RESULT = start_val;
              CUP$parser$result = parser.getSymbolFactory().newSymbol("$START",0, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          /* ACCEPT */
          CUP$parser$parser.done_parsing();
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 1: // SCRIPT ::= ASSIGNMENT_LIST SUM ENDE 
            {
              Instruction RESULT =null;
		int alleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int alright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		ArrayList<Instruction> al = (ArrayList<Instruction>)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		int sleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int sright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		Instruction s = (Instruction)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		 RESULT = new InstructionScript(al, s); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("SCRIPT",0, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 2: // ASSIGNMENT_LIST ::= 
            {
              ArrayList<Instruction> RESULT =null;
		  RESULT = new ArrayList<Instruction>(); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("ASSIGNMENT_LIST",1, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 3: // ASSIGNMENT_LIST ::= ASSIGNMENT_LIST ASSIGNMENT 
            {
              ArrayList<Instruction> RESULT =null;
		int alleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int alright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		ArrayList<Instruction> al = (ArrayList<Instruction>)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		int aleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int aright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Instruction a = (Instruction)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		  RESULT = al;
                       RESULT.add(a); 
                   
              CUP$parser$result = parser.getSymbolFactory().newSymbol("ASSIGNMENT_LIST",1, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 4: // ENDE ::= 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("ENDE",7, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 5: // ENDE ::= SEP 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("ENDE",7, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 6: // ASSIGNMENT ::= NAME ASSIGN SUM SEP 
            {
              Instruction RESULT =null;
		int nleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)).left;
		int nright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)).right;
		String n = (String)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-3)).value;
		int sleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int sright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		Instruction s = (Instruction)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		 RESULT = new InstructionSetVariable(n, s); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("ASSIGNMENT",2, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 7: // SUM ::= PRODUCT 
            {
              Instruction RESULT =null;
		int pleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int pright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Instruction p = (Instruction)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT = p; 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("SUM",3, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 8: // SUM ::= MINUS PRODUCT 
            {
              Instruction RESULT =null;
		int pleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int pright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Instruction p = (Instruction)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT = new InstructionNegate(p); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("SUM",3, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 9: // SUM ::= SUM PLUS PRODUCT 
            {
              Instruction RESULT =null;
		int sleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int sright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		Instruction s = (Instruction)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		int pleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int pright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Instruction p = (Instruction)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT = new InstructionBinaryOperation(BinaryOperator.PLUS, s, p); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("SUM",3, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 10: // SUM ::= SUM MINUS PRODUCT 
            {
              Instruction RESULT =null;
		int sleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int sright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		Instruction s = (Instruction)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		int pleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int pright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Instruction p = (Instruction)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT = new InstructionBinaryOperation(BinaryOperator.MINUS, s, p); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("SUM",3, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 11: // PRODUCT ::= POWER 
            {
              Instruction RESULT =null;
		int ppleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int ppright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Instruction pp = (Instruction)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT = pp; 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("PRODUCT",4, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 12: // PRODUCT ::= PRODUCT TIMES POWER 
            {
              Instruction RESULT =null;
		int pleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int pright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		Instruction p = (Instruction)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		int ppleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int ppright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Instruction pp = (Instruction)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT = new InstructionBinaryOperation(BinaryOperator.TIMES, p, pp); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("PRODUCT",4, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 13: // PRODUCT ::= PRODUCT DIV POWER 
            {
              Instruction RESULT =null;
		int pleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int pright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		Instruction p = (Instruction)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		int ppleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int ppright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Instruction pp = (Instruction)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT = new InstructionBinaryOperation(BinaryOperator.DIV, p, pp); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("PRODUCT",4, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 14: // PRODUCT ::= PRODUCT MOD POWER 
            {
              Instruction RESULT =null;
		int pleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int pright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		Instruction p = (Instruction)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		int ppleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int ppright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Instruction pp = (Instruction)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT = new InstructionBinaryOperation(BinaryOperator.MOD, p, pp); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("PRODUCT",4, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 15: // POWER ::= SIMPLE_TERM 
            {
              Instruction RESULT =null;
		int stleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int stright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Instruction st = (Instruction)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT = st; 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("POWER",5, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 16: // POWER ::= SIMPLE_TERM POW POWER 
            {
              Instruction RESULT =null;
		int stleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int stright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		Instruction st = (Instruction)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		int ppleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int ppright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Instruction pp = (Instruction)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT = new InstructionBinaryOperation(BinaryOperator.POW, st, pp); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("POWER",5, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 17: // SIMPLE_TERM ::= NAME 
            {
              Instruction RESULT =null;
		int nleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int nright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		String n = (String)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT = new InstructionGetVariable(n); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("SIMPLE_TERM",6, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 18: // SIMPLE_TERM ::= NUMBER 
            {
              Instruction RESULT =null;
		int nleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int nright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		String n = (String)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT = InstructionConstant.integer(n); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("SIMPLE_TERM",6, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 19: // SIMPLE_TERM ::= LPAR SUM RPAR 
            {
              Instruction RESULT =null;
		int sleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int sright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		Instruction s = (Instruction)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		 RESULT = s; 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("SIMPLE_TERM",6, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /* . . . . . .*/
          default:
            throw new Exception(
               "Invalid action number "+CUP$parser$act_num+"found in internal parse table");

        }
    } /* end of method */

  /** Method splitting the generated action code into several parts. */
  public final java_cup.runtime.Symbol CUP$parser$do_action(
    int                        CUP$parser$act_num,
    java_cup.runtime.lr_parser CUP$parser$parser,
    java.util.Stack            CUP$parser$stack,
    int                        CUP$parser$top)
    throws java.lang.Exception
    {
              return CUP$parser$do_action_part00000000(
                               CUP$parser$act_num,
                               CUP$parser$parser,
                               CUP$parser$stack,
                               CUP$parser$top);
    }
}

}
