import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        double area = 0.0;
        System.out.print("Enter Radius: ");
        Scanner radiusInput = new Scanner(System.in);
        int radius = radiusInput.nextInt();
        area = 4 * Math.PI / 3 * radius * radius * radius;
        System.out.print("Volume is ... ");
        System.out.println(area);
        radiusInput.close();
        
    }
}
