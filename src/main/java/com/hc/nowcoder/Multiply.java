package com.hc.nowcoder;

import java.util.ArrayList;

public class Multiply {


    public int[] multiply(int[] A) {

        int[] b = new int[A.length];
        for (int i = 0; i < A.length; i++) {
            b[i] = multiply(A, 0, i - 1) * multiply(A, i + 1, A.length - 1);
        }
        return b;
    }

    public int multiply(int[] a, int start, int end) {
        if (start < 0 || end < 0 || start >= end) {
            return 1;
        }

        int r = 1;
        for (int i = start; i <= end; i++) {
            r = r * a[i];
        }

        return r;
    }
}
