public class PeakIndexInMountain {
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 15, 7, 6, 2, 1};
        System.out.println(findInMountain(arr));
    }
    static int findInMountain(int[] arr){
        int start = 0;
        int end = arr.length-1 ;
        while(start < end){
            int mid = start + (end - start) / 2;
            if(arr[mid] > arr[mid+1]){
                end = mid;
            }else{
                start = mid + 1;
            }
        }
        return start;
    }
}
