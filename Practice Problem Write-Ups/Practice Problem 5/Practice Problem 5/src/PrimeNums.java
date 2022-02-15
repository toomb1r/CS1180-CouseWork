//Tiffany Behr
//CS-1180-06
//9/29/2021
import java.util.Scanner;

public class PrimeNums {
  public static void main(String[] args) throws Exception {
    int counter = 0;
    int nCounter = 0;
    Scanner userInputScanner = new Scanner(System.in);
    System.out.print("What is the value of n?: "); 
    int userInput = userInputScanner.nextInt();
    userInputScanner.close();
    if (userInput <= 0) {
      System.out.print("Error: n cannot be negative");
    } else { 
      while (true) {
        counter++;
        boolean isPrime = true;
        for (int i = 2; i <= counter / 2; ++i) // ++ before does increments
        {
          if (counter % i == 0) {
            isPrime = false;
            break;
          }
        }
        if (counter != 1 && isPrime) {   //conditional
          System.out.print(counter + " ");
          nCounter++;
        }
        if (nCounter == userInput) {
          System.exit(0); //so it doesnt check again
        }
      }
    }
  }
}
// borrowed from
// https://www.programiz.com/java-programming/examples/prime-number
// int num = 29;
// boolean flag = false;
// for (int i = 2; i <= num / 2; ++i) {
// condition for nonprime number
// if (num % i == 0) {
// flag = true;
// break;

// if (!flag)
// System.out.println(num + " is a prime number.");
// else
// System.out.println(num + " is not a prime number."
