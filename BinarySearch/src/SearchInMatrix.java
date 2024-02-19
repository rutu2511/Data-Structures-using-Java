import java.util.Arrays;
public class SearchInMatrix {
    public static void main(String[] args) {
        int[][] arr = {
                {10,20,30,40},
                {15,25,35,45},
                {18,28,38,48},
                {20,30,40,50}
        };
        System.out.println(Arrays.toString(searchIn2D(arr,38)));
    }
    static int[] searchIn2D(int[][] matrix , int target){
        int row = 0;
        int col = matrix.length-1;
        while(row < matrix.length && col >= 0){
            if(matrix[row][col] == target){
                return new int[]{row,col};
            }
            if(matrix[row][col] > target){
                col --;
            }else{
                row++;
            }
        }
        return new int[]{-1,-1};
    }
}
