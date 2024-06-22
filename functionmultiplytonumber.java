import java.util.Scanner;
public class functionmultiplytonumber {
    public static int mutliplynumber(int a, int b){
        int mul=a*b;
        return mul;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number : ") ;
        int a=sc.nextInt();
        int b=sc.nextInt();
        int mul=mutliplynumber(a, b);
        System.out.println("product of two number is : " +mul);
    }
}
