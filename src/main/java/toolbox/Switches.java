package toolbox;

/**
 * Created by Letricia on 7/19/16.
 */
public class Switches {


        // switches are an alternative to if-then-else statements when many flows can be chosen from a single value
        // a switch works with (primitives) char, byte, short  ----  (wrappers) Character, Byte, Short  ----  (Object) String

        // This method is an example of a very simple case
        public void intSwitch(int month) {
            // TODO: logic here
        }

        // allow the selected case to fall through where a block of cases have the same result and then break.
        // So if the month is 1, 3, 5, 7... they will all net the same result, numDays=31 and break.
        public void fallThroughCases(int month, int year) {
            // TODO: logic here
        }

        // The same thing, but using Strings instrad of ints. Requires Java 7 or greater
        public void stringSwitch(String dayOfWeek) {
            // TODO: logic here
        }
}

//--------------------------------------------
/*package week2.day2;

/**
 * Created by Letricia on 7/19/16.
 */

/*public class Switches {

    // switches are an alternative to if-then-else statements when many flows can be chosen from a single value
    // a switch works with (primitives) char, byte, short  ----  (wrappers) Character, Byte, Short  ----  (Object) String

    public static void main(String[] args){
        Switches switches = new Switches();
        switches.stringSwitch("Monday");
    }


    // This method is an example of a very simple case
    public void intSwitch(int month) {
        int numDays = 0;
        switch (month) {
            case 1:System.out.println("Jan");break;
            case 2:System.out.println("Feb");break;
            case 3:System.out.println("Mar");break;
            case 4:System.out.println("Apr");break;
            case 5:System.out.println("May");break;
            case 6:System.out.println("Jun");break;
            case 7:System.out.println("Jul");break;
            case 8:System.out.println("Aug");break;
            case 9:System.out.println("Sep");break;
            case 10:System.out.println("Oct");break;
            case 11:System.out.println("Nov");break;
            case 12:System.out.println("Dec");break;
        }
        System.out.println("Number of days:" + numDays);
    }

    // allow the selected case to fall through where a block of cases have the same result and then break.
    // So if the month is 1, 3, 5, 7... they will all net the same result, numDays=31 and break.
    public void fallThroughCases(int month, int year) {
        int numDays = 0;

        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                numDays = 31;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                numDays = 30;
                break;
            case 2:
                //  numDays = 28;
                if (((year % 4 == 0) && !(year % 100 == 0)) || (year % 400 == 0)) {
                    numDays = 29;
                } else {
                    numDays = 28;
                }
                break;
            default:
                System.out.println("Invalid Month");
                break;
        }
    }

    // The same thing, but using Strings instrad of ints. Requires Java 7 or greater
    public void stringSwitch(String dayOfWeek) {
        String typeOfDay;
        switch (dayOfWeek) {
            case "Monday" :
                typeOfDay = "The Start of the work week.";
                break;
            case "Tuesday" :
            case "Wednesday" :
            case "Thursday" :
                typeOfDay = "Midweek" ;
                break;
            case "Friday" :
            case "Saturday" :
            case "Sunday" :
                typeOfDay = "The weekend.";
                break;
            default:
                throw new IllegalArgumentException("Invalid day of the week:" +dayOfWeek);

                //System.out.println("Invalid Day of Week");
                //break;
        }
        System.out.println(dayOfWeek+"--- Type of Day" +typeOfDay);
    }
}
*/




//SWITCH STATEMENTS
//        The if and else statements are good for situations with two possible
//        conditions, but there are times when you have more than two conditions.
//        With the preceding grade example, you saw that if and else statements
//        can be chained to handle several different conditions.
//        Another way to do this is with the switch statement, which can test for
//        a variety of different conditions and respond accordingly. In the following
//        code, the grading example has been rewritten with a switch statement:

//        switch (grade) {
//        case 'A':
//        System.out.println("You got an A. Awesome!");
//        break;
//        case 'B':
//        System.out.println("You got a B. Beautiful!");
//        break;
//        case 'C':
//        System.out.println("You got a C. Concerning!");
//        break;
//        default:
//        System.out.println("You got an F. You'll do well in Congress!");
//        }

//        The first line of the switch statement specifies the variable that is tested—
//        in this example, grade. Then, the switch statement uses the { and }
//        brackets to form a block statement.
//        Each case statementchecks the test variable in the switch statement
//        against a specific value. The value used in a case statement can be a
//        character, an integer, or a string. In the preceding example, there are
//        case statements for the characters A, B, and C. Each has one or two
//        statements that follow it. When one of these case statements matches
//        the variable in switch, the computer handles the statements after the
//        case statement until it encounters a break statement.