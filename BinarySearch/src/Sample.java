import java.util.*;
import java.io.*;

class Sample {
    public static void main(String[] argh) {
        List<Integer> strList = new ArrayList<Integer>();
        strList.add(1);
        strList.add(3);
        strList.add(2);
        marcsCakewalk(strList);
    }

    public static void marcsCakewalk(List<Integer> calorie) {
        // Write your code here
        Collections.sort(calorie);
        long result = 0;
        System.out.println(calorie);
        for (int i = calorie.size() - 1, j = 0; i >= 0 ; i--,j++) {
            result += calorie.get(i) * Math.pow(2, j);
            System.out.println(result);
        }

    }

}