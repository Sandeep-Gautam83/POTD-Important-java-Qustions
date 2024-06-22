import java.util.Scanner;
public class calcPowerRecursion {
    public static int  calcpower(int x,int n){
        if(n==0){
            return 1;
        }
        if(x==0){
            return 0;
        }
int xpow1=calcpower(x, n-1) * x;
return xpow1;
    }
    public static void main(String[] args) {
        System.out.println("Enter the no : ");
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int n=sc.nextInt();
        int ans=calcpower(x, n);
        System.out.println(ans);
    }
}
