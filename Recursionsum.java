import java.util.Scanner;
public class Recursionsum{

     public static void sumprint(int i,int n,int sum){
        if(i==n){
            sum=sum+i;
            System.out.println(sum);
            return;
        }
        sum=sum+i;
        sumprint(i+1, n, sum);
     }
     public static void main(String[] args) {
        System.out.println("Enter the number : ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sumprint(0, n, 0);
     }
}
