class Solution {
    public int romanToInt(String s) {
        Map<String, Integer> hash = new HashMap();
        hash.put("I", 1);
        hash.put("V", 5);
        hash.put("X", 10);
        hash.put("L", 50);
        hash.put("C", 100);
        hash.put("D", 500);
        hash.put("M", 1000);
        hash.put("IV", 4);
        hash.put("IX", 9);
        hash.put("XL", 40);
        hash.put("XC", 90);
        hash.put("CD", 400);
        hash.put("CM", 900);
        
        int ans = 0;
        for (int i = 0; i < s.length(); i++) {
            if (i + 1 < s.length() && hash.containsKey(s.substring(i, i + 2))){
                ans += hash.get(s.substring(i, i + 2));
                i += 1;
            }
            else {
                ans += hash.get(s.substring(i, i + 1));
            }
        }
        return ans;
    }
}