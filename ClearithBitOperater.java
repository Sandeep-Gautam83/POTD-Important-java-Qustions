public class ClearithBitOperater {
    
    public static int clearithbit(int n, int i){
        int bitMask=(~0)<<i;
        return n & bitMask;
    }
    
    public static void main(String args[]){
System.out.println(clearithbit(15, 2));
    }
}
