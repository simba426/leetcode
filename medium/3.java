//方法一：暴力破解。使用哈希表作为查找表，将每次最长无重复子串保存在哈希表中，并将获得的新字符与表中的字符进行比较，查找是否有重复元素存在。
//缺点是每次找到重复元素后，方法是回到前面，从重复元素之后的一个元素开始重新遍历，所以时间复杂度较高
class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<String, Integer> map = new HashMap<>();
        int len = 0;
        int maxLen = 0;
        for (int i = 0; i < s.length(); i++) {
            if (map.containsKey(s.substring(i, i + 1))) {
                int index = map.get(s.substring(i, i + 1));
                map.clear();
                i = index;
                len = 0;
            }
            else {
                map.put(s.substring(i, i + 1), i);
                len += 1;
                if (len > maxLen)
                    maxLen = len;
            }
        }
        return maxLen;
    }
}

//方法二：同样是哈希表，思路是滑动窗口。同样是使用它作为查找表，但当找到窗口前端后，前端之前的元素依然在哈希表中。为了避免这些
//元素对查找结果的影响，很巧妙的一步是使用i = Math.max(map.get(s.charAt(j)), i)来避免窗口再往前滑，也就自动屏蔽了之前的元素。
//
class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        int ans = 0;
        for (int j = 0, i = 0; j < s.length(); j++) {
            if (map.containsKey(s.charAt(j))){
                //左边界移动到 相同字符的下一个位置和i当前位置中更靠右的位置，这样是为了防止i向左移动
                i = Math.max(map.get(s.charAt(j)), i);
            }
            // value为j+1是为了当出现重复字符时，i直接跳到上个相同字符的下一个位置，if中取值就不用+1了
            map.put(s.charAt(j), j + 1);
            ans = Math.max(ans, j - i + 1);
        }
        return ans;
    }
}