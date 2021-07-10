package com.hc.nowcoder;

import java.util.Arrays;

public class LengthOfLISSoution {
    public static void main(String[] args) {
        int[] nums = {10, 9, 2, 5, 3, 7, 101, 18};
        System.out.println(new LengthOfLISSoution().lengthOfLIS(nums));
    }

    public int lengthOfLIS(int[] nums) {
        int l = nums.length;
        int[] dp = new int[l];
        int ret = 1;
        for (int i = 0; i < l; i++) {
            dp[i] = 1;
        }

        for (int i = 1; i < l; i++) {
            int cur = nums[i];
            for (int j = 0; j < i; j++) {
                if (nums[j] < cur) {
                    dp[i] = dp[j] + 1 > dp[i] ? dp[j] + 1 : dp[i];
                }
            }
            ret = ret > dp[i] ? ret : dp[i];
        }
        return ret;
    }


}
