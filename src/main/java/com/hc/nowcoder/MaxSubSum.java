package com.hc.nowcoder;

public class MaxSubSum {
    public int FindGreatestSumOfSubArray(int[] array) {
        int maxSum = Integer.MIN_VALUE;
        int sum = 0;
        
        for(int i = 0; i < array.length; ++i)
        {
 
            if(sum < 0)
            {
            	//和小于零时，不参与下次累积； 赋值为当前数。
                sum = array[i];
            }
            else
            {            	
            	//和大于零时，参与下次累积
                sum += array[i];
            }
                        
            if(sum > maxSum)
            {
                maxSum = sum;
            }
        }
        
        return maxSum;		
    }
    
    
    public static void main(String[] args) {
    	MaxSubSum mss = new MaxSubSum();
    	//
    	int max = mss.FindGreatestSumOfSubArray(new int[] {-2,-8,-1,-5,-9});
    	System.out.println(max);
    }
}
