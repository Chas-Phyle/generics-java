import java.util.*;

public class Generics <E> {         //creats a new generic class for Elements
    private ArrayList<E> elements;
    private E position;
    private int t;

    public Generics(ArrayList<E> elements, E position) {
		this.elements = elements;
        this.position = position;
	}
   public int findValue(){
    this.t =  elements.indexOf(position) ;    //updated to use the new ArrayList<E> instead of for loop for an array
    return t;                           //changed to this.t incase we want to use t somewhere else in the class
   }
}
