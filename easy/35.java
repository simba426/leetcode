class Solution {
    public int searchInsert(int[] nums, int target) {
        int length = nums.length;
        int left = 0;
        int right = length;
        if (length == 0)
            return 0;
        while (left < right) {
            int mid = (left + right) >>> 1;
            if (target > nums[mid])
                left = mid + 1;
            else
                right = mid;
        }
        return left;
    }
}