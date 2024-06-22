import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
public class Reverse {
    public static void printarry(Integer arr[],int n){
        System.out.println("Reverse array is : ");
        for(int i=0;i<n;i++){
            System.out.print(arr[i] + " ");
        }
    }
    static void reverseArray(Integer arr[]) {
        Collections.reverse(Arrays.asList(arr));
    }
    public static void main(String[] args) {
        System.out.println("Enter the number : ");
       Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        //int n=5;
        Integer arr[] = new Integer[];
        reverseArray(arr);
        printarry(arr, n);
    }
}
