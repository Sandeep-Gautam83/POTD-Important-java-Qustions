// import java.util.Scanner;
// public class fib {
//     public static void main(String[] args) {
//         System.out.println("Enter the number : ");
//         Scanner sc=new Scanner(System.in);
//         int n=sc.nextInt();
//         int a=0,b=1, c;
//         System.out.print(a+" "+b);
//       for(int i=1;i<n;i++){
//       c=a+b;
//         System.out.print(" " +c);
//       a=b;
//       b=c;  
//     }
//     }
// }
import java.util.Scanner;
public class fib{
    static int a=0,b=1,c;
    public static void main(String[] args) {
 System.out.println("Enter the number : ");
 Scanner sc=new Scanner(System.in);
 int n=sc.nextInt();
        System.out.print(a+" "+b);
        fib s=new fib();
        s.printfib(n);
    }
    void printfib(int i){
        if(i>=1){
            c=a+b;
            System.out.print(" "+c);
            a=b;
            b=c;
            printfib(i-1);
        }
    }
}