import java.util.Scanner;
public class BinarytoDecimal {
    public static void main(String[] args) {
        System.out.println("Enter the number : ");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int d=0;
        int i=0;
        int t=num;
        while(t>0){
            int r=t%10;
            t=t/10;
            d= d + r * (int) Math.pow(2, i++);
        }
        System.out.println("Decimal number is :  " +d);
    }
}
