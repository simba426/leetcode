//解法1: 使用队列来接受每一位的数字，使用long型接收超过32位的数字。
class Solution {
    public int reverse(int x) {
        boolean isNegative = false;
        LinkedList<Integer> q = new LinkedList<Integer>();
        while (x != 0) {
            q.add(x % 10);
            x = x / 10;
        }
        long res = 0;
        while (q.size() != 0) {
            res = res * 10 + q.poll();
        }
        if (res > Integer.MAX_VALUE || res < Integer.MIN_VALUE)
            return 0;
        else
            return (int)res;
    }
}

//解法2: 没有使用队列的精简版 
class Solution {
    public int reverse(int x) {
        long rs = 0;
        while(x != 0){
            rs = rs*10 + x%10;
            x /= 10;
        }
        return (rs<Integer.MIN_VALUE || rs>Integer.MAX_VALUE) ? 0:(int)rs;
    }
}