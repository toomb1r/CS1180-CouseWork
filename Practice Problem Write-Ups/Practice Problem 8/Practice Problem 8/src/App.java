
import java.util.Scanner;

//Tiffany Behr
//CS-1180L-06
//Erik Buck
//10-29-21

public class App { 
    public static void main(String[] args) throws Exception {
        int[] list = new int[10];
        System.out.print("The array contains "); 
        for ( int i = 0; i < 10; i++) {
            int randomly = ((int)((Math.random())*20)+1);
            list[i]= randomly;
            System.out.print(randomly + " ");
        }
        System.out.print("\nWhat is the value of N? ");
        Scanner inputScanner = new Scanner(System.in);
        int nValue = inputScanner.nextInt();
        if (nValue<10 && nValue>0){
            int count = 0;
            
            for (int i = 0; i<list.length; i++) {
                count++;
                if (count%nValue == 0){
                    System.out.print(list[i] + " ");
                }
            }
        }
        else {
            System.out.println("Error: the value of N must be between 1 and 10");
        }
        inputScanner.close();
    }
}
    