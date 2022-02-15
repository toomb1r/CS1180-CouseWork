
//Tiffany Behr                                      
//CS-1180-06                        
//Due 10-10-21                          //Thread.sleep(2000);               200 blank lines 
//Simon Says                            //equalsIgnoreCase             //int randNum = (int) ((Math.random() * 10) + 1);
import java.util.Scanner;

public class App {
    static Scanner scan = new Scanner(System.in); //mr world wide "scanner"

    public static void main(String[] args) throws Exception {
        System.out.println("Hello! Welcome to Simon Says!");
        Thread.sleep(2000); // slowin it downnnnnn
        while (true) {
            System.out.println("\n\n\nWhat diffculty level do you want?: ");
            String diffcultyAnswer = scan.next();
            if (diffcultyAnswer.equalsIgnoreCase("easy")) {// ignorecase so capitailization doesnt matter
                easyMode();
                playAgain(); //this method is placed after the first one to ensure it properly sequences
            } else if (diffcultyAnswer.equalsIgnoreCase("medium")) {
                mediumMode();
                playAgain();
            } else if (diffcultyAnswer.equalsIgnoreCase("hard")) {
                hardMode();
                playAgain();
            }// else if (diffcultyAnswer.equalsIgnoreCase("potato")) {                                  if you think this is funny let me know in the feedback
               // System.out.println("\n\n\nSo you think you're funny huh >:[");
               // Thread.sleep(2000);
               // System.out.println("\n\n\nNo playing for you!");
               // System.exit(0); }
             else {
                System.out.println("That is not a valid reponse!");
            }
        }

    }

    public static void easyMode() throws InterruptedException {
        String[] randomColors = { "Red", "Green", "Yellow", "Blue" };
        String sequence = "";
        int scoreCounter = 0;
        scan.nextLine();
        while (true) {
            int randNum = (int) ((Math.random() * 4));
            sequence += randomColors[randNum] + " ";
            System.out.println("Simon says " + sequence);
            Thread.sleep(2000);
            for (int line = 0; line <= 200; line++) {
                System.out.println();
            }
            String userAnswer = scan.nextLine();
            userAnswer = userAnswer.replaceAll(" ", "");
            if (userAnswer.equalsIgnoreCase(sequence.replaceAll(" ", ""))) {
                scoreCounter += 1;
                System.out.println("Correct! Your score is " + scoreCounter);
            } else {
                System.out.println("Wrong! Your score is " + scoreCounter);
                break;
            }
        }
    }

    public static void mediumMode() throws InterruptedException {
        String[] randomNumbers = { "1", "2", "3", "4", "5", "6", "7", "8", "9" };
        String sequence = "";
        int scoreCounter = 0;
        scan.nextLine();
        while (true) {
            int randNum = (int) ((Math.random() * 9)); //math
            sequence += randomNumbers[randNum] + " ";
            System.out.println("Simon says " + sequence);
            Thread.sleep(2000);
            for (int line = 0; line <= 200; line++) { //so 200 lines print
                System.out.println();
            }
            String userAnswer = scan.nextLine();
            userAnswer = userAnswer.replaceAll(" ", "");
            if (userAnswer.equalsIgnoreCase(sequence.replaceAll(" ", ""))) {
                scoreCounter += 1;
                System.out.println("Correct! Your score is " + scoreCounter);
            } else {
                System.out.println("Wrong! Your score is " + scoreCounter);
                break;
            }
        }
    }

    public static void hardMode() throws InterruptedException {
        String[] randomLetters = { "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q",
                "r", "s", "t", "u", "v", "w", "x", "y", "z" };
        String sequence = "";
        int scoreCounter = 0;
        scan.nextLine();
        while (true) {
            int randNum = (int) ((Math.random() * 26));
            sequence += randomLetters[randNum] + " ";
            System.out.println("Simon says " + sequence);
            Thread.sleep(2000);
            for (int line = 0; line <= 200; line++) {
                System.out.println();
            }
            String userAnswer = scan.nextLine();
            userAnswer = userAnswer.replaceAll(" ", "");
            if (userAnswer.equalsIgnoreCase(sequence.replaceAll(" ", ""))) {
                scoreCounter += 1;
                System.out.println("Correct! Your score is " + scoreCounter);
            } else {
                System.out.println("Wrong! Your score is " + scoreCounter);
                break;
            }
        }
    }

    public static void playAgain() {
        String playAgain = "";
        while (true) {
            System.out.println("Do you want to play again?");
            playAgain = scan.nextLine();
            playAgain = playAgain.replaceAll(" ", ""); //regex so it can read the answer and it ignores spaces
            if (playAgain.equalsIgnoreCase("yes")) {
                break;
            } else if (playAgain.equalsIgnoreCase("no")) {
                System.out.println("Ok! Gooodbye.");
                System.exit(0);
            } else {
                System.out.println("That is not a valid answer");
            }
        }

    }

}