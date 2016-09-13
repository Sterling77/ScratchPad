package toolbox;

/**
 * Created by Letricia on 7/12/16.
 */
public class Loops {

    //Covers 'while loops', 'for loops', and do-while loops'.

    int [] numbers = {10, 20, 30, 40, 50};  // int[] this is an int array that means multiple values . explain postions

    //  ***** WHILE LOOPS ***** WHILE LOOPS ***** WHILE LOOPS ***** WHILE LOOPS ***** WHILE LOOPS
    // : Repeats a statement or group of statements while a given condition is true. It tests the condition
    // before(at the beginning) executing the loop body.
    public void whileLoop() {
    int i = 0;
        while (i< numbers.length){  //while (i< numbers.length) this is an infinite loop . uses any type of boolean
         System.out.println("The number is: "+numbers[i]);
            i++;
        }
    }
//    ***** WHILE LOOPS ***** WHILE LOOPS ***** WHILE LOOPS ***** WHILE LOOPS ***** WHILE LOOPS
//    The while loop does not have as many different sections as a for loop.
//    The only thing it needs is a conditional test, which accompanies the
//    while statement. The following is an example of a while loop:
//            while (gameLives > 0) {
//// the statements inside the loop go here
//    }
//    This loop continues repeating until the gameLives variable is no longer greater than 0.

//    The while statement tests the condition at the beginning of the loop
//    before any statements in the loop have been handled. If the tested
//    condition is false when a program reaches the while statement for the
//    first time, the statements inside the loop are ignored.
//    If the while condition is true, the loop goes around once and tests the
//    while condition again. If the tested condition never changes inside the
//    loop, the loop keeps looping forever.

//    The following statements cause a while loop to display the same line
//    of text several times:
//    int limit = 5;
//    int count = 1;
//    while (count < limit) {
//        System.out.println("Pork is not a verb");
//        count++;
//    }
//    A while loop uses one or more variables set up before the loop
//    statement. In this example, two integer variables are created: limit,
//    which has a value of 5, and count, which has a value of 1.
//    The while loop displays the text “Pork is not a verb” four times. If
//    you gave the count variable an initial value of 6 instead of 1, the text
//    never would be displayed.


    // **** FOR LOOPS**** FOR LOOPS**** FOR LOOPS**** FOR LOOPS**** FOR LOOPS**** FOR LOOPS
    // : Execute a sequence of statements multiple times and abbreviates the code that manages the loop variable.
//    Java’s most complex loop statement is for. A for loop repeats a section
//    of a program a fixed number of times.
//
// The following is an example:
//            for (int dex = 0; dex < 1000; dex++) {
//        if (dex % 12 == 0) {
//            System.out.println("#: " + dex);
//        }
//    }

//    This loop displays every number from 0 to 999 that is evenly divisible
//    by 12.
//    Every for loop has a variable that determines when the loop should
//    begin and end. This variable is called the counter (or index). The
//    counter in the preceding loop is the variable dex.
//    The exampleillustrates the three parts of a for statement:
//            . The initialization section—In the first part, the dex variable is
//    given an initial value of 0.
//            . The conditional section—In the second part, there is a conditional
//    test like one you might use in an if statement: dex < 1000.
//            . The change section—The third part is a statement that
//    changes the value of the dex variable, in this example by using
//    the increment operator.
//    In the initialization section, you set up the counter variable. You can
//    create the variable in the for statement, as the preceding example
//    does with the integer variable dex. You also can create the variable
//    elsewhere in the program. In either case, you should give the variable
//    a starting value in this section of the for statement. The variable has
//    this value when the loop starts.
//    The conditional section contains a test that must remain true for the
//    loop to continue looping. When the test is false, the loop ends. In this
//    example, the loop ends when the dex variable is equal to or greater
//    than 1,000.
//    The last section of the for statement contains a statement that changes
//    the value of the counter variable. This statement is handled each time
//    the loop goes around. The counter variable has to change in some way
//    or the loop never ends. In the example, dex is incremented by one in
//    the change section. If dex was not changed, it would stay at its original
//    value of 0 and the conditional dex < 1000 always would be true.
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
/*
} ***** DO-WHILE LOOP***** DO-WHILE LOOP***** DO-WHILE LOOP***** DO-WHILE LOOP***** DO-WHILE LOOP***** DO-WHILE LOOP
The do-while loop is similar to the while loop, but the conditional test
goes in a different place. The following is an example of a do-while
loop:

do {
// the statements inside the loop go here
} while (gameLives > 0);

Like the while loop, this loop continues looping until the gameLives
variable is no longer greater than 0. The do-while loop is different
because the conditional test is conducted after the statements inside
the loop, instead of before them.
When the do loop is reached for the first time as a program runs,
the statements between the do and while are handled automatically,
and then the while condition is tested to determine whether the
loop should be repeated. If the while condition is true, the loop
goes around one more time. If the condition is false, the loop
ends. Something must happen inside the do and while statements
that changes the condition tested with while, or the loop continues
indefinitely. The statements inside a do-while loop always are handled
at least once.

The following statements cause a do-while loop to display the same
line of text several times:
int limit = 5;
int count = 1;
do {
System.out.println("I am not allergic to long division");
count++;
} while (count < limit);test

Like a while loop, a do-while loop uses one or more variables that are
set up before the loop statement.
The loop displays the text “I am not allergic to long division” four
times. If you gave the count variable an initial value of 6 instead of 1,
the text would be displayed once, even though count is never less than
limit.
In a do-while loop, the statements inside the loop are executed at least
once even if the loop condition is false the first time around.
*/

/* *****CONTINUE *****CONTINUE*****CONTINUE*****CONTINUE*****CONTINUE*****CONTINUE*****CONTINUE*****CONTINUE
Another special-circumstance statement you can use inside a loop is
continue. The continue statement causes the loop to exit its current
trip through the loop and start over at the first statement of the loop.
Consider the following loop:
int index = 0;
while (index <= 1000) {
 index = index + 5;
if (index == 400) {
continue;
 }
 System.out.println("The index is " + index);
}
In this loop, the statements are handled normally unless the value
of index equals 400. In that case, the continue statement causes the
loop to go back to the while statement instead of proceeding normally
to the System.out.println() statement. Because of the continue
statement, the loop never displays the following text:
The index is 400.
*/

//COLORS FOR HTML: https://www.w3.org/TR/css3-color/#svg-color
//FONT STYLES FOR HTML: https://www.w3.org/TR/CSS21/fonts.html#generic-font-families
// HTML HELP: http://www.w3schools.com/html/html_blocks.asp