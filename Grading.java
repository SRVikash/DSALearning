package HackerEarth;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Grading {
    public static void main(String[] args) {
        List<Integer> grades = Arrays.asList(72, 67, 38, 33);
        ArrayList<Integer> res = new ArrayList<Integer>();

        for (int i = 0; i < grades.size(); i++) {
            if (grades.get(i) < 40) {
                res.add(grades.get(i));
            } else {
                int f1 = grades.get(i) + 1;
                int f2 = grades.get(i) + 2;
                if (f1 % 5 == 0) {
                    res.add(f1);
                } else if (f2 % 5 == 0) {
                    res.add(f2);
                } else {
                    res.add(grades.get(i));
                }
            }

        }

        System.out.println(res);

    }
}
