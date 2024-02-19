import java.util.Arrays;

public class StartAndLastPos {
    public static void main(String[] args) {
        int[] arr = { 2, 3, 3, 3, 3, 4, 5, 6, 6, 6};
        int[] ans = {-1, -1};
        ans[0] = search(arr,3,true);
        ans[1]=search(arr,3,false);
        System.out.println(Arrays.toString(ans));
    }
    static int search(int[] nums, int target, boolean findFirstPos){
        int ans = -1;
        int start = 0;
        int end = nums.length-1;
        while( start <= end){
            int mid = start + (end - start) / 2;
            if( nums[mid] > target){
                end = mid - 1;
            }else if(nums[mid] < target){
                start = mid + 1;
            }else{
                ans = mid;
                if(findFirstPos){
                    end = mid - 1;
                }
                else {
                    start = mid + 1;
                }
            }
        }
        return ans;
    }
}
