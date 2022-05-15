import java.util.ArrayList;
import java.util.Arrays;

public class App {
    public static void main(String[] args) throws Exception {
        Dog max = new Dog(100, "Max", "blue");                          //Creating several animals from the parent Animal class
        Cat tom = new Cat(20, "Tom", 13.5);
        Dog nova = new Dog(25, "nova", "brown");
        Cat midnight = new Cat(9, "midnight", 5);

        ArrayList<Integer> intArr = new ArrayList<Integer>(Arrays.asList(103,104,108)); //updated to ArrayList<>, wiht Integers and set the values int he array
        ArrayList<Character> chArr = new ArrayList<Character>(Arrays.asList('X','T','A'));//updated to ArrayList<>, with Characters inside        
        ArrayList<Animal> animals = new ArrayList<>(Arrays.asList(max,tom,nova,midnight)); //updated to ArrayList<>, with Animinal insde
        
        Generics<Integer> intTest = new Generics<Integer>(intArr,108);            //passes the int array into intTest
        Generics<Character> charTest = new Generics<>(chArr,'T');     //passes the char array into charTest
        Generics<Animal> animalTest = new Generics<>(animals, tom);        //passes the Animal array into 
        
    
        System.out.println(intTest.findValue());                    //calls the original method to print it to the screen witht he different ArrayLists
        System.out.println(charTest.findValue());
        System.out.println(animalTest.findValue());
       
        Comparing comparTest = new Comparing(6);                    //creating objects that have the returnValue method that forces a number to be pased through
        Comparing comparTest2 = new Comparing(12);
        greaterThan(comparTest, comparTest2);                       //calling the method betlow to compare the current value in the returnValue method.
        System.out.println(greaterThan(comparTest, comparTest2));
    }
    public static <E,K> int greaterThan(E thing1, K thing2){            //Not sure if this should be in the main App class
        if(((Comparing) thing1).returnValue() > ((Comparing) thing2).returnValue()){
            return (int) ((Comparing) thing1).returnValue();
            
        }else{
            return (int) ((Comparing) thing2).returnValue();
        }
   }

   
}
