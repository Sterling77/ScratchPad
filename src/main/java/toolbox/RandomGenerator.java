package toolbox;

import java.util.Random;
//import java.util.concurrent.SynchronousQueue;

/**
 * Created by Letricia on 7/14/16.
 */
public class RandomGenerator {

    public static int randomInt(int min, int max) {
        Random random = new Random(System.currentTimeMillis()); // this is a method
        int randomNumber = random.nextInt((max + min) -1) +min;

        return randomNumber;

    }
    public static void main(String[] args) {
        System.out.println(randomInt(5,12));
    }

}





//http://www.javamex.com/tutorials/random_numbers/#.V5AC2JOAOko