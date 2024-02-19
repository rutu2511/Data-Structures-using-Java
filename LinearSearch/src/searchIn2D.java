import java.lang.reflect.Array;
import java.util.Arrays;

public class searchIn2D {
    public static void main(String[] args) {
        int[][] arr={
                {12,3,4,65,7},
                {11,10,23,56},
                {34,90,9},
                {7,1}
        };
        System.out.println(Arrays.toString(searchIn2D(arr,1)));
    }
    static int[] searchIn2D(int[][] ar, int target){
        for (int i = 0; i < ar.length; i++) {
            for (int j = 0; j < ar[i].length; j++) {
                if(target == ar[i][j]){
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{-1,-1};
    }
}
