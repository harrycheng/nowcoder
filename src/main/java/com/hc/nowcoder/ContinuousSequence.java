package com.hc.nowcoder;

import java.util.ArrayList;

public class ContinuousSequence {
    public static void main(String[] args) {
        ContinuousSequence cs = new ContinuousSequence();
        cs.print( cs.FindContinuousSequence(100) );
    }

    public ArrayList<ArrayList<Integer>> FindContinuousSequence(int sum) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
        for (int n = (int)java.lang.Math.sqrt(2 * sum); n >= 2 ; n--) {
            if (sum % n == 0 && (n & 1) == 1 || (sum % n) * 2 == n && (n & 1) == 0) {
                ArrayList<Integer> temp = new ArrayList<Integer>();
                for (int j = 0, start = sum / n - (n-1)/2; j < n; j++, start++) {
                    temp.add(start);
                }
                result.add(temp);
            }
        }
        return result;
    }

    public void print( ArrayList<ArrayList<Integer>> continuousSequence) {
        for( ArrayList<Integer> list : continuousSequence){
            for( Integer  i : list){
                System.out.print( String.format("%d ", i));
            }
            System.out.println( " " );
        }
    }
}
