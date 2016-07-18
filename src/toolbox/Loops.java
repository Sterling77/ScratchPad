package toolbox;

/**
 * Created by Letricia on 7/12/16.
 */
public class Loops {

    //Covers 'while loops', 'for loops', and do-while loops'.

    int [] numbers = {10, 20, 30, 40, 50};  // int[] this is an int array that means multiple values . explain postions

    // ***** while loops: Repeats a statement or group of statements while a given condition is true. It tests the condition
    // before(at the beginning) executing the loop body.
    public void whileLoop() {
    int i = 0;
        while (i< numbers.length){  //while (i< numbers.length) this is an infinite loop . uses any type of boolean
         System.out.println("The number is: "+numbers[i]);
            i++;
        }
    }


    // **** for loops: Execute a sequence of statements multiple times and abbreviates the code that manages the loop variable.
    public void forLoop() {
        for (int i=0; i< numbers.length; i++){
            System.out.println("The number is: "+numbers[i]); // must always start with a primitive
        }
    } // FOR LOOPS CONTAIN: A COUNTER BOOLEAN AND AN INCREMENTER. HA.

    public void enhancedForLoop() {
        for (int num : numbers) {
            System.out.println("The number is: "+num);
        }
    }


    //******* do-while loops: Like a while statement, except that it tests the condition at the end of the loop body
    public void doWileLoop() {
       int i = 0;
        do {
            System.out.println("The number is: "+ numbers[i]);
            i++;
        } while(i < numbers.length);

        }
    }
//}

