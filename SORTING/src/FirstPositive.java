public class FirstPositive {
    public static void main(String[] args) {
        int[] arr = {4,1,-1,3};
        System.out.println(findFirstPositive(arr));
    }

    static int findFirstPositive(int[] arr){
        int i = 0;
        while(i < arr.length){
            int correct = arr[i] - 1;
            if(arr[i] > 0 && arr[i] <= arr.length && arr[i] != arr[correct]){
                swap(arr,i,correct);
            }else{
                i++;
            }
        }
        for(int index = 0;index < arr.length; index++){
            if(arr[index] != index+1){
                return index+1;
            }
        }
        return arr.length+1;
    }
    static void swap(int[] nums, int first, int second) {
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }
}
