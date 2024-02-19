import java.util.Arrays;
public class Numbers{
    public static void main(String[] args) {
        int[] arr={12,3,56,7,99};
        rev(arr,0,arr.length-1);
        System.out.println((arr));
    }
    static void rev(int[] arr,int start,int end){


        int temp;
               while(start<end){
                temp=arr[start];
                arr[start]=arr[end];
                arr[end]=temp;
                start++;
                end--;
       }

    }
}
