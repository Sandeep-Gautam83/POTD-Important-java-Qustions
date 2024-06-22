import java.util.Scanner;
public class fibonaciseries {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=1,b=2,c=1;
        System.out.println("Enter the number : ");
        int nums=sc.nextInt();
        for(int i=2;i<=nums;i++) {
            System.out.println(c);
            a=b;
            b=c;
            c=a+b;
        }
    }
}