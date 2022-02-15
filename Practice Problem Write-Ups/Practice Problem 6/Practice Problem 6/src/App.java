//Tiffany Behr
//CS-1180-07
//Due 10-08-21
import java.util.Scanner;

public class App {

    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Height: ");
        int length = in.nextInt(); // storage of user inputs B-)
        System.out.println("Enter Character: ");
        char symbol = in.next().charAt(0); // storage of user inputs B-)
        createSquare(length, symbol);
        in.close(); // no resource leaks here :)
    }

    static void createSquare(int size, char c) { // c is the character
        for (int y = 0; y < size; y += 1) { // y is the row
            for (int x = 0; x < size; x += 1) { // x is the column

                if (y == 0 || y == size - 1 || x == 0 || x == size - 1) { // conditionals :)
                    System.out.print(c);
                } else {
                    System.out.print(" "); // to make it hollow B-)
                }

            }
            System.out.println();
        }
    }
}
