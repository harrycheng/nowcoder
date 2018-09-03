package com.hc.nowcoder;

public class PrintMinMumber {
    public String PrintMinNumber(int [] numbers) {
    	for(int i = 0; i < numbers.length - 1; i++) {
    		for(int j = 0; j< numbers.length - 1 - i; j++) {
    			int gap = intCompare(numbers[j],numbers[j+1]);
    			if( gap > 0 ) {
    				swap(numbers, j);
    			}
    		}
    	}    	

    	StringBuilder sb = new StringBuilder();
    	for(int item : numbers) {
    		sb.append(item);
    	}
    	
    	return sb.toString();
    }
    

	private void swap(int[] numbers, int j) {		
		numbers[j] = numbers[j] ^ numbers[j + 1];
		numbers[j + 1] = numbers[j] ^ numbers[j + 1];
		numbers[j] = numbers[j] ^ numbers[j + 1];
	}

	private int intCompare(int a, int b) {        		
	    	String aStr = String.valueOf(a) + String.valueOf(b);
	    	String bStr = String.valueOf(b) + String.valueOf(b);   	    	    	
	    	return aStr.compareTo(bStr);    	    		    	
    }            
    	
	public static void main(String[] args) {
		PrintMinMumber pm = new PrintMinMumber();
		String r = pm.PrintMinNumber(new int[] {3, 32, 321});
		System.out.print(r);
	}
}