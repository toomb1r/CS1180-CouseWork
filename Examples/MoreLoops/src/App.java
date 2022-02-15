public class App {
    public static void main(String[] args) throws Exception {
        { // Demonstrate how "while()" can be used as "if()" or "for()
            int fubar = 0;
            int counter = (fubar = 3);
            boolean isFirstTime = true;

            while (counter == 3 && isFirstTime) {
                System.out.println("COUNTER IS THREE");
                isFirstTime = false;
            }

            if (counter == 3) {
                System.out.println("if statement COUNTER IS THREE");
            }

            while (counter < 6) {
                System.out.println(counter);
                counter += 1;
            }

            for (int innerCounter = 3; innerCounter < 6; innerCounter += 1) {
                System.out.println(innerCounter);
            }
        }
        { // Dangers of using float copmparisn in loop conditionals
            for (float i = 0.0f; (i - 10.0f) < -0.001f || (i - 10.0f) > 0.001f; i += 0.1f) {
                System.out.print(i);
                System.out.println(" looping with float conditional");
            }
        }
    }
}
