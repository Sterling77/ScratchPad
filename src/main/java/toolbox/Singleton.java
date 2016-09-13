package toolbox;

/**
 * Created by Letricia on 7/20/16.
 */
public class Singleton {
    private static Singleton instance = null;

    private Singleton() {
        // Exists only to defeat instantiation.
    }
    public static synchronized Singleton getInstance() {
        if(instance == null) {
            instance = new Singleton();
        }
        return instance;
    }


    // --- Must Have 3 Things ---
    /* 1) Constructor must be private - to defeat instantiation ......A constructor is a guaranteed to run anytime
     someone instantiates this class. It must have the same name as the class.
    */

    // 2) Must have a Private Static instance of itself
    // 3) Must have a Public Static Synchronized getInstance method to control access

}
//Dog d = new Dog ("spot");    >>>>>>>> instantiated dog


