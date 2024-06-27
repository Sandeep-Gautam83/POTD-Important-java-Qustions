public class countmaxnumberarray {

    public static int maxnumber(int nums[]){
        int count=0;
        int max=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1){
                count++;
            }else{
                max=0;
            }
            // maxi=Math.max(maxi, count);
            max = Math.max(max, count);
        }
        return max;
    }
    public static void main(String args[]){
        int nums[]={1,1,0,1,1,1};
        int ans=maxnumber(nums);
        System.out.println("maximum number is : " + ans);
    }
}