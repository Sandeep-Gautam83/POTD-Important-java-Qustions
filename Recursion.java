import java.util.Scanner;
public class Recursion {
public static void printName(int n){
    if(n==5){
        return ;
    }
    System.out.println(n);
    printName(n+1);
}
public static void main(String[] args) {
    System.out.println("Enter the number : ");
    Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
    printName(n);
}
}
