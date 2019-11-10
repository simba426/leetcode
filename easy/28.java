//方法一：暴力破解
class Solution {
    public int strStr(String haystack, String needle) {
        if (needle.length() == 0)
            return 0;
        int needle_len = needle.length();
        int haystack_len = haystack.length();
        for (int i = 0; i < haystack_len; i++) {
            if (haystack.charAt(i) == needle.charAt(0) && haystack_len - i >= needle_len)
            {
                for (int j = 0, count = i; j < needle_len; j++, count++) {
                    if (haystack.charAt(count) != needle.charAt(j))
                        break;
                    if (j == needle_len - 1)
                        return i;
                }
            }
        }
        return -1;
    }
}

//方法二
//