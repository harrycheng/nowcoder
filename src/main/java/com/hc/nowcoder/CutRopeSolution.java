package com.hc.nowcoder;

public class CutRopeSolution {
    public int cutRope(int target) {
        int countOfTow = target / 3;
        if (target % 3 == 0) {
            return (int) Math.pow(3, countOfTow);
        } else if (target % 3 == 1) {
            return (int) Math.pow(3, countOfTow - 1) * 4;
        } else {
            return (int) Math.pow(3, countOfTow) * 2;
        }
    }
}
