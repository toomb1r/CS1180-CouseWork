public class App {
    public static void main(String[] args) throws Exception {
        int n = 5;
        int m = 2;
        for (int y = 0; y < n; y += 1) {
            for (int x = 0; x < m; x += 1) {
                System.out.print("    |   |   ");
            }
            System.out.print("\n");
            for (int x = 0; x < m; x += 1) {
                System.out.print(" ___________");
            }
            System.out.print("\n");
            for (int x = 0; x < m; x += 1) {
                System.out.print("    |   |   ");
            }
            System.out.print("\n");
            for (int x = 0; x < m; x += 1) {
                System.out.print(" ___________");
            }
            System.out.print("\n");
            for (int x = 0; x < m; x += 1) {
                System.out.print("    |   |   ");
            }
            System.out.print("\n");
            for (int x = 0; x < m; x += 1) {
                System.out.print("");
            }
            System.out.print("\n");
        }
    }
}
