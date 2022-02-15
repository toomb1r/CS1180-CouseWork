

public class App {
    public static void main(String[] args) throws Exception {
        java.util.Scanner floatScanner = new java.util.Scanner(System.in);
        System.out.print("Enter width: ");
        float width = floatScanner.nextFloat();
        System.out.print("Enter length: ");
        float length = floatScanner.nextFloat();
        float areaOfRectangle = length * width;
        System.out.print("Enter radius: ");
        float radius = floatScanner.nextFloat();
        float areaOfCircle = radius * radius * (float) Math.PI;
        boolean isCircleLarger = (areaOfCircle > areaOfRectangle);



        if (isCircleLarger) {
            System.out.print("Circle of Radius "); 
            System.out.print(radius);
            System.out.print(" is larger ");
        } else {
            System.out.print("Circle of Radius ");
            System.out.print("radius");
            System.out.print(" is less than or equal to area of rectangle");
            floatScanner.close();}
  }
}
