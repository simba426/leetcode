//解法一：暴力破解（会出现TOL），定义一个函数来判断回文串，然后用O(n2)的方法列出所有可能的字符串逐个判断。
class Solution {
    
    public boolean isPalindrome (String s) {
            int len = s.length();
            for (int i = 0; i < len / 2; i++) {
                if (s.charAt(i) != s.charAt(len - i - 1))
                    return false;
            }
            return true;
        }
    
    public String longestPalindrome(String s) {
        int len = s.length();
        String palindrome = "";
        int maxLen = 0;
        for (int i = 0; i < len; i++) {
            for (int j = i + 1; j <= len; j++) {
                String str = s.substring(i, j);
                if (isPalindrome(str) && str.length() > maxLen){
                    maxLen = str.length();
                    palindrome = str;
                }
            }
        }
        return palindrome;
    }   
}

//解法二：反转后求最长公共子串，用动态规划法。
class Solution {
public String longestPalindrome(String s) {
    if (s.equals(""))
    	return "";
    String origin = s;
    String reverse = new StringBuffer(s).reverse.toString();
    
}