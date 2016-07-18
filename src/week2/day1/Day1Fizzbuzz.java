package week2.day1;

/**
 * Created by Letricia on 7/18/16.
 */
public class Day1Fizzbuzz {

        public static void main(String[] args) {
            thisWay();
            thatWay();
        }
        public static void  thisWay() {

            // count from 1 to 100 (loop?)
            for (int i = 1; i <= 100; i++) {
                String returnThis = "";
                // check if divisible by 3 --print fizz

                if (i % 3 == 0) {
                    returnThis += "fizz";

                }
                // check if divisible by 5 -- print buzz
                if (i % 5 == 0) {
                    returnThis += "buzz";

                } //else if ((i % 3 == 0) && (i % 5 == 0)) {
                // System.out.println("fizzbuzz");


                // check if divisible by 3 -- print Fizz
                // check if divisible by 5 -- print Buzz
                // if we have a word, print it, else print the number

                // if we have a word, print it, else print the number
                if (returnThis.isEmpty()) {
                    System.out.println();
                } else {
                    System.out.println(returnThis);
                }
            }
        }


        public static void thatWay() {
            for(int i=1; i<=100; i++) {

                if (i % 15 == 0) {
                    System.out.println("FizzBuzz");
                } else if (i % 5 == 0) {
                    System.out.println("Buzz");

                } else if (i % 3 == 0) {
                    System.out.println("Fizz");
                } else {
                    System.out.println(i);
                }
            }
        }
}


