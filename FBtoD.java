import java.util.Scanner;
public class FBtoD {
    public static void main(String[] args) {
        System.out.println("Enter the number : ");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        String val = "0."; // Initialize the result string
int n=num;
int r=0;
        while (n > 0) {
            double r = n * 2; // Multiply current fraction (n) by 2
    
            if (r >= 1) {
                val += "1"; // Concatenate a "1" to the end of the result string (val)
                n = r - 1; // Remove the 1 from the current fraction (n)
            } else {
                val += "0"; // Concatenate a "0" to the end of the result string (val)
                n = r; // Set the current fraction (n) to the new fraction
            }
        }
    
        return val; 
    }
}
