package week1.day3;

/**
 * Created by Letricia on 7/14/16.
 */
public class Day3FibonacciWithRecursion {
    static int n1=0, n2=1, n3=0;

    public static void main(String args[]){
        //Day3FibonacciWithRecursion day3FibonacciWithRecursion = new Day3FibonacciWithRecursion{};
        // This is creating an
        // instance???? I would still need to remove public  in the main and static on line 17 in order for this to work.

        int count=10;
        System.out.print(n1+" "+n2);//printing 0 and 1
        printFibonacci(count-2);//n-2 because 2 numbers are already printed
    }

    static void printFibonacci(int count){
        if(count>0){
            // Start by setting n3, n2, and n1
            n3 = n1 + n2;
            n1 = n2;
            n2 = n3;
            // print out a space and n3
            System.out.print(" "+n3);
            // use recursion and pass in the new count
            printFibonacci(count-1);
        }
    }

}
