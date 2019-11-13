class Solution {
    public int lengthOfLastWord(String s) {
        if (s.length() == 0)
            return 0;
        int count = 0;
        boolean flag = false;
        for (int i = s.length() - 1; i >= 0; i-- ){
            if (s.charAt(i) != ' ')
                flag = true;
            if (flag) {
                if (s.charAt(i) == ' '){
                    return count;
                }
                count++;
            }
        }
        return count;
    }
}