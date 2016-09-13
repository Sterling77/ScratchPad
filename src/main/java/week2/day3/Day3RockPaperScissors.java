package week2.day3;
import java.util.Random;
import java.util.Scanner;

/**
 * Created by Letricia on 7/19/16.
 */
public class Day3RockPaperScissors {
    private String player1Choice;
    private String player2Choice;
    //String winnerAnnouncement;
    //private String ;

    public static void main(String[] args) {

        Day3RockPaperScissors d3rps = new Day3RockPaperScissors();
        d3rps.setPlayerChoices();
        d3rps.decideWinner();
    }


    private void setPlayerChoices() {
        Scanner scanner = new Scanner(System.in);
        // The game should ask player 1 for their choice of "rock", "paper", or "scissors".
        //String randNum = RandInt.randomInt(0, 100); THIS IS MY WAY OF GETTING THE RANDUM FOR THE COMP
        player1Choice = "";
        while (player1Choice.isEmpty()){
            System.out.println("choose rock, paper, or scissors");
            String inputChoice = scanner.next();
            if (inputChoice.equalsIgnoreCase("rock") || inputChoice.equalsIgnoreCase("paper") || inputChoice.equalsIgnoreCase("paper")){
                player1Choice = inputChoice;
            } else {
                System.out.println("invalid choice");
            }
        }

        // The game should then randomly select the computer's (player 2) selection

        player2Choice = randomSelection();
    }

    private void decideWinner() {
            // Using the rules of Rock-Paper-Scissors, decide which player wins
            //    (rule: rock beats scissors)
            //    (rule: paper beats Rock)
            //    (rule: scissors beats Paper)
        String winnerAnnouncement;
        if (player1Choice.equalsIgnoreCase("rock") && player2Choice.equalsIgnoreCase("scissors")) {
                winnerAnnouncement = "Player: ROCK vs Computer: SCISSORS ----- PLAYER WINS";
            }else if (player1Choice.equalsIgnoreCase("scissors") && player2Choice.equalsIgnoreCase("rock"))
                winnerAnnouncement = "Player: SCISSORS vs Computer: ROCK ----- COMPUTER WINS";
            else if (player1Choice.equalsIgnoreCase("paper") && player2Choice.equalsIgnoreCase("rock")) {
                winnerAnnouncement = "Player: PAPER VS Computer: ROCK ----- PLAYER WINS";
            } else if (player1Choice.equalsIgnoreCase("rock") && player2Choice.equalsIgnoreCase("paper")) {
                winnerAnnouncement = "Player: ROCK vs Computer: PAPER ----- COMPUTER WINS";
            } else if (player1Choice.equalsIgnoreCase("scissors") && player2Choice.equalsIgnoreCase("paper")) {
                winnerAnnouncement = "Player: SCISSORS vs Computer: PAPER ----- PLAYER WINS";
            } else if (player1Choice.equalsIgnoreCase("paper") && player2Choice.equalsIgnoreCase("scissors")) {
                winnerAnnouncement = "Player: PAPER vs Computer: SCISSORS ----- COMPUTER WINS";
            } else {
                winnerAnnouncement = "Its a TIE ---- EVERYONE IS A LOSER";
            }

            // Print out who won in this format: "Player: ROCK vs Computer: SCISSORS ----- PLAYER WINS".
            System.out.println(winnerAnnouncement);
        }

            // How will you make computer's selection random?
            //    (hint: you have already done this in several programs

       public static String randomSelection(){
            int min = 1;
            int max = 3;
            String randomSelection;
            Random random = new Random(System.currentTimeMillis());
            int randomNumber = random.nextInt((max - min)+1) +min;
            if (randomNumber == 1) {
                randomSelection = "rock";
            } else if (randomNumber == 2){
                    randomSelection = "paper";
                }else {
                    randomSelection = "scissors";
                }
                return  randomSelection;
        }
    }










   /* public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);       //Scanner scanner = new Scanner(System.in);

   int Computer=0,Player=0,tie=0,compic=0,pscore=0;tie=0;
    int end = 0;
    Scanner scan = new Scanner(System.in);
    while (end < 3) {
        System.out.print("Enter 0 for Scissors, 1 for Rock, and 2 for Paper : ");
        pscore = scan.nextInt();
        compic = (int)(Math.random()*2);

        switch (pscore){
        case 0 :
            if (compic == 0){
                System.out.println("Tie");
                tie++;
            }else if (compic == 1){
                System.out.println("Computer Win");
                Computer++;
            }else{
                System.out.println("Player Win");
                Player++;
                end++;
            }
            break;
        case 1 :
            if (compic == 0){
                System.out.println("Player Win");
                Player++;
                end++;
            }else if (compic == 1){
                System.out.println("Tie");
                tie++;
            }else{
                System.out.println("Computer Win");
                Computer++;
            }break;
        case 2 :
            if (compic == 0){
                System.out.println("Computer Win");
                Computer++;
            }else if (compic == 1){
                System.out.println("Player Win");
                Player++;
                end++;
            }else{
                System.out.println("Tie");
                tie++;
            }break;
        default :
            System.out.println("The wrong value");
            break;
        }
  }
    System.out.println("");
    System.out.println("The player wins : " + Player);
    System.out.println("The computer wins : " + Computer);
    System.out.println("Tie : " + tie);
 */