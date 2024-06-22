import java.util.Scanner;
public class factR {
    static int fact=1;
    public static void main(String[] args) {
        System.out.println("Enter the no : ");
        Scanner sc=new Scanner(System.in);
        int no=sc.nextInt();
        factR ob=new factR();
        ob.calcfact(no);
        System.out.println("factorial of the number : " + fact);

    }
    void calcfact(int no){
        if(no>=1){
            fact=fact*no;
            calcfact(no-1);
        }
    }
}
