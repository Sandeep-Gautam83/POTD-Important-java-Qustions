public class OddEvenCheckBitmask {
    public static void OddEvenCheck(int n){
        int bitMask=1;
        if((n & bitMask)==0){
    System.out.println("Odd");
        }else{
            System.out.println("Even");
        }
    }
    
    public static void main(String args[]){
OddEvenCheck(5);
OddEvenCheck(11);
OddEvenCheck(14);   
    }
}
