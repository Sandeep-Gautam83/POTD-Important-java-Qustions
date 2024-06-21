public class FindSubString {
    
    public static void findsubstringArr(String str, String ans, int i){
        //base case
        if(i==str.length()){
            if(ans.length()==0){
                System.out.println("null");
            }else{
                System.out.println(ans);
            }
            return;
        }
        // Yes choice
        findsubstringArr(str, ans+str.charAt(i), i+1);
        // No choice
        findsubstringArr(str, ans, i+1);
    }
    
    public static void main(String args[]){
        String str="abc";
        findsubstringArr(str, "", 0);
    }
}

// Time complaxcity o(2power n*n)