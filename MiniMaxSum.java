package HackerEarth;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MiniMaxSum {
    public static void main(String[] args) {
        List<Integer> arr = Arrays.asList(1, 2, 3, 4, 5);
        ArrayList<Long> sumArray = new ArrayList<Long>();

        for (int i = 0; i < arr.size(); i++) {
            Long sum = (long) 0;
            for (int j = 0; j < arr.size(); j++) {
                if (i != j) {
                    sum += arr.get(j);
                }
            }
            sumArray.add(sum);
        }

        long minVal = sumArray.get(0);
        long maxVal = sumArray.get(0);

        for (int i = 0; i < sumArray.size(); i++) {
            if (sumArray.get(i) < minVal) {
                minVal = sumArray.get(i);
            }
            if (sumArray.get(i) > maxVal) {
                maxVal = sumArray.get(i);
            }
        }
        
        System.out.printf(minVal + " " + maxVal);

    }

    // static int sumOfArrays(List<Integer> arr, int removeVal) {
    //     int sum = 0;
    //     for (int i = 0; i < arr.size(); i++) {
    //         if (arr.get(i) != removeVal)
    //             sum += arr.get(i);
    //     }
    //     return sum;
    // }
}
