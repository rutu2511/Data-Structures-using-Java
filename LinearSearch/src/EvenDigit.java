public class EvenDigit {
    public static void main(String[] args) {
        int[][] arr={
                {12},
                {11,10},
                {3,9},
                {70,1}
        };
        System.out.println(find(arr));
    }
    static int find(int[][] nums){
        int num,cnt=0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                if(even(nums[i][j])){
                    cnt++;
                }
            }
        }
        return cnt;
    }
    static boolean even(int num){
    int digit=totalDigit(num);
    return (digit%2 == 0);
    }
    static int totalDigit(int no){
        int rem=0,count=0;
        while(no>0){
            rem=no%10;
            count++;
            no=no/10;
        }
        return count;
    }
    }


