package cursus.oca.se;
import java.util.List;
import java.util.ArrayList;
import java.util.function.Predicate;
class Java_lambda
{
  public static void main(String...args){
    System.out.println("Java lambda");
    new Test();
		String inp[]={"hoi"} ;
		TraditionalSearch.main(null);
  }
}
class Test
{
  {
    System.out.println("Test");
  }
}
/*
class CheckIfHopper implements CheckTrait {
  public boolean test(Animal a) {
    return a.canHop();
  }
}
*/
// https://www.freecodecamp.org/news/learn-these-4-things-and-working-with-lambda-expressions-b0ab36e0fffc/
// maar 1 methode

//Via standard import
/*
interface CheckTrait {
  boolean test(Animal parm);
}
*/
class Animal {
  private String species;
  private boolean canHop;
  private boolean canSwim;
  public Animal(String speciesName, boolean hopper, boolean swimmer) {
    species = speciesName;
    canHop = hopper;
    canSwim = swimmer;
  }
  public boolean canHop() { return canHop; }
  public boolean canSwim() { return canSwim; }
  public String toString() { return species; }
}
class TraditionalSearch {
  public static void main(String[] args) {
    List<Animal> animals = new ArrayList<Animal>(); // list of animals
    animals.add(new Animal("fish", false, true));
    animals.add(new Animal("kangaroo", true, false));
    animals.add(new Animal("rabbit", true, false));
    animals.add(new Animal("turtle", false, true));

    //print(animals, new CheckIfHopper()); // pass class that does check
		print(animals, parm -> parm.canHop());
		print(animals, parm -> parm.canHop() == true);
		print(animals, parm -> ! parm.canHop() == true);
		print(animals, (a) -> { return true ;});
  }

  // 1. chekcer interface parm is Animal 
  // 2.  checker.test( parm ) ==>  maps to lambda expression and parm is Animal
	//private static void print(List<Animal> animals, CheckTrait checker) { 
	private static void print(List<Animal> animals, Predicate<Animal> checker) { 
		for (Animal animal : animals) {
			if (checker.test(animal)) // the general check
					System.out.print(animal + " ");
		}
		System.out.println();
	}
}
