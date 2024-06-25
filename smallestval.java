public class smallestval {

 public static int getSmallest(int number[]){
    int Smallest=Integer.MAX_VALUE;
    for(int i=0;i<number.length;i++){
        if(Smallest>number[i]){
            Smallest=number[i];
        }
    }
    return Smallest;
 }

    public static void main(String[] args) {
        int number[]={12,13,14,77,88,99,66,44,32,46,67};
    System.out.println("Smallest value is : " +getSmallest(number));
    }
}
