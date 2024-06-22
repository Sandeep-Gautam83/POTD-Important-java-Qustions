import java.util.Scanner;
public class Palidram {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number : ");
        int no=sc.nextInt();
       int temp=no;
       int res=0,rem;
        while(temp!=0){
              rem=temp%10;
            res=rem+res*10;
            temp=temp/10;
        }
        if(no==res){
            System.out.println("number is palindrome");
        }else{
            System.out.println("NOt palindrame");
        }
    }
}
