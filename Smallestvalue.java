public class Smallestvalue {
    
    public static int getsmallest(int number[]){
       int Smallest=Integer.MAX_VALUE;
        for(int i=0;i<number.length;i++){
            if(Smallest>number[i]){
                Smallest=number[i];
            }
        }
        return Smallest;
    }
    
    public static void main(String[] args) {
        int number[]={11,22,343,45,6,7,88,2,5,6,7,8,98, 1};
        System.out.println("Smallest number is : "+getsmallest(number));
    }
}
