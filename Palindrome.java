   import java.util.Scanner;
   class Palindrome {
 public static void main(String args[]){
    System.out.println("Enter the String : ");
    Scanner sc=new Scanner(System.in);
    String s=sc.nextLine();
    String rev="";

    for(int i=s.length()-1;i>=0;i--){
        rev=rev+s.charAt(i);

    }
    if(s.equals(rev)){
        System.out.println(" Palindrome String ");
    }
    else{
        System.out.println("Not a Palindrome String ");
    }
 }    
}
