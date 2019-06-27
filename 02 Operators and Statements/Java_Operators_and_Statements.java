package cursus.oca.se;
class Java_Operators_and_Statements
{
  public static void main(String...args){
    System.out.println("Java Operators");
    OrderOfOperator o=new OrderOfOperator();
    new UsingOperators();
    new IfThenElse();
    new SwitchStatement();
    new WhileStatement();
    new ForStatement();
    new UsingLabels();
  }
}
class UsingLabels
{
  {
    //1. single word proceeded with colon :
    //2. if does not allow break or cotinue (conflicts with else)
    //3. switch only break
    System.out.println("Using labels");
    int i=1;

    //also allowed
breakit:
    {
      break breakit;
    }

OUTER_LOOP:
    for(;;){
      System.out.println("- OuTER LOOP");
INNER_LOOP:
      for(;;){
        System.out.println("- INNER LOOP");
allowed_label_but_not_usable:
        if( i++ == 1 ){
          System.out.println("- continue outer LOOP");
          continue OUTER_LOOP;
        }else{
          System.out.println("- break inner LOOP");
          break INNER_LOOP;
        }
      }
      System.out.println("- Inner loop exit");
      break;
    }
    System.out.println("- Outer loop exit");
  }
}

class ForStatement
{
  {
    //1. two types basic and enhanced
    //2. for parms are optional(see Infinite loop)
    //3. multiple terms are separated by ,
    System.out.println("For Statement");
    for(int i=1;i < 2;i++){
      System.out.println("- For Statement i="+i);
    }
    
    for(;;){
      System.out.println("- Infinite Loop");
      break;
    }

    //Enhanced loop
    //1. must be of type array, or implements java.lang.Iterable
    int array[]={1,2,3,4};
    for( int i : array){
      System.out.println("- Enhanced loop i="+i);
    }

  }
}

class WhileStatement
{
  {
    System.out.println("While Statement");
    //1. curlies {} are optional for single statements
    int i=1;
    while(i++==1) System.out.println("- while once");
    do System.out.println("- do while"); while(i++==1);
  }
}
class SwitchStatement
{
  {
    System.out.println("Switch Statement");
    //1. values that can be promoted to int, enum and wrapper classes
    //2. Boolean and long are not supported
    //3. case values are const values of same type as switch value, only literals, enum constants or final
    short i=3;
    char c='1';//translates to int
    String s="1";//also works
    switch(s){
      //1. do first match
      //2. run next, if no break
      default: System.out.println("switch default");
      case "1": System.out.println("switch case 1");
      case "2": System.out.println("switch case 2");
    }
  }

}
class IfThenElse
{
  {
    //1. if 0, only exception and allowed by compiler 
    if( false ) System.out.println("Exception while(false):error: unreachable statement");
    System.out.println("If then else statements:");
    int hourOfDay=1;
    if(hourOfDay == 11) {
      System.out.println("- first if");
    } else if(hourOfDay < 15) {
      System.out.println("- if else");
    } else {
      System.out.println("- Else");
    }

    int y = 10;
    int x =  y > 5 ? y++ : y--; //Only in assignment
    String s= hourOfDay == 11  ?  "- first if" : "- Else";
    System.out.println("s="+s);
    
  }
  
}
class OrderOfOperator
{
  /* Order of operators
   * Post-Pre e++,e--
   * Sign     +,-,!
   * Multiply *,/,%
   * Add      +,-
   * Shift    <<,>>,>>>
   * relate   <,>,<=,>=,instanceof
   * Equal    ==,!=
   * Logical  &,^,|
   * Binair   &&,||
   * Ternairy boolean e ? e : e;
   * Assign =,+=,-=,/=,&=,^=,!=,<<=,>>=,>>>=
   */
  {
    System.out.println("Order:");
    int a=1;
    double d;
    float f;
    /* compiler steps (page56)
     * 1. smaller types(byt,short,char) are promoted to int first
     * 2. Automatic promotion bigger datatype
     * 3. store result
     */
    a =  1 + (int)1.0;
    d =  1 + 1.0;
    f = 1 + 1.0f;
    //f = 1 + 1.0; Will not compile float requires n.nf format, f= 1 + 1 will compile

    //++ --
    a++;//function returns old value ++
    --a;//function returns new value --

    int x=3,y= ++x * 5  / x--  +   x; 
    //         ++3 * 5  / x--  +   x ;x=3 ++-- function returns org or new value
    //           4 * 5  / 4--  +   x ;x=4 ++-- function returns org or new value
    //           4 * 5  / 4    +   3 ;x=3
    //           7  ;x=2
    System.out.println( "x=3,y= ++x * 5 / x-- + x; y = "+y);
    System.out.println( "x="+x);

  }
}

class UsingOperators
{
  {
  short a=1;
  short b=2;
  short c=1 + 2 * 5/1 ;
  //short c=3 + 1 + a; does not compile, a is converted to int
  System.out.println("short c = " + c );
  }

  {//impliciet casts
    int i=1;
    long l=1;
    i = i * (int)l;//Error without cast
    i *= l;//automatic casts
    System.out.println("automatic cast i *= l = " + i );
  }
  {
    int y,x;
    y = x = 3;
    System.out.println(" y = x = 3; y=" + y +",x=" +x);
  }

}
