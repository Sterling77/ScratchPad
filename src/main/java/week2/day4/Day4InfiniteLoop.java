package week2.day4;

/**
 * Created by Letricia on 7/20/16.
 */
public class Day4InfiniteLoop {
    public static void main(String[] args) {
        boolean shouldLoopEnd = false;
        int targetNumber = (int) (Math.random() * 100);
        System.out.println ("The target number is: " + targetNumber);
        while (!shouldLoopEnd) {
            int guessNumber = (int) (Math.random() * 100);
            System.out.println ("The loop guesses: " + guessNumber);
            if (guessNumber == targetNumber) {
                shouldLoopEnd = true;
            }
            if (shouldLoopEnd) {
                System.out.println ("Woo hoo! We have a match!");
            } else {
                System.out.println ("Let's try again..");
            }
        }
    }

}
