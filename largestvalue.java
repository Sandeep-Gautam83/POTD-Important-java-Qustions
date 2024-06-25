public class largestvalue {

public static int getLarget(int number[]){
    int larget=Integer.MIN_VALUE;
    for(int i=0;i<number.length;i++){
        if(larget<number[i]){
            larget=number[i];
        }
    }
    return larget;
}

    
    public static void main(String args[]){
        int number[]={2,4,5,9,66,55,443,78,89,99};
    System.out.println("largest value is : " +getLarget(number));
    }
}
