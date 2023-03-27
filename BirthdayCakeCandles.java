package HackerEarth;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class BirthdayCakeCandles {
    public static void main(String[] args) {
        List<Integer> candles = Arrays.asList(3, 2, 1, 3, 4, 4, 4);
        int maxVal =  Collections.max(candles);;
        int count = 0;
        for (int i = 0; i < candles.size(); i++) {
            if (maxVal == candles.get(i))
                count = count + 1;
        }

        System.out.println(count);
    }
}
