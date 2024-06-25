public class linearSearch {

public static int Seacrchval(int number[],int key ){
    for(int i=0;i<number.length;i++){
        if(number[i]==key){
            return i;
        }
    }
    return -1;
}


    public static void main(String[] args) {
        int number[]={2,4,6,8,10,12,14,65};
        int key=14;
        int idx=Seacrchval(number, key);
    if(idx==-1){
        System.out.println("key is not fint ");
      }  else {
            System.out.println("key is at index : " +idx);
        }
    }    
}
  
