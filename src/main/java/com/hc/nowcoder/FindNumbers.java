package com.hc.nowcoder;

import java.util.ArrayList;

public class FindNumbers {
    public static void main(String[] args){
        FindNumbers fnws = new FindNumbers();
        ArrayList<Integer> re = fnws.FindNumbersWithSum( new int[]{ 2,3,4,5,6,7,8}, 11);
        fnws.print(re);
        String b = " ";
        String a = b.trim();
        boolean r = a == "";
        boolean r2 = a.isEmpty();
        String c = new String("a");
        String d = new String("a");
        boolean e = c == d;
        System.out.print(a);
    }

    public void print(ArrayList<Integer> items) {
        for(Integer i: items){
            System.out.print(String.format("%d ", i));
        }
    }

    public ArrayList<Integer> FindNumbersWithSum(int[] array, int sum) {
        ArrayList<Integer> result = new ArrayList<Integer>();
        int start = 0;
        int end = array.length - 1;

        while (start < end){
            int tempSum = array[start] + array[end];
            if(array[start] + array[end] == sum){
                result.add(array[start]);
                result.add(array[end]);
                return result;
            } else if(tempSum < sum){
                start++;
            } else {
                end --;
            }
        }
        return result;
    }
}
