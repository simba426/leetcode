//方法一：看作二叉树问题，每一个节点分为走一步和走两步两种情况，到达条件后为叶子结点。和暴力法的区别是多添加了一个memo数组用于记录之前已经到达过的结点的状态值，避免重复计算。
class Solution {
    public int climbStairs(int n) {
        int[] memo = new int[n + 1];
        return climb_stairs(0, n, memo);
    }

    public int climb_stairs(int i, int n, int[] memo) {
        if (i > n)
            return 0;
        if (i == n)
            return 1;
        if (memo[i] > 0) 
            return memo[i];
        memo[i] = climb_stairs(i + 1, n, memo) + climb_stairs(i + 2, n, memo);
        return memo[i];
    }
}
//方法二：动态规划，看作最优子问题之和。到达第i阶的方法数是到达第(i-1)阶和第(i-2)阶的方法数之和。即dp[i] = dp[i-1] + dp[i-2]
class Solution {
    public int climbStairs(int n) {
        if (n == 1)
            return 1;
        int[] dp = new int[n + 1];
        dp[1] = 1;
        dp[2] = 2;
        for (int i = 3; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        return dp[n];
    }
}