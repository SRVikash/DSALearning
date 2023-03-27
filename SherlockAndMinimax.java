package HackerEarth;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SherlockAndMinimax {
    public static void main(String[] args) {
        List<Integer> arr = Arrays.asList(5, 8, 14);
        int p = 4;
        int q = 9;
        ArrayList<ArrayList<Integer>> appendedArray = new ArrayList<ArrayList<Integer>>();

        for (int i = 0; i < arr.size(); i++) {
            ArrayList<Integer> MArray = new ArrayList<Integer>();
            for (int j = p; j <= q; j++) {
                MArray.add(Math.abs(arr.get(i) - j));
            }
            appendedArray.add(MArray);
        }

        for (int i = 0; i < appendedArray.size(); i++) {
            for (int j = 0; j < appendedArray.get(i).size(); j++) {
                System.out.println(j);
            }
            System.out.println(appendedArray.get(i));
        }
    }
}
