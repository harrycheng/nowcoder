package com.hc.nowcoder;

import java.util.LinkedList;
import java.util.List;

public class ReOrderArraySolution {
    public int[] reOrderArray(int[] array) {
        // write code here
        List<Integer> r = new LinkedList<Integer>();
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                r.add(array[i]);
            }
        }

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                r.add(array[i]);
            }
        }

        return r.stream().mapToInt(Integer::valueOf).toArray();

    }
}
