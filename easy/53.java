//方法一：暴力破解
class Solution {
    public int maxSubArray(int[] nums) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            int j = i;
            int sum = 0;
            while (j < nums.length) {
                sum = sum + nums[j];
                if (sum > max)
                    max = sum;
                j++;
            }
        }
        return max;
    }
}

//方法二：类似动态规划，单次遍历，仅从第一位为正数开始记录，当和变为负数转而寻找新的正数开始记录。期间保存最大值。
class Solution {
    public int maxSubArray(int[] nums) {
        int ans = nums[0];
        int sum = 0;
        for (int num: nums) {
            if (sum > 0)
            sum += num;
            else
            sum = num;
            ans = Math.max(ans, sum);
        }
        return ans;
    }
}