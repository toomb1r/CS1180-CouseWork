
//Tiffany Behr
//CS-1180L-06
//Erik Buck
//10-31-21
import java.io.*;
import java.util.*; 

public class App {
    public static void main(String[] args) throws Exception {

        ArrayList<String> sen = stringArrayList("Sentences.txt");

        System.out.println("Welcome to the Game! Sentence Decoder.");
        Thread.sleep(1000);
        for (int line = 0; line <= 200; line++) {
            System.out.println();

        }

       
        while (true) {
            int correct = 0;
            int incorrect = 0;
        String orignalString = pickSentence(sen);
        ArrayList<Character> encoder = randomizeAlphabet();
        String encryptedSentence = encryptedString(encoder, orignalString);
        String solvedLetters = "";
            
            while (true) {  
                // make this equal to something that i can compare boolean preferably
                System.out.println(encryptedSentence);
                System.out.println("Do you want to 1) guess a letter or 2) guess the sentence " );
                Scanner playScanner = new Scanner(System.in);
                String playAnswer = playScanner.nextLine();
                if (playAnswer.equalsIgnoreCase("1")) {
                    System.out.println("Encrypted letter?: ");
                    String encryptedLetter = playScanner.nextLine();
                    if (!solvedLetters.contains(encryptedLetter)) {
                    System.out.println("Actual letter?: ");
                    String actualLetter = playScanner.nextLine();
                    for (int o = 0; o < orignalString.length(); o++) {
                        if (encryptedSentence.charAt(o) == encryptedLetter.charAt(0)) {
                            if (orignalString.charAt(o) == actualLetter.charAt(0)) {
                                correct++;
                                System.out.println("That's right!");
                                break;
                            } else {
                                incorrect++;
                                System.out.println("Sorry, that's not right.");
                                break;
                            }
                        }
                    }
                } else {
                    System.out.println("You've already guessed that letter!");
                }
                } else if (playAnswer.equalsIgnoreCase("2")) {
                    System.out.println("Ok you got some big brains! What do you think the sentence is?: ");
                    String sentenceAnswer = playScanner.nextLine();
                     if(sentenceAnswer.equalsIgnoreCase(orignalString)){ 
                         break;
                        }
                     else{
                         incorrect++; System.out.println("Sorry, that's not right. Good job for trying though!");
                    }
                }  else {

                    System.out.println("Try again! The correct input is either 1 or 2.");
                }
            }
            System.out.println(
                    "That’s right! It took you " + correct + " correct and " + incorrect + " incorrect letter guesses");

            System.out.println("Do you want to play again?: Yes or No");
            Scanner playScanner = new Scanner(System.in);
            String playAgainAnswer = playScanner.nextLine();
            if (playAgainAnswer.equalsIgnoreCase("yes")) {
                continue;
            } else if (playAgainAnswer.equalsIgnoreCase("no")) {
                System.out.println("Goodbye!");
                playScanner.close(); 
                Thread.sleep(2000);
                System.exit(0);
            } else {
                System.out.println("It was a simple YES or NO! Now you are gonna be forced to play again!");
            }
        }

    }

    public static ArrayList<String> stringArrayList(String fileName) throws FileNotFoundException {
        ArrayList<String> sentencesArrayList = new ArrayList<>();

        Scanner sen = new Scanner(new File(fileName));

        while (sen.hasNextLine()) {
            sentencesArrayList.add(sen.nextLine());
        }
        sen.close();
        return sentencesArrayList;
    }

    public static String encryptedString(ArrayList<Character> ranAlp, String hidden) {
        ArrayList<Character> alphabet = new ArrayList<Character>(List.of('a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i',
                'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'));

        String randomSen = "";


        for (int n = 0; n < hidden.length(); n++) {
            for (int x = 0; x < alphabet.size() + 1; x++) {
                if (x == 26) {
                    randomSen += " ";
                    break;
                }
                if (hidden.charAt(n) == alphabet.get(x)) {
                    randomSen += ranAlp.get(x);
                    break;
                }
            }
        }
        return randomSen;

    }

    public static ArrayList<Character> randomizeAlphabet() {
        ArrayList<Character> alphabet = new ArrayList<Character>(List.of('a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i',
                'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'));
        Collections.shuffle(alphabet);
        return alphabet;
    }

    public static String pickSentence(ArrayList<String> allSentences) {
        Random rand = new Random();
        int randInt = rand.nextInt(allSentences.size());
        return allSentences.get(randInt);
    }
}
