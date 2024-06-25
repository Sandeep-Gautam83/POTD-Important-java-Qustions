public class BinarySearch {

 public static int binarySearch(int number[], int key){
    int start=0, end=number.length-1;
    while(start<=end){
        int mid=(start+end)/2;
        if(number[mid]==key){
            return mid;
        }
        if(number[mid]<key){
            start=mid+1;
        }else{
            end=mid-1;
        }
    }
    return -1;
 }

    public static void main(String[] args) {
        int number[]={22,44,55,66,78,99,90,65,33,21,33};
        int key=90;
    System.out.println("Binary value  is : " +binarySearch(number, key));
    }
}
