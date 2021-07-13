package com.hc.nowcoder;

public class LastRemainingSolution {
    public int LastRemaining_Solution(int n, int m) {
        int[] child = new int[n];
        int i = 0;
        int count = 0;
        while ( childCount(child) > 1){
            if(child[i%n] == 0){
                count++;

                if( count == m ){
                    count = 0;
                    child[i % n] = 1;
                }
            }
            i++;
            i = i%n;
        }

        for( int j = 0; i<n; j++){
            if(child[j] == 0){
                return j;
            }
        }
        return  -1;
    }

    private int  childCount(int[] child) {
        int count = 0;
        for(int i : child){
            if(i == 0){
                count++;
            }
        }
        return count;
    }
}
