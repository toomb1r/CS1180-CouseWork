//Tiffany Behr
//CS-1180-03
//Erik Buck
//Due 10-10-2021
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner numberScanner = new Scanner(System.in);
        double runningTotal = 1; 
        double loopCounter = 0;
        System.out.print("Enter a number: ");
        double userNumber = numberScanner.nextInt();
        if (userNumber > 0) {
            while (true) {
                System.out.println(runningTotal); //so it displays 2^0 first
                runningTotal *= 2; 
                loopCounter++;
                if (loopCounter == userNumber) {
                    System.out.println(runningTotal);
                    System.out.println("Tiffany Behr 84000000"); 
                    break;
                }
            }
        } else if (0 > userNumber) {
            System.out.println("0");
            System.out.println("Tiffany Behr 84000000"); //part2
        }
        numberScanner.close();
    }
}
