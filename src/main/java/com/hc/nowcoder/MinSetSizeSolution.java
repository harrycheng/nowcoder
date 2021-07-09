package com.hc.nowcoder;

import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MinSetSizeSolution {
    public int minSetSize(int[] arr) {
        Map<Integer, Integer> coutMap = new HashMap<>();
        for (int i : arr) {
            if (coutMap.containsKey(i)) {
                coutMap.put(i, coutMap.get(i) + 1);
            } else {
                coutMap.put(i, 1);
            }
        }

        List<Integer> countList = coutMap.values().stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());

        int v = 0;
        int i = 0;
        for (; i < countList.size(); i++) {
            v = v + countList.get(i);
            if (v > arr.length / 2) {
                return i + 1;
            }
        }
        return i;
    }
}
