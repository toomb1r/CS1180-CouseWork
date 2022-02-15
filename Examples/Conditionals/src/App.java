import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        java.util.Scanner floatScanner = new java.util.Scanner(System.in);
        System.out.print("Enter width: ");
        float width = floatScanner.nextFloat();
        System.out.print("Enter length: ");
        float length = floatScanner.nextFloat();
        System.out.print("Area is ");
        System.out.println(length * width);
    }
}
