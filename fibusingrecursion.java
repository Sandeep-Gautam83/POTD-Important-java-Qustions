import java.util.Scanner;
public class fibusingrecursion {
    public static void main(String[] args) {
       
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number : ");

        int n=sc.nextInt();
        int a=1,b=1;
        for(int i=1;i<n;i++){
            System.out.println(a);
            int c=a+b;
            a=b;
            b=c;
            c=a+b;
        }
    }
}
