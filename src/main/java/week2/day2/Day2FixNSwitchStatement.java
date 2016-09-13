package week2.day2;

/**
 * Created by Letricia on 7/19/16.
 */

public class Day2FixNSwitchStatement {
    private static char branch = 'E'; // C - CSE, E - ECE, M - Mech
    private static int year = 2;


    public static void Main(String[] args) {
        Switch();
    }

    private static void Switch() {
        switch (year) {
            case 1:
                System.out.println("English, Math, Drawing");
                break;
            default:

            case 2:
                switch (branch) {// LINE C
                    case 'C':
                        System.out.println("Data structures, Java, Computer Organization");
                        break;
                    case 'E':
                        System.out.println("Micro processors, Logic switching theory");
                        break;
                    case 'M':
                        System.out.println("Drawing, Manufacturing Machines");
                        break;
                    default:
                       return;

                    case 3:
                        switch (branch) // LINE D
                        {
                            case 'C':
                                System.out.println("Operating System, RDBMS");
                                break;
                            case 'E':
                                System.out.println("Fundamentals of Logic Design, Microelectronics");
                                break;
                            case 'D':
                                System.out.println("Internal Combustion Engines, Mechanical Vibration");
                                break;
                            default:
                                System.out.println("You are unemployed");
                        }

                }

        }
    }
}
