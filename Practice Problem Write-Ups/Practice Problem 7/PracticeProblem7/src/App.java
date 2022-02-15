//Tiffany Behr
//CS-1180L-06
//Erik Buck 
//10-22-21
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner file = new Scanner(System.in);
        System.out.println("What is the name of the file?: ");
        String name = file.nextLine(); //to get the name of the file being created
        System.out.println("What would you like to print to the file?: ");
        String text = file.nextLine(); //inputs text in new file.
        File f = writeText(name, text); //passes inputs into the method
        int wordCount = countWords(f); //so i can display the number of words
        System.out.println(name + " contains: " + wordCount + " word(s)");
        file.close();

    }

    public static File writeText(String filename, String s) throws FileNotFoundException { //inputs text into the new file
        File f = new File(filename);
        PrintWriter fwriter = new PrintWriter(f);

        fwriter.write(s);

        fwriter.close();
        return f;
    }

    public static int countWords(File f) throws FileNotFoundException {
        int result = 0;
        Scanner sc = new Scanner(f);

        while (sc.hasNext()) { //counts the words :)
            result += 1; //returns the word that was skipped 
            sc.next();
        }
        sc.close();
        return result;

    }
}
