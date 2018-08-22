package com.hc.nowcoder;

import java.util.Map;
import java.util.TreeMap;

public class MoreThanHalfNum {
    public int MoreThanHalfNum_Solution(int [] array) {
    	Map<Integer, Integer> map = new TreeMap<Integer, Integer>();
    	for( int key : array) {    		
    		if(! map.containsKey(key) ) {
    			map.put(key, 1);
    		} else {
    			int count = map.get(key);
    			map.put(key, count + 1);
    		}    			
    	}
    	
    	int length = array.length;;
    	for(Map.Entry<Integer, Integer> item : map.entrySet()) {        		    	
    		if(item.getValue() > length /2) {
    			return item.getKey(); 
    		}
    	}
    	
    	return 0;    	
    }
    
    
    public static void main(String[] args) {
    	MoreThanHalfNum mtn = new MoreThanHalfNum();
    	int r = mtn.MoreThanHalfNum_Solution(new int[] { 1, 2, 3, 2, 2, 2, 5, 4, 2 });
    	System.out.println(r);
    	
    }
}
