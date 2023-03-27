package HackerEarth;

import java.util.Arrays;
import java.util.List;

public class PlusMinus {
    public static void main(String[] args) {
        List<Integer> arr = Arrays.asList(1,1,0,-1,-1);
        float positive = 0;
        float negative = 0;
        float zero = 0;

        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) > 0) {
                positive++;
            } else if (arr.get(i) < 0) {
               negative++;
            } else {
                zero++;
            }
        }
        System.out.println( String.format("%.6f", (positive / arr.size())));
        System.out.println( String.format("%.6f", (negative / arr.size())));
        System.out.println( String.format("%.6f", (zero / arr.size())));
    }
}
