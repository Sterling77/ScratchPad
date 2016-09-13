package week1.day3;
import java.awt.*;
import java.applet.*;
/**
 * Created by Letricia on 7/14/16.
 */


//Copy in the following code and build an application that builds a checker board pattern.




public class Day3CheckerBoard {

       public static void main(String[] args) {
        int size = 9;    // size of the board

        for (int row = 1; row < size; row++) {
            boolean isEven = false;
            String printRow = "";
            // Use modulus 2 to find alternate lines
            if ((row % 2) == 0) {   // row 2, 4, 6, 8
               isEven = true;
            }
            for (int col = 1; col <= size; col++) {

                if (isEven) {
                    printRow = printRow + " T ";
                    isEven = false;
                } else {
                    isEven = true;
                    printRow = printRow + " F ";

                }
            }
            System.out.println(printRow);
        }
    }
}







