public class RecursionFiboncciNumber {
    
    public static int  Calfib(int n){
        if(n==0 || n==1){
            return n;
        }
       int fn = Calfib(n-1) + Calfib(n-2);
        return fn;
    }
    
    public static void main(String args[]){
        int n=20;
        System.out.println(Calfib(n));
    }
}
