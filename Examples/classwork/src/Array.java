import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class Array {
    public static void main(String[] args) throws Exception {
        ArrayList<Integer> arrayofIntegers = new ArrayList<Integer>();
        FileInputStream fis = new FileInputStream("Input.txt");
        Scanner intScanner = new Scanner(fis);
        while (intSnavver.hasNext.Int()) {
            arrayofIntegers.add(intScanner.nextInt());
        }
        System.out.println("Number of integers read = " + arrayofIntegers.size());

        long sum = 0;
        for (Integer num : arrayofIntegers) {
            sum += num;
        }
        System.out.println("Average of integers read = " + sum / arrayofIntegers.size());

        System.out.println("Enter a margin: ");
        Scanner marginScanner = new Scanner(System.in);
        int margin = marginScanner.nextInt();
        System.out.println("Entered margin is " + margin);

        int min = mean - margin;
        int max = mean + margin;

        for (int i = arrayofIntegers.size() - 1; i >= 0; i--) {
            Integer curInteger = arrayofIntegers[i]
            if(){
                arrayofIntegers.remove(i)
            }
        }
        int userInput = numberScanner.nextInt();

    }
}