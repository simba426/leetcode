class Solution {
    public String countAndSay(int n) {
        StringBuilder sb = new StringBuilder();
        sb.append("1");
        n--;
        while (n > 0) {
            StringBuilder sbt = new StringBuilder();
            for (int i = 0; i < sb.length(); i++){
                int count = 0;
                int j = i;
                while (j < sb.length() && sb.charAt(j) == sb.charAt(i)){
                    j++;
                    count++;
                }
                sbt.append(count);
                sbt.append(sb.charAt(i));
                i = j - 1;
            }
            sb = sbt;
            n--;
        }
        return sb.toString();
    }
}