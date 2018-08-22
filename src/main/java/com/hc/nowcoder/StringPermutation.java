package com.hc.nowcoder;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class StringPermutation {
    public ArrayList<String> Permutation(String str) {
        char[] c = str.toCharArray();                        
        ArrayList<String> list = new ArrayList<String>();        
        if(c.length == 0) {
			return list ;
		}
        Permutation(list , c, 0);
        
        
        Set<String> set = new TreeSet<String>();
        set.addAll(list);
        
        list = new ArrayList<String>(set);
        return list;
    }

	private void Permutation(ArrayList<String> list, char[] c, int index) {				
		if( index >= c.length) {
			list.add(String.valueOf(c));
		} else {
			for(int i = index; i< c.length; i++) {
				char temp = c[i];
				c[i] = c[index];
				c[index] = temp;
				Permutation(list, c, index+1);
				
				temp = c[i];
				c[i] = c[index];
				c[index] = temp;
			}
		}
	}
	
	public void print(List<String> list) {
		for(String str : list) {
			System.out.print(str + " ");
		}
		System.out.println(" ");
	}
	
	public static void main(String[] args) {
		StringPermutation sp = new StringPermutation();
		List<String> list = sp.Permutation("aab");
		sp.print(list);
	}
}
