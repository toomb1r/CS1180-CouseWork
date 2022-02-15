import java.util.Scanner;

public class Upto100 {
    public static void main(String[] args) throws Exception {
       
       Scanner numbersEnteredScanner = new Scanner(System.in);
       int runningTotal = 0;
       int numberUserInput = 0; 
        while (runningTotal <= 100) 
        {System.out.print("Enter a number: ");
        int userNumber = numbersEnteredScanner.nextInt();
          runningTotal += userNumber;
          numberUserInput++;
        if (runningTotal >= 100)
        {numberUserInput--; //ensure that it shows the number of user inputs before it is 100.
         System.out.print("You entered " + numberUserInput + " values before the total was greater than 100"); 
         numbersEnteredScanner.close();
         System.exit(0);}}
         }
}
     