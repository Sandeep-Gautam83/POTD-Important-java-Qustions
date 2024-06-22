import java.util.Scanner;
public class makeitwhite {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter the number : ");
            int t = scanner.nextInt();
            while (t-- > 0) {
                int n = scanner.nextInt();
                String s = scanner.next();
                int minLength = Integer.MAX_VALUE;
                int left = 0, right = 0;
                while (right < n) {
                    if (s.charAt(right) == 'B') {
                        if (right - left + 1 < minLength) {
                            minLength = right - left + 1;
                        }
                        while (left < right && s.charAt(left) == 'W') {
                            left++;
                        }
                    }
                    right++;
                }
                System.out.println(minLength);
            }
        }
    }
