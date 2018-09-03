package com.hc.nowcoder;

public class GetUglyNumber {

    public int GetUglyNumber_Solution(int index) {    
    	if(index < 1) {
    		return 0;
    	}
    	
    	int[] uglyArray = new int[index];
    	uglyArray[0] = 1;
    	
    	int twoCount = 0;
    	int threeCount = 0;
    	int fiveCount = 0;
    	
    	for(int i = 1; i < index; i++) {
    		int nextTwo = uglyArray[twoCount] * 2;
    		int nextThree = uglyArray[threeCount] * 3;
    		int nextFive = uglyArray[fiveCount] * 5;
    		
    		int ugly = Math.min(Math.min(nextTwo, nextThree),  nextFive);
    		uglyArray[i] = ugly;
    		if(ugly == nextTwo) {
    			twoCount++;
    		}
    		
    		if(ugly == nextThree) {
    			threeCount++;
    		}
    		
    		if(ugly == nextFive) {
    			fiveCount++;
    		}
    	}
    	    	    	    
    	return uglyArray[index -1];
    }     
    
	public int GetUglyNumber_Solution_outOfTime(int index) {
        int i = 0;
        int count = 0;
        int ugly = 0;
        
        while(count < index) {
        		i++;
        		if(isUgly(i)) {
        			count++;
        			ugly = i;
        		}
        	}
        
        return ugly;
    }            	
        	       
    private boolean isUgly( int num ) {
    	if(num == 1) {
    		return true;
    	}
    	
    	if(num < 1) {
    		return false;
    	}
    	
    	while(num % 2  == 0) {
    		num = num / 2;
    	}
    	
    	while(num % 3  == 0) {
    		num = num / 3;
    	}
    	
    	while(num % 5  == 0) {
    		num = num / 3;
    	}
    	
    	return num == 1;
    }
    
    public static void main(String[] args) {
    	GetUglyNumber uglyManager = new GetUglyNumber();
    	System.out.println(uglyManager.GetUglyNumber_Solution(1));
    	System.out.println(uglyManager.GetUglyNumber_Solution(16));
    	
    	System.out.println(uglyManager.GetUglyNumber_Solution_outOfTime(1));
    	System.out.println(uglyManager.GetUglyNumber_Solution_outOfTime(16));
    }
}

