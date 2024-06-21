public class RecursionXPowerNfind {
    
    public static int powerfind(int x, int n){
        if(n==0){
            return 1;
        }
        return x * powerfind(x, n-1);
    }
    
    public static void main(String args[]){
        System.out.println(powerfind(2, 10));
    }
}
