public class linearSearchArray {
 public static int searcharray(int number[],int key){
    for(int i=0;i<number.length;i++){
        if(number[i]==key){
            return i;
        }
    }
    return -1;
 }

    public static void main(String[] args) {
        int number[]={2,3,4,4,5,6,6,7,8,98,6,8};
        int key=8;
        int index=searcharray(number, key);
        if(index== -1){
            System.out.println("Not found");
        }else{
            System.out.println("key is index : " +index);
        }
    }
}