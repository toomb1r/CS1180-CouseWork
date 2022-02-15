//Tiffany Behr
//Computer Science 1 Lab 1180L-06
// Due 9-10-2021
import java.util.Scanner;
public class Problem2 {
    public static void main(String[] args) throws Exception {
        
        System.out.println("How many people are signed up to play? : ");
        Scanner input = new Scanner(System.in);
        int players = input.nextInt();
        int games;
        games = players / 4;
        System.out.println("That is enough for ... " + games + " games" );
        input.close();
    }
}
