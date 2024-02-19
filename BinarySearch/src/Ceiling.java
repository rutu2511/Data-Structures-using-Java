import java.util.Arrays;

public class Ceiling {
    public static void main(String[] args) {
        int[] arr={12,34,44,67,87,99};
        System.out.println(findCeiling(arr,88));
    }
    static int findCeiling(int[] arr, int target){
        if(arr[arr.length-1] < target){
            return -1;
        }
        int start = 0;
        int end = arr.length-1;
        while(start <= end){
            int mid = start + (end - start) / 2;
            if(arr[mid] > target){
                end = mid - 1;
            }else if(arr[mid] < target){
                start = mid + 1;
            }else {
                return mid;
            }
        }
        return start;
    }
}
