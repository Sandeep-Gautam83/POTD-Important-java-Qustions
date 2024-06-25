public class LargestNumber {
    
    public static int largernumber(int number[]){
        int largest=Integer.MIN_VALUE;       //-infinity
        for(int i=0;i<number.length;i++){
            if(largest<number[i]){
                largest=number[i];
            }
        }
        return largest;
    }
    
    public static void main(String[] args) {
        int number[]={2,3,4,6,7,8,11,7,6,4,4};
        System.out.println("larget number is : "+largernumber(number));
    }
}
