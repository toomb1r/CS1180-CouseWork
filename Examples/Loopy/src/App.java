import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // java.util.Scanner myScanner = new java.util.Scanner(System.in);
        java.io.InputStreamReader isr = new java.io.InputStreamReader(System.in);
        int value = isr.read();

        // The next two loop mimic what Scanner.next() does It skips white space
        // characters
        // until it finds a non-whitespace character, thene it reads consecutive
        // non-whitespace
        // characters until the next white space character
        while (Character.isWhitespace((char) value)) {
            value = isr.read();
        }
        while (!Character.isWhitespace((char) value)) {
            System.out.print("<");
            System.out.print(value);
            System.out.println(">");
            value = isr.read();
        }
        // This miminc nextLine()
        while (Character.isWhitespace((char) value)) {
            value = isr.read();
        }
        while (((char) value) != '\n') {
            System.out.print("<");
            System.out.print(value);
            System.out.println(">");
            value = isr.read();
        }
        // The following is like Scanner.nextInt() [skip every char that isn't a digit]
        while (value < 48 || value > 57) {
            value = isr.read();
        }
        int result = 0;
        while (!(value < 48 || value > 57)) {
            result = result * 10;
            result = result + (value - 48);
            value = isr.read();
        }
        System.out.println(result);

    }
}
