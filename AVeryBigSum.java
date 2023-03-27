package HackerEarth;

import java.util.Arrays;
import java.util.List;

public class AVeryBigSum
{
    public static void main(String[] args) {
        List<Integer> a = Arrays.asList(1000000001,1000000002,1000000003,1000000004,1000000005);
        Long res = 0l;
        for (int i = 0; i < a.size(); i++) {
            res = res + a.get(i);
        }
        System.out.println(res);
    }
}