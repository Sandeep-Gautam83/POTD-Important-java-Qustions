public class RecursionCalSum {
   public static int CalSum(int n){
    if(n==1){
        return 1;
    }
    int sum1 = n + CalSum(n-1);
    return sum1; 
   }
   
   
   
    public static void main(String args[]){
        int n=51;
        System.out.println(CalSum(n));
    }
}
