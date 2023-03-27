package HackerEarth;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public interface CompareTriplets {
    public static void main(String[] args) {
        List<Integer> a = Arrays.asList(1, 2, 3);
        List<Integer> b = Arrays.asList(3, 2, 1);
        List<Integer> c = new ArrayList<Integer>();
        int aliceScore = 0;
        int bobScore = 0;

        for (int i = 0; i < a.size(); i++) {
            if (a.get(i) > b.get(i)) aliceScore++;
            if (a.get(i) < b.get(i)) bobScore++;
        }

        c.add(0,aliceScore);
        c.add(1, bobScore);
        
        System.out.println(c);
    }
}
