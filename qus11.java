import java.util.Scanner;
public class qus11 {
    public static void main(String[] args) {
        int num;
        int res=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number : ");
         num=sc.nextInt();
      while(num !=0) {
        int  rem=num%10;
        res=rem+res*10;
        num=num/10;
      }
      System.out.println(res);
    }

}
