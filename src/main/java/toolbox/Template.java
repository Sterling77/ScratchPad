package toolbox;

/**
 * Created by Letricia on 7/13/16.
 */
public class Template {
    // this is a variable - access modifier (public) with type (int) name (a) equals or receives a a value of (7)
    public int a = 7;
    // this is a variable type called boolean. with an access modifier
    public boolean isCat = true;

    double mark = 22.5;
        /*
        an object variable is a container
         */
    String name = "Chaz";       // String is a class which is an object???

        //the following is a method called main - with a public access modifier that returns a void???. _name_receives
    public static void main (String[] args) {

    }
    double chaz () {
        return a+mark;
    }
    double chaz (int i, double d) {     // result Name (receives)
        double e = i+d;
        return e;
    }
      // method - access modifier returns name receives
    public double newby(int firstNumber, int secondNumber) {
        double z = firstNumber+secondNumber;
        return z;
    }

 }
        //  modifier result name   (receives            receives)
        //  public   double newby(int firstNumber, int secondNumber) {
        //  double z = firstNumber+secondNumber;
        //    return z;
        // }