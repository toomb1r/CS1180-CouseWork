import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        double area = 0.0;
        System.out.print("Enter Radius: ");
        Scanner radiusinput = new Scanner(System.in);
        double radius = radiusinput.nextDouble();
        area = radius * radius * Math.PI;
        System.out.print("Area is ... ");
        System.out.println(area);
    }
}
