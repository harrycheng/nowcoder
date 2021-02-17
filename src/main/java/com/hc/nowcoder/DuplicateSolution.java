package com.hc.nowcoder;

import java.util.Set;
import java.util.TreeSet;

public class DuplicateSolution {
    public boolean duplicate(int numbers[], int length, int[] duplication) {
        Set<Integer> countSet = new TreeSet<Integer>();
        for (int i : numbers) {
            if (countSet.contains(i)) {
                duplication[0] = i;
                return true;
            } else {
                countSet.add(i);
            }
        }

        return false;
    }
}
