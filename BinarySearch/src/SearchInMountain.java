public class SearchInMountain {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,3,1};
        System.out.println(search(arr,3));
    }
    static int search(int[] arr, int target){
        int peak = findInMountain(arr);
        int firstTry = orderAgnostic(arr,target,0,peak);
        if(firstTry != -1) {
            return firstTry;
        }
        return orderAgnostic(arr,target,peak+1, arr.length-1);
    }
    static int findInMountain(int[] arr){
        int start = 0;
        int end=arr.length-1;
        while(start<end){
            int mid = start + (end - start ) / 2;
            if(arr[mid] > arr[mid + 1]){
                end = mid;
            }else{
                start = mid + 1;
            }
        }
        return start;
    }

    static int orderAgnostic(int[] arr, int target, int start, int end){
        boolean isAsec = arr[start] < arr[end];
        while(start <= end){
            int mid = start+ (end - start) / 2;
            if(arr[mid] == target){
                return mid;
            }
            if(isAsec) {
                if (arr[mid] > target) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }else{
                    if(arr[mid] > target){
                        end = mid + 1;
                    }else{
                        start = mid - 1;
                    }
                }
            }
        return -1;
        }
    }

