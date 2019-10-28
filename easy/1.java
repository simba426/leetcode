//解法一：遍历
class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] a = new int[2];
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    a[0] = i;
                    a[1] = j;
                }
            }
        }
        return a;
    }
}

//解法二：遍历一次数组，期间使用HashMap保存每一个元素与target之间的差值，后面的元素从hash表中查找是否有匹配的差值
import java.util.HashMap;
import java.util.Map;
class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> hash = new HashMap<>();
        int[] index = new int[2];
        for (int i = 0; i < nums.length; i++) {
            if (hash.containsKey(nums[i])){
                index[0] = i;
                index[1] = hash.get(nums[i]);
                return index;
            }
            else {
                hash.put(target - nums[i], i);
            }
        }
    return index;
    }
}

