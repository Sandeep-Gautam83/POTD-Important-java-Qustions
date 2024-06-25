public class binCoff {
     
    public static int binocoff(int n, int r){
       int factorial=1;
        int fact_n=factorial(n);
        int fact_r=factorial(r);
        int fact_nmr=factorial(n-r);

        int binCoff=fact_n/(fact_r * fact_nmr);
        return binCoff;
    }
    
    public static int factorial(int n){
        int f=1;
        for(int i=1;i<=n;i++){
f=f*i;
        } 
        return f;

    }



    public static void main(String[] args) {
        System.out.println(binocoff(23, 5));
     }
}
