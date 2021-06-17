package com.hc.nowcoder;

import java.util.*;

public class MaxInWindowsSolution {
    public static void main(String[] args) {
        int[] src = {2, 3, 4, 2, 6, 2, 5, 1};
        ArrayList<Integer> maxList = maxInWindows(src, 3);
        System.out.println(maxList);
    }

    // [2,3,4,2,6,2,5,1],3
    public static ArrayList<Integer> maxInWindows(int[] num, int size) {
        ArrayList<Integer> res = new ArrayList<>();
        if (num == null || size <= 0 || num.length < size) {
            return res;
        }

        // 使用双端队列 缓存滑动窗口，最大值保存在头部
        ArrayDeque<Integer> queue = new ArrayDeque<>();
        int len = num.length;

        for (int i = 0; i < len; i++) {
            // 从后面依次弹出队列中比当前num值小的元素，同时也能保证队列首元素为当前窗口最大值下标
            while (!queue.isEmpty() && num[queue.peekLast()] <= num[i]) {
                queue.pollLast();
            }
            // 当队首元素坐标对应的num不在窗口中，需要弹出
            if (!queue.isEmpty() && i - queue.peekFirst() + 1 > size) {
                queue.pollFirst();
            }
            // 把每次滑动的num下标加入队列
            queue.offerLast(i);
            // 当滑动窗口首地址i大于等于size时才开始写入窗口最大值
            if (i + 1 >= size) {
                res.add(num[queue.peekFirst()]);
            }
        }

        return res;
    }
}
