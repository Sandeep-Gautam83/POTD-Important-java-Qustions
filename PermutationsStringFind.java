public class PermutationsStringFind {
    
    public static void findpermutations(String str, String ans){
        //Base case
        if(str.length()==0){
            System.out.println(ans);
            return;
        }
        //recursion
        for(int i=0; i<str.length(); i++){
            char curr= str.charAt(i);
            String NewStr= str.substring(0, i) + str.substring(i+1);
            findpermutations(NewStr, ans+curr);
        }
    }
    
    public static void main(String args[]){
        String str="abc";
        findpermutations(str, "");
        // System.out.println(findpermutations(str, ""));
        }
}
