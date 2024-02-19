import java.util.*;
public class Sam1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1, s2,s3;

        sc.nextLine();
        s1 = sc.nextLine();
        s2 = sc.nextLine();
        int len = s1.length();
        char[] arr = new char[s1.length()-1];
        for (int i = 0; i <= len; i++){
            if(s1.charAt(i) == s2.charAt(i)){
                arr[i] = 0;
            }else{
                arr[i] = 1;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
/*
int[] arr = new int[4];
        int[] arr2 =new int[2];

        System.out.println(Arrays.toString(intersection(arr,arr2)));
    }
    static int[] intersection(int[] nums1, int[] nums2) {
        int[] arr = new int[]{ };
        for (int i = 0, k = 0; i < nums1.length; i++, k++){
            for(int j = 0; j < nums2.length; j++){
                if(nums1[i] == nums2[j]){
                    arr [k]= nums2[j];
                }
            }
            return arr;
        }
        return arr;

 */