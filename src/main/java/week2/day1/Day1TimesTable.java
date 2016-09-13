package week2.day1;

/**
 * Created by Letricia on 7/18/16.
 */

public class Day1TimesTable {

    public static void main(String[] args) {
        int tableSize = 15;
        printTimesTable(tableSize);
    }

    public static void printTimesTable(int tableSize) {
        // first print the top header row using a for-loop
        System.out.format("      ");
        for(int i = 1; i<=tableSize;i++ ) {
            System.out.format("%4d",i);
        }
        System.out.println();
        System.out.println("--------------------------------------------------------");

        // create another for-loop to start building the rows
        for (int x = 1; x  <= tableSize; x++){
            System.out.format("%4d |", x);
            for (int y = 1; y<= tableSize; y++) {
                System.out.format("%4d",x * y);
            }
            System.out.println();
        }
        // print left most column first

        // create another loop to fill in the multiplied columns

    }
}





