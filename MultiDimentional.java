package HackerEarth;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MultiDimentional {
    public static void main(String[] args) {
        ArrayList<List<Integer>> group = new ArrayList<List<Integer>>();
        group.add(Arrays.asList(3));
        group.add(Arrays.asList(11,2,4));
        group.add(Arrays.asList(4,5,6));
        group.add(Arrays.asList(10,8,-12));

        int leftDiagonal = 0;
        int rightDiagonal = 0;

        for (int i = 0; i < group.size(); i++) {
            leftDiagonal += group.get(i).get(i);
            rightDiagonal += group.get(i).get(group.size() - 1 - i);
        }
        
        System.out.println(Math.abs(leftDiagonal - rightDiagonal));

    }
}
