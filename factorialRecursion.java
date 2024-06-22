import java.util.Scanner;
public class factorialRecursion {
 public static int  calculatefact(int n){
    if(n==1 || n==0){
        return 1;
    }
    int fact= calculatefact(n-1) * n;
    return fact;
 }   
 public static void main(String[] args) {
   System.out.println("Enter the number : ");
   Scanner sc=new Scanner(System.in);
   int n=sc.nextInt();
   System.out.println(calculatefact(n));
 }
}
