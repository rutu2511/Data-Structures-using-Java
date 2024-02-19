public class BinSearchRec {
    public static void main(String[] args) {
        int[] arr = {1,3,5,67,89,99};
        System.out.println(search(arr,99,0,5));
    }
    static int search(int[] arr, int target, int start, int end){
        if(start > end){
            return -1;
        }
        int mid = start + (end - start) / 2;
        if(target == arr[mid]){
            return mid;
        }
        if(arr[mid] < target){
            return search(arr,target,mid + 1, end);
        }

        return search(arr,target,start,mid - 1);
    }
}
