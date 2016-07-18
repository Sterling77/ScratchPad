package week1.day3;
import java.util.Scanner;
/**
 * Created by Letricia on 7/13/16.
 */
public class Day3PascalsTriangle {

    public static void print(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(pascal(i, j) + " ");
            }
            System.out.println();
        }
    }

    public static int pascal(int i, int j) {
        if (j == 0) {
            return 1;
        } else if (j == i) {
            return 1;
        } else {
            return pascal(i - 1, j - 1) + pascal(i - 1, j);
    }
}

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the row number upto which Pascal's triangle will be printed:");
        int row = scanner.nextInt();
        print(row);
    }

    }

//public class Day3Pyramids {
//public static void main(String[] args) {
//       for (int i = 1; i <= 5; i++) {
//       for (int j = 1; j <= i; j++) {
//        System.out.print("#"); // print #
//       }
//        System.out.println(); // print blank