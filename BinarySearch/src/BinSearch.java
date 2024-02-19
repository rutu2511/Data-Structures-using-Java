public class BinSearch {
    public static void main(String[] args) {
        int[] arr={ 2, 3, 45, 56, 78, 99};
        System.out.println(search(arr,45));
    }
    static int search(int[] arr, int target){
        int mid,start,end;
        start = 0;
        end = arr.length-1;

        while (start <= end) {
            mid = start + ( end - start ) / 2 ;
            if( target > arr[mid] ){
                start = mid + 1 ;
            } else if ( target < arr[mid]) {
                end = mid - 1 ;
            }else {
                return mid;
            }
        }
        return -1;
    }
}