import java.util.Scanner;
public class oddnumber {
    public static void main(String args[]){
Scanner sc =new Scanner(System.in);
System.out.println("Enter the number : ");
  int n=sc.nextInt();
  int r=1;
  int sum=0;
  while (r<=n) {
  sum=sum+r;
    // System.out.println(" " +r); 
r++;  
}
System.out.println(sum);
    }
}
    
