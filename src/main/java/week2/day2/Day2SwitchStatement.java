package week2.day2;

/**
 * Created by Letricia on 7/19/16.
 */
public class Day2SwitchStatement {
    private static int monthInt = 8;
    private static String monthString = "July";

    public static void main(String[] args) {
        System.out.println("The " + monthInt + "th month is " + intSwitchMonth(monthInt) + ".");
        System.out.println(monthString + " is the " + StringSwitchMonth(monthString) + "th month of the year.");
    }

    private static String intSwitchMonth(int month) {
        String monthString = "";
        // switch statement here

        switch (month) {
            case 1:
                monthString = "Jan";
                break;
            case 2:
                monthString = "Feb";
                break;
            case 3:
                monthString = "Mar";
                break;
            case 4:
                monthString = "April";
                break;
            case 5:
                monthString = "May";
                break;
            case 6:
                monthString = "June";
                break;
            case 7:
                monthString = "July";
                break;
            case 8:
                monthString = "August";
                break;
            case 9:
                monthString = "September";
                break;
            case 10:
                monthString = "October";
                break;
            case 11:
                monthString = "November";
                break;
            case 12:
                monthString = "December";
                break;
            default:
                monthString = "Invalid Month";
                break;

        }
        return monthString;
    }






    private static int StringSwitchMonth(String month) {
        int monthNumber = 0;
        if (month == null) {
            return monthNumber;
        }

        // switch statement here
        return monthNumber;
    }

}
