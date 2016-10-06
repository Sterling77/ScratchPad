package toolbox.collections;
import java.util.ArrayList;


/**
 * Created by Letricia on 7/19/16.
 */
public class ArrayListExample {
    // Create a new ArrayList named name that holds Strings
    ArrayList<String> names = new ArrayList<>();

    public static void main(String[] args){
        ArrayListExample arrayListExample = new ArrayListExample();
        arrayListExample.addElement("Bob");
        arrayListExample.addElement("Sally");
        arrayListExample.addElement("Tom");
        arrayListExample.addElement("Jill");
        arrayListExample.addElement("Twinkle Toes");
        System.out.println("Element at 4:" + arrayListExample.getElement(4));
        System.out.println("_______________");
        arrayListExample.printAllElements();
    }

    // add another String to the ArrayList
    public void addElement(String name) {
        names.add(name);
    }

    // get a String from the ArrayList at a specific index
    public String getElement(int index) {
        return names.get(index);

    }

    // print out all the Strings in the ArrayList
    public void printAllElements() {
        for(String name : names)
            System.out.println(name);
    }

}
