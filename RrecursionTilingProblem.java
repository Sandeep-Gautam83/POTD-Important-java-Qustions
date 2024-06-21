public class RrecursionTilingProblem {
    
    public static int TilingProblem(int n){
        if(n==0 || n==1){
            return 1;
        }
        int til=TilingProblem(n-1) + TilingProblem(n-2);
        return til;
    }
    
    public static void main(String args[]){
int n=4;
System.out.println(TilingProblem(n));
    }
}
