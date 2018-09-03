package com.hc.nowcoder;

public class NumberOf1Between1AndN {
	public int NumberOf1Between1AndN_Solution(int n) {
		int count = 0;
		for(int i = 1; i <= n; i++) {
			count += NumOfOne(i);
		}
		return count;
    }

	private int NumOfOne(int i) {
		int num = 0;
		while( i > 0 ) {
			if(i % 10 == 1) {
				num ++;
			} 
			i = i / 10;
		}
		return num;
	}
	
	
	public static void main(String[] args) {
		NumberOf1Between1AndN numberOf1Between1AndN = new NumberOf1Between1AndN();
		int r = numberOf1Between1AndN.NumberOf1Between1AndN_Solution(13);
		System.out.println(r);		
	}
}
