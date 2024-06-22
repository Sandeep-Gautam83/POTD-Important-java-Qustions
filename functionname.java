import java.util.Scanner;
public class functionname {
    public static void printMyname(String name){
        System.out.println(name);
     return ;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Name : ");
     String name=sc.nextLine();
 printMyname(name);
    }

}
