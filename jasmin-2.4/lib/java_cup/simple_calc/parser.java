
//----------------------------------------------------
// The following code was generated by Java(tm) CUP v0.9d
// Sun Jan 07 17:10:11 EST 1996
//----------------------------------------------------

import java_cup.runtime.*;

public class parser extends java_cup.runtime.lr_parser {

  /** constructor */
  public parser() {super();}

  /** production table */
  protected static final short _production_table[][] = {
        {1, 2},     {0, 2},     {1, 1},     {6, 0},     {2, 3}, 
        {3, 3},     {3, 3},     {3, 1},     {4, 3},     {4, 3}, 
        {4, 3},     {4, 1},     {5, 1},     {5, 2},     {5, 3}
      };

  /** access to production table */
  public short[][] production_table() {return _production_table;}

  /** parse action table */
  protected static final short[][] _action_table = {
    /*0*/{4,2,8,9,10,4,-1,0},
    /*1*/{4,2,8,9,10,4,-1,0},
    /*2*/{2,-12,3,-12,4,-12,5,-12,6,-12,7,-12,9,-12,-1,0},
    /*3*/{2,-13,3,-13,4,-13,5,-13,6,-13,7,-13,9,-13,-1,0},
    /*4*/{0,-3,4,-3,8,-3,10,-3,-1,0},
    /*5*/{2,-4,3,13,4,11,-1,0},
    /*6*/{0,23,4,2,8,9,10,4,-1,0},
    /*7*/{2,-8,3,-8,4,-8,5,16,6,17,7,15,9,-8,-1,0},
    /*8*/{4,2,8,9,10,4,-1,0},
    /*9*/{3,13,4,11,9,12,-1,0},
    /*10*/{4,2,8,9,10,4,-1,0},
    /*11*/{2,-15,3,-15,4,-15,5,-15,6,-15,7,-15,9,-15,-1,0},
    /*12*/{4,2,8,9,10,4,-1,0},
    /*13*/{2,-6,3,-6,4,-6,5,16,6,17,7,15,9,-6,-1,0},
    /*14*/{4,2,8,9,10,4,-1,0},
    /*15*/{4,2,8,9,10,4,-1,0},
    /*16*/{4,2,8,9,10,4,-1,0},
    /*17*/{2,-10,3,-10,4,-10,5,-10,6,-10,7,-10,9,-10,-1,0},
    /*18*/{2,-9,3,-9,4,-9,5,-9,6,-9,7,-9,9,-9,-1,0},
    /*19*/{2,-11,3,-11,4,-11,5,-11,6,-11,7,-11,9,-11,-1,0},
    /*20*/{2,-7,3,-7,4,-7,5,16,6,17,7,15,9,-7,-1,0},
    /*21*/{0,-1,4,-1,8,-1,10,-1,-1,0},
    /*22*/{0,-2,-1,0},
    /*23*/{2,25,-1,0},
    /*24*/{0,-5,4,-5,8,-5,10,-5,-1,0},
    /*25*/{2,-14,3,-14,4,-14,5,-14,6,-14,7,-14,9,-14,-1,0},
  };

  /** access to parse action table */
  public short[][] action_table() {return _action_table;}

  /** reduce_goto table */
  protected static final short[][] _reduce_table = {
    /*0*/{1,6,2,4,3,5,4,7,5,2,-1,-1},
    /*1*/{5,25,-1,-1},
    /*2*/{-1,-1},
    /*3*/{-1,-1},
    /*4*/{-1,-1},
    /*5*/{6,23,-1,-1},
    /*6*/{2,21,3,5,4,7,5,2,-1,-1},
    /*7*/{-1,-1},
    /*8*/{3,9,4,7,5,2,-1,-1},
    /*9*/{-1,-1},
    /*10*/{4,20,5,2,-1,-1},
    /*11*/{-1,-1},
    /*12*/{4,13,5,2,-1,-1},
    /*13*/{-1,-1},
    /*14*/{5,19,-1,-1},
    /*15*/{5,18,-1,-1},
    /*16*/{5,17,-1,-1},
    /*17*/{-1,-1},
    /*18*/{-1,-1},
    /*19*/{-1,-1},
    /*20*/{-1,-1},
    /*21*/{-1,-1},
    /*22*/{-1,-1},
    /*23*/{-1,-1},
    /*24*/{-1,-1},
    /*25*/{-1,-1},
  };

  /** access to reduce_goto table */
  public short[][] reduce_table() {return _reduce_table;}

  /** instance of action encapsulation class */
  protected CUP$actions action_obj;

  /** action encapsulation object initializer */
  protected void init_actions()
    {
      action_obj = new CUP$actions();
    }

  /** invoke a user supplied parse action */
  public java_cup.runtime.symbol do_action(
    int                        act_num,
    java_cup.runtime.lr_parser parser,
    java.util.Stack            stack,
    int                        top)
    throws java.lang.Exception
  {
    /* call code in generated class */
    return action_obj.CUP$do_action(act_num, parser, stack, top);
  }

  /** start state */
  public int start_state() {return 0;}
  /** start production */
  public int start_production() {return 1;}

  /** EOF symbol index */
  public int EOF_sym() {return 0;}

  /** error symbol index */
  public int error_sym() {return 1;}


  /** user initialization */
  public void user_init() throws java.lang.Exception
    {
 scanner.init();              
    }

  /** scan to get the next token */
  public java_cup.runtime.token scan()
    throws java.lang.Exception
    {
 return scanner.next_token(); 
    }
};

/** JavaCup generated class to encapsulate user supplied action code.*/
class CUP$actions {

  /** Constructor */
  CUP$actions() { }

  /** Method with the actual generated action code. */
  public final java_cup.runtime.symbol CUP$do_action(
    int                        CUP$act_num,
    java_cup.runtime.lr_parser CUP$parser,
    java.util.Stack            CUP$stack,
    int                        CUP$top)
    throws java.lang.Exception
    {
      /* object for return from actions */
      java_cup.runtime.symbol CUP$result;

      /* select the action based on the action number */
      switch (CUP$act_num)
        {
          /*. . . . . . . . . . . . . . . . . . . .*/
          case 14: // factor ::= LPAREN expr RPAREN 
            {
              CUP$result = new int_token(/*factor*/5);
               ((int_token)CUP$result).int_val = (/*e*/(int_token)CUP$stack.elementAt(CUP$top-1)).int_val;  
            }
          return CUP$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 13: // factor ::= MINUS factor 
            {
              CUP$result = new int_token(/*factor*/5);
               ((int_token)CUP$result).int_val = -(/*e*/(int_token)CUP$stack.elementAt(CUP$top-0)).int_val; 
            }
          return CUP$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 12: // factor ::= NUMBER 
            {
              CUP$result = new int_token(/*factor*/5);
               ((int_token)CUP$result).int_val = (/*n*/(int_token)CUP$stack.elementAt(CUP$top-0)).int_val;  
            }
          return CUP$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 11: // term ::= factor 
            {
              CUP$result = new int_token(/*term*/4);
               ((int_token)CUP$result).int_val = (/*e*/(int_token)CUP$stack.elementAt(CUP$top-0)).int_val; 
            }
          return CUP$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 10: // term ::= term MOD factor 
            {
              CUP$result = new int_token(/*term*/4);
               ((int_token)CUP$result).int_val = (/*e1*/(int_token)CUP$stack.elementAt(CUP$top-2)).int_val % (/*e2*/(int_token)CUP$stack.elementAt(CUP$top-0)).int_val; 
            }
          return CUP$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 9: // term ::= term DIVIDE factor 
            {
              CUP$result = new int_token(/*term*/4);
               ((int_token)CUP$result).int_val = (/*e1*/(int_token)CUP$stack.elementAt(CUP$top-2)).int_val / (/*e2*/(int_token)CUP$stack.elementAt(CUP$top-0)).int_val; 
            }
          return CUP$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 8: // term ::= term TIMES factor 
            {
              CUP$result = new int_token(/*term*/4);
               ((int_token)CUP$result).int_val = (/*e1*/(int_token)CUP$stack.elementAt(CUP$top-2)).int_val * (/*e2*/(int_token)CUP$stack.elementAt(CUP$top-0)).int_val; 
            }
          return CUP$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 7: // expr ::= term 
            {
              CUP$result = new int_token(/*expr*/3);
               ((int_token)CUP$result).int_val = (/*e1*/(int_token)CUP$stack.elementAt(CUP$top-0)).int_val; 
            }
          return CUP$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 6: // expr ::= expr MINUS term 
            {
              CUP$result = new int_token(/*expr*/3);
               ((int_token)CUP$result).int_val = (/*e1*/(int_token)CUP$stack.elementAt(CUP$top-2)).int_val - (/*e2*/(int_token)CUP$stack.elementAt(CUP$top-0)).int_val; 
            }
          return CUP$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 5: // expr ::= expr PLUS term 
            {
              CUP$result = new int_token(/*expr*/3);
               ((int_token)CUP$result).int_val = (/*e1*/(int_token)CUP$stack.elementAt(CUP$top-2)).int_val + (/*e2*/(int_token)CUP$stack.elementAt(CUP$top-0)).int_val; 
            }
          return CUP$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 4: // expr_part ::= expr NT$0 SEMI 
            {
              CUP$result = new symbol(/*expr_part*/2);
              
            }
          return CUP$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 3: // NT$0 ::= 
            {
              CUP$result = new java_cup.runtime.token(/*NT$0*/6);
               System.out.println("= " + (/*e*/(int_token)CUP$stack.elementAt(CUP$top-0)).int_val); 
            }
          return CUP$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 2: // expr_list ::= expr_part 
            {
              CUP$result = new symbol(/*expr_list*/1);
              
            }
          return CUP$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 1: // $START ::= expr_list EOF 
            {
              CUP$result = new java_cup.runtime.token(/*$START*/0);
              
            }
          /* ACCEPT */
          CUP$parser.done_parsing();
          return CUP$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 0: // expr_list ::= expr_list expr_part 
            {
              CUP$result = new symbol(/*expr_list*/1);
              
            }
          return CUP$result;

          /* . . . . . .*/
          default:
            throw new Exception(
               "Invalid action number found in internal parse table");

        }
    }
};
