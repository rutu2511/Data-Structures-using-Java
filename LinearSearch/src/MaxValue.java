public class MaxValue{
    public static void main(String[] args) {
    int[][] arr={
            {12,3,4,65,7},
            {11,10,23,56},
            {34,90,9},
            {7,1}
    };
    System.out.println(findMax(arr));
}
        static int findMax(int[][] nums){
            int max;
            max=nums[0][0];
            for (int i = 0; i < nums.length; i++) {
                for (int j = 0; j < nums[i].length; j++) {
                    if(max<nums[i][j]){
                        max=nums[i][j];
                    }
                }
            }
            return max;
        }
}

