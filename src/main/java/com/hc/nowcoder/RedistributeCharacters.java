package com.hc.nowcoder;

import java.util.HashMap;
import java.util.Map;

public class RedistributeCharacters {
    public static void main(String[] args) {
        System.out.println("RedistributeCharacters");
        String[] input = {"abc", "aabc", "bc"};
        String[] input2 = {"ab","a"};

        System.out.println(makeEqual(input));
        System.out.println(makeEqual(input2));
    }

    public static boolean makeEqual(String[] words) {
        Map<Character, Integer> charCountsMap = new HashMap<>();
        for (String s : words) {
            for (int i = 0; i < s.length(); i++) {
                char c = s.charAt(i);
                if (charCountsMap.containsKey(c)) {
                    charCountsMap.put(c, charCountsMap.get(c) + 1);
                } else {
                    charCountsMap.put(c, 1);
                }
            }
        }

        int size = words.length;
        for (Map.Entry<Character, Integer> theCount : charCountsMap.entrySet()) {
            if (theCount.getValue() % size != 0) {
                return false;
            }
        }
        return true;
    }
}
