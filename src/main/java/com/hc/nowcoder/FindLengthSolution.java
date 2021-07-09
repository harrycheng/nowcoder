package com.hc.nowcoder;

public class FindLengthSolution {
    /*
     * A: [1,2,3,2,1]
     * B: [3,2,1,4,7]
     * dp[a.lenght][B.lenght]
     *   1,2,3,2,1
     * 3 0 0 1 0 0
     * 2 0 1 0 2 0
     * 1 1 0 0 0 3
     * 4 0 0 0 0 0
     * 7 0 0 0 0 0
     * */

    public static void main(String[] args) {
        int a[] = {1, 2, 3, 2, 1};
        int b[] = {3, 2, 1, 4, 7};
        System.out.println(new FindLengthSolution().findLength(a, b));
    }

    public int findLength(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;
        int dp[][] = new int[m + 1][n + 1];
        int ret = 0;
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                dp[i][j] = nums1[i - 1] == nums2[j - 1] ? 1 + dp[i - 1][j - 1] : 0;
                ret = ret >= dp[i][j] ? ret : dp[i][j];
            }
        }
        return ret;
    }

}
