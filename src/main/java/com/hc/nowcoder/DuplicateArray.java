package com.hc.nowcoder;

import java.util.Set;
import java.util.TreeSet;

public class DuplicateArray {

    public static void main(String[] args) {
        int n = duplicate(new int[]{2, 3, 1, 0, 2, 5, 3});
        System.out.println(n);
    }

    public static int duplicate(int[] numbers) {

        // write code here
        Set<Integer> numset = new TreeSet<Integer>();
        for (int n : numbers) {
            if (numset.contains(new Integer(n))) {
                return n;
            } else {
                numset.add(new Integer(n));
            }
        }
        return -1;
    }
}
