package cursus.oca.se;
/*
 * Head 03 
 * 1. Using Operators and Decision Constructs
 * 2. Creating and Using Arrays
 * 3. Working with Selected classes from the Java API
 * 4. Working with Java Data Types
 */
class Java_Core_API
{
  public static void main(String...args){
    System.out.println("Java Core API");
    new CreatingAndManipulatingStrings();
    new TestStringBuilder();
    new Template();
  }
}
class TestStringBuilder
{
  {
    System.out.println("Test StringBuilder");
  }
}

class CreatingAndManipulatingStrings
{
  {
    System.out.println("Creating and Manipulating Strings");
  }
  {//String class is special and doesn’t need to be instantiated with new
    String name1="Fluffy"; //No new object
    String name2=new String("Fluffy");//Create new class/object
    System.out.print("- "); System.out.println(1 + 2);
    System.out.print("- "); System.out.println("a" + "b");
    System.out.print("- "); System.out.println(1 + 2 + "c");//expression evaluated left to right, outputs 3c
  }
  {
    String s="1";
    s+=2;
    System.out.println("- s="+s);//s=12
    s=s.concat("3");
    System.out.println("- s="+s);//s=123
  } 
  { //String methods
    String s="0123456789";
    System.out.println("- String is '" + s +"'");
    System.out.println("- String length() is '" + s.length() +"'");
    System.out.println("- String charAt(2) is '" + s.charAt(2) +"'");
    System.out.println("- String indexOf('2') is '" + s.indexOf('2') +"'");
    System.out.println("- String substring(1,3) is '" + s.substring(1,3) +"'");
    System.out.println("- String substring(8) is '" + s.substring(8) +"'");
    System.out.println("- String chaining substring(1).substring(8) is '" + s.concat("number").substring(1).substring(8) +"'");
  }
  {
      String result = "AniMaL ".trim().toLowerCase().replace('a', 'A');//Evaluate left to right!!
      System.out.println("- left to right 'AniMal'-> "+result);
  }
}
class Template
{
  {
    System.out.println("End of Test");
  }
}

