public class factorial {
    public static void main(String[] args) {
        System.out.println("Enter the number : ");
        int n=4,fact=1;
        while (n>0) {
            fact=fact*n;
            n--;
        }
        System.out.println(fact);
    }
}
