package com.hc.nowcoder;

import java.util.LinkedHashMap;

public class FirstNotRepeating {
    public int FirstNotRepeatingChar(String str) {
    	LinkedHashMap<String, Integer> linkedHashMap = new LinkedHashMap<String, Integer>();
        for(int i = 0; i< str.length(); i++) {
        	String key = String.valueOf( str.charAt(i) );
        	if(linkedHashMap.containsKey(key)) {
        		int count =  linkedHashMap.get(key);
        		linkedHashMap.put(key, count+1);
        	} else {
        		linkedHashMap.put(key, 1);        		
        	}
        }
        
        String needString = null;
        for(String s : linkedHashMap.keySet()) {
        	if(linkedHashMap.get(s) == 1) {
        		needString = s;
        		break;
        	}
        }
        
        if(needString == null) {
        	return -1;
        } else {
        	return str.indexOf(needString);
        }
    }
    
    public static void main(String[] args) {
    	FirstNotRepeating firstNotRepeating = new FirstNotRepeating();
    	int r = firstNotRepeating.FirstNotRepeatingChar("aaaaaabbbbbbccccccccdeeeeeeeffffffffffgo");
    	System.out.println(r);
    }
}
