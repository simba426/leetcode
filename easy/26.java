class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0)
            return 0;
        int tag = 1;
        for (int i = 0; i < nums.length; i++) {
            if (i == 0)
                continue;
            if (nums[i] == nums[i - 1])
                continue;
            else {
                nums[tag++] = nums[i];
            }
        }
        return tag;
    }
}