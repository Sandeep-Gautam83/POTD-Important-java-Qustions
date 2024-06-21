public class RecursionFactorialprint {
    
    public static int  printfact(int n){
        if(n==0){
            return 1;
        }
        int fnm1 = printfact(n-1)*n;
        // int fn = n * fnm1;
        return fnm1;
    }
    
    public static void main(String args[]){
        int n=9;
        System.out.println(printfact(n));
    }
}
