//Tiffany Behr
// Project 1 Trivia! :D
//Luke Holt
//CS-1180L-06

// 5 Q's  ,  1 String,   1 range,   1 exact #,   Repeat Answer,    Score both on fraction and percentage. 
                       // within a 2 year range 
//This is Harry Styles Trivia! This is general information about him! You can pull the info about him off the wiki page tbh... Anyways Good Luck!
import java.util.Scanner;

public class Trivia {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello! Welcome to Trivia Night! ");
                         Thread.sleep(2000); // I just want the text to flow nicely as you read it :) if there is a simpler way plz let me know... this is a lot of code. i think
        System.out.println("I hope you are ready and excited for tonight!");
                         Thread.sleep(2000);
        System.out.println("Tonight's Trivia will be over Harry Styles! A teenage girl's dream guy! Well he is mine at least");
                         Thread.sleep(3000);
        System.out.println("Now you might be thinking. I am a computer! I do not have the capability to like or even love people."); // am i funny lol
                         Thread.sleep(3000);
        System.out.println("First of all, ouch! I can be programmed to have feelings! Well that is beyond current technology... isn't it");
                         Thread.sleep(5000);
        System.out.println("I am getting ahead of myself again... Anyways let the questions begin!");
                         Thread.sleep(2000);
Scanner trivaScanner = new Scanner(System.in); //storage :)

int scoreCounter = 0;  // keep track of the score

//1
    System.out.println("What year did Harry Styles audition for the XFactor? Please be exact!: ");                                                                                   
        int exactNumberAnswer =  trivaScanner.nextInt();
             if (exactNumberAnswer == 2010) {System.out.println(exactNumberAnswer + " is correct! Fun fact he auditioned as a solo artist! ");
             scoreCounter += 1; // add up total
            } else {System.out.println(exactNumberAnswer + ". This is incorrect :(");}
             trivaScanner.nextLine(); // fixed the string problem with two user inputs.
            
//2
    System.out.println("Around what year did Harry Styles cut his signature long hair. This answer can be within two years: ");
        int rangeAnswer = trivaScanner.nextInt();
             if (rangeAnswer <= 2018 && rangeAnswer >= 2014 ) {System.out.println(rangeAnswer + " is a good answer! Incase you're curious! The exact answer 2016."); // looks for a range b/w 2014- 2018
             scoreCounter += 1;}
             else {System.out.println(rangeAnswer + " is wrong...");}
             trivaScanner.nextLine(); //to make it smooooth
//3
    System.out.println("What is the name of the iconic boyband that he was apart of?: ");
        String stringAnswer = trivaScanner.nextLine();
             if (stringAnswer.equalsIgnoreCase("One Direction")) 
                                            {System.out.print(stringAnswer + " is the correct answer!"); scoreCounter += 1;}
             else {System.out.println(stringAnswer + " is not correct! Did you live under a rock in the 2010s?");}
             
//4
    System.out.println("\nWho is One Direction's mentor on the XFactor? He is a judge on the show: ");    // \n second part to fix string problem and make it look appealing 
        String extraAnswer = trivaScanner.nextLine();   //storage
             if (extraAnswer.equalsIgnoreCase("Simon Cowell")) {System.out.println(extraAnswer + " is correct! You know your stuff!"); scoreCounter += 1;}
             else {System.out.println(extraAnswer + " is incorrect. To be fair who really remembers this guy after the year 2016.");}
            
//5
    System.out.println("What year did One Direction enter their indefinite hiatus? Please be exact!: ");
        int fillerAnswer = trivaScanner.nextInt();
             if (fillerAnswer == 2016) {System.out.println(fillerAnswer + " is correct! It was an uncertain time wasn't it..."); scoreCounter += 1;}
             else {System.out.println(fillerAnswer + " is incorrect. You are defintely not a Directioner!");}
             trivaScanner.nextLine();

    System.out.println("You got a " + scoreCounter + " out of 5 for a score of " + scoreCounter*20 + "%"); //where the score will be displayed
     
    trivaScanner.close();}   //the end
}
    