public class BinaryToDecimal {

  public static void binarytodecimal(int binNum){
    int pow=0;
    int decNum=0;
    while(binNum>0){
        int lastDigit=binNum % 10;
        decNum = decNum + (lastDigit *(int) Math.pow(2, pow));
        pow++;
        binNum=binNum/10;
    }
    // System.out.println("decimal to"+binNum+"="+decNum);
    System.out.println(decNum);
  }

    public static void main(String[] args) {
        binarytodecimal(101);
    }
}