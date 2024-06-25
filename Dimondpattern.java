public class Dimondpattern {
    public static void dimondstar(int n) {
        for (int i = 1; i <= n; i++) {
            // space print
            for (int j = 1; j <= (n - i); j++) {
                System.out.print(" ");
            }
            // star print
            for (int j = 1; j <= (2 * i) - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        // 2nd print
        for (int i = n; i >= 1; i--) {
            // space print
            for (int j = 1; j <= (n - i); j++) {
                System.out.print(" ");
            }
            // star print
            for (int j = 1; j <= (2 * i) - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        dimondstar(5);
    }
}
