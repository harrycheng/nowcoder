package com.hc.nowcoder;
import java.util.ArrayList;
import java.util.TreeSet;

public class GetLeastNumbers {
	public ArrayList<Integer> GetLeastNumbers_Solution(int[] input, int k) {	
		if(k > input.length) {
			return new ArrayList<Integer>();
		}
				
		TreeSet<Integer> ts = new TreeSet<Integer>();
		for(int i = 0; i<k ; i++) {
			ts.add(input[i]);
		}
		
		for(int i = k; i<input.length ; i++) {
			int highest = ts.last();
			int current = input[i];
			if(highest < current) {
				continue;
			} else {
				ts.pollLast();
				ts.add(current);
			}						
		}
		
		ArrayList<Integer> r = new ArrayList<Integer>(ts);
		return r;
	}
	
	public static void main(String[] args) {
		GetLeastNumbers gln = new GetLeastNumbers();
		ArrayList<Integer> al = gln.GetLeastNumbers_Solution(new int[] {10, 22,444, 4,5,1,6,2,7,3,8,9}, 4);
		CommonPrint.print(al);		
	}
}
