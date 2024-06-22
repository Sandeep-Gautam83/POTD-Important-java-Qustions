public class Sotution {
    public static int[] reverseArray(int n, int []nums) {
        // Write your code here.
 int arr[]=new int[n];
 for(int i=n-1;i>=0;i--){
     arr[i]=nums[n-i-1];
 }
 return arr;
    }
}