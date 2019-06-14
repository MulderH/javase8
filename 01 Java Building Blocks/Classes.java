package test;//First lin in the file
import java.util.Random;
// 1. imports first line after package
// 2. imports alias Random -> java.util.Random
// 3. import java.util.* imports all classis in java.util, and only one * wildcard that works
// 4. Package name format is same as variable names format
// 5. static import ... chapter 4 TODO
// 6. java.lang package is automaticaly imported
// 7. classes in same package are automaticaly imported
// 8. don't use import, but use fqn in source java.util.Random r = new java.util.Random();
// 9. exam tip, make sure imports aren't missing

// class: parts and chararcteristics of a buildingblock
// java building blocks:
//   - class
//   - interface
//   - enums
// object: runtime instance of a class 
// vars: define state of object
//
//

/**
 * Javadoc multiple-line comment, starts with /**.
 * @author Hans Mulder
 */

/**
 * Classes
 * - more then one in a file
 * - only one class can be public
 * - filename same as public class <name>.java
 * - classname and file is case sensitive.
 */
public class Classes
{
  static int j=1; //static only in class context, reachable from static context
  { // instance initializer, code outside a methode

    //static int j=1; not allowed here
    int i=1;
    System.out.println("Class loaded, and Instance initilized");
  }
  /** Signature main
   * public : acces modifier
   * static : binding to class
   * void   : return type
   * args   : String[] args,String args[], String...args
   */
  //java main method
  // - method signature
  // - exec entrypoint point
  public static void main(String args[]){
    System.out.print("Random between 0-9:");
    Random r = new Random();
    System.out.println("static j =" + j);//Number between 0-9
    //When not imported, you can say java.util.Random r = new java.util.Random();
    System.out.println(r.nextInt(10));//Number between 0-9
    Classes c = new Classes();//loads class
    { // code block, code inside methode between {}
      System.out.println("static j =" + j);//Number between 0-9
      //System.out.println("i =" + i);//Number between 0-9
    }

    //Order of initialization
    OrderOfInitialization Order=new OrderOfInitialization();
    Order.print();

    Primitives p=new Primitives();
    DefaultInitialization initIt=new DefaultInitialization();
  }
}

// OrderOfInitialization
// 1. Fields and initializer blocks, in file-line order
// 2. constructor
class OrderOfInitialization
{
  static {System.out.println("Order of initialization");}
  private int number=3;              //1.first set number=3
  { number = 4;}                     //2.second set number=4
  public OrderOfInitialization(){
    number=5;                        //3.set number=5, call constructor
  }
  public void print(){
    System.out.println(" 1. Order number=" + number);
  }
}

// Objects and Primitives
class Primitives
{
  {System.out.println("Primitives:");}
  boolean a=true;//true or false
  byte    b=123;//8-bit, range -128 - 127
  short   s=1234;//16-bit
  int     i=32;//32-bit
  long    l=6464;//64-bit
  float   f=1.2F;//32bit float, requires letter-[fF], else double
  double  d=2.3;//64bit float, default with decimal point, else byte,short,int or long
  char    c='c';//16-bit unichar
  // 1. all numbers/literals are signed
  // 2. decimal point defaults to double
  // 3. all numbers are ints, so defining larger number requires a post L or l
  // 4. all primitives are lower case

  //
  //long max = 12345678900;  error: integer number too large: 12345678900
  long max = 12345678900l;  //error: integer number too large: 12345678900
  {
    System.out.println(" 1. long value of max is "+max);
  }

  {//base of numbers
    System.out.println(" 2. Octal starts with char 0, 011 = " + 011);
    System.out.println(" 3. Hex starts with char 0[xX], 0x11 = " + 0x00_11);
    System.out.println(" 4. Binairy starts with char 0[bB], 0B11 = " + 0B11);
    System.out.println(" 5. Use of underscores 1_000_000 =" + 1_000_000);
  }

  { //boolean
    boolean b=true,c=false,d;
    System.out.println("6. boolen is " + b);
  }
  { //declaring
    int i1, i2,i4=1;
    System.out.println("int i1 is " + i4);
  }

  {//Identifier names
    //name must start with [a-Z$_][a-Z0-9$_]*
    //1. can not start with number
    //2. @ is not allowed
    int $1=0;
    int $$1=0;
    int _1=1;
    int Const=1;//But not reserved word 'const',asser,case,if ...
  }

}

class DefaultInitialization
{
  {
    System.out.println("Initialization of the class:");
  }
  boolean b;
  int i;
  char t;
  {
    System.out.println(" 1. boolean defaults to " + b);
    System.out.println(" 2. numbers defaults to " + i);
    System.out.println(" 3. char  defaults to  NULL-cahr or '\u0000'" + t);
    System.out.println(" 4. all objects refs are 'null'");
  }
  public void test(){
    boolean bb;
    //System.out.println("boolean defaults to " + bb); ERROR not initialized
  }
}

//scope of vars
class ScopeVars
{
  static int classScope=1; //Always present
  int instanceScope=2;// After new()
  public static void test01(){
    System.out.println(" test01 ");
  }
  public void test02(int i){
    if(true){
      //int i=2; ERROR already defined
      System.out.println(" i = " + i);
    }
  }


}

class GarbageCollection
{
  protected void finalize()
  {
    System.out.println("Run when there are no references, then only once or never, not guarantee!!");
  }
}

/**
 * Compiler error if more then one public classe.
 *  error: class hoi is public, should be declared in a file named hoi.java
 *  public class hoi { }
 */

