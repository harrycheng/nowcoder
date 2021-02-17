package com.hc.nowcoder;

public class Continuous {
    public boolean isContinuous(int[] numbers) {
        if(numbers == null || numbers.length == 0){
            return false;
        }
        int numOfZero = 0;
        int interval = 0;
        java.util.Arrays.sort(numbers);
        for (int i = 0; i < numbers.length - 1; i++) {
            if (numbers[i] == 0) {
                numOfZero++;
                continue;
            }
            if (numbers[i] == numbers[i + 1]) {
                return false;
            }

            interval+= numbers[i+1] - numbers[i] - 1;
        }

        if( interval <= numOfZero){
            return true;
        } else {
            return  false;
        }
    }
}
