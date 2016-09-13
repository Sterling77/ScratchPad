package week1.day1;

/**
 * Created by Letricia on 7/11/16.
 */
public class Day1Fixit {

    private static int x = 12;
    private static int y = 28;
    private static double z = 3.3;

    public void main(String[] args) {
        System.out.println("The answer to(x * y) / 3 is"+calculate());
    }
    private static double calculate(){
       return  (x * y) / z;

        }
}
