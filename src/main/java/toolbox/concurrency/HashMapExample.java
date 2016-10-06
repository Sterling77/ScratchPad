
package toolbox.concurrency;

        import java.util.HashMap;
        import java.util.Set;


public class HashMapExample {
    HashMap<String, String> names = new HashMap<>();            // Create a new HashMap named names that holds String,String

    // add another key,value to the HashMap
    public void addElement(String key,String value) {
        names.put(key,value);
    }

    // get a value from the HashMap at a specific key
    public String getValue(String key) {
        return names.get(key);
    }

    // print out all the Strings in the HashMap
    public void printAllElements() {
        for(String name :  names.values()) { //returns a collections of strings
            System.out.println(name);
        }

    }

}

