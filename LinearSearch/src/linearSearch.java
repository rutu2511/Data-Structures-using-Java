public class linearSearch {
    public static void main(String[] args) {
        int[] a={12,3,45,65,43,99,0};
        System.out.println(searchInRange(a,65,1,4));
    }
    /* static int linear(int[] arr,int target){
         if(arr.length == 0){
             return -1;
         }
         for(int i=0;i<arr.length;i++){
             if(arr[i] == target){
                 return i;
             }
         }
         return -1;
     }

     static boolean linear1(int[] arr,int target){
         if(arr.length == 0){
             return false;
         }
         for(int i=0;i<arr.length;i++){
             if(arr[i] == target){
                 return true;
             }
         }
         return false;
     }*/
    /*static int linear3(int[] arr,int target){
        if(arr.length == 0){
            return -1;
        }
        for (int i:arr) {
            if(i == target){
                return target;
            }
        }
        return -1;
    }*/
    // Search in Range
    static int searchInRange(int[] arr, int target, int start, int end){
        for(int index=start;index<end;index++){
            if(target == arr[index]){
                return index;
            }
        }
        return -1;
    }
}
