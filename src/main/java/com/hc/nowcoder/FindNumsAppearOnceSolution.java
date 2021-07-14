package com.hc.nowcoder;

public class FindNumsAppearOnceSolution {
    public int[] FindNumsAppearOnce(int[] array) {
        // write code here
        int[] re = new int[2];
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            boolean onlyOnce = true;
            for (int j = 0; j < array.length; j++) {
                if (array[i] == array[j] && i != j) {
                    onlyOnce = false;
                }
            }
            if (onlyOnce == true) {
                re[index++] = array[i];
            }
        }
        // write code here
        if (re[0] > re[1]) {
            int temp = re[0];
            re[0] = re[1];
            re[1] = re[temp];
        }
        return re;
    }
}
