import java.util.Scanner;
public class DecimaltoBinary {

    public static void main(String[] args) {
        System.out.println("Enter the number : ");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int t=num;
        String b="";
        while (t>0) {
            int r=t%2;
            t=t/2;
            b=r+b;
        }
        System.out.println("Decimal number is :" +b);
    }
}