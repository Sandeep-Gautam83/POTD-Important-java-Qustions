public class array2DSumSecondRow {
    public static void main(String args[]){
        int[][] nums={{1,4,9},{11,4,3},{2,2,3}};
        int sum=0;
        //sum of second row element
            for(int j=0; j<nums[0].length; j++){
                sum +=nums[j][j];
            }
            System.out.println("2D array sum is : "+sum);
        }
    }

