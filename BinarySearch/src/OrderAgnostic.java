public class OrderAgnostic {
    public static void main(String[] args) {
        int[] arr={12,34,44,67,87,99};
        System.out.println(search(arr,34));
    }
        static int search(int[] arr, int target){
        int mid;
        int start = 0;
        int end = arr.length-1;
        boolean isAsc = arr[start] < arr[end];
        while ( start <= end){
            mid = start + (end - start) / 2;
            if(arr[mid] == target){
                return mid;
            }
            if(isAsc){
                if(arr [mid] > target){
                    end = mid-1;
                }else{
                    start = mid +1;
                }
            }else{
                if(arr [mid] < target){
                    end = mid - 1;
                }else{
                    start = mid + 1;
                }
            }
        }
        return -1;
    }
}
