class Solution {
    public boolean isValid(String s) {
        if (s.length() == 0)
            return true;
        Stack<Integer> stack = new Stack();
        for (int i = 0; i < s.length(); i++) {
            switch (s.charAt(i)){
                case '(':
                    stack.push(1);
                        break;
                case ')':
                    if (stack.empty() || 1 != stack.pop())
                        return false;
                    break;
                case '[':
                    stack.push(2);
                        break;
                case ']':
                    if (stack.empty() || 2 != stack.pop())
                        return false;
                    break;
                case '{':
                    stack.push(3);
                    break;
                case '}':
                    if (stack.empty() || 3 != stack.pop())
                        return false;
                    break;            
            }
        }
        if (stack.empty())
            return true;
        else 
            return false;
    }
}