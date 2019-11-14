class Solution {
    public int[] plusOne(int[] digits) {
        int carry = 0;
        if (digits[digits.length - 1] != 9)
            digits[digits.length - 1] += 1;
        else {
            carry = 1;
            for (int i = digits.length - 1; i >= 0; i--) {
                digits[i]  += carry;
                if (digits[i] == 10) {
                    digits[i] = 0;
                    carry = 1;
                }
                else 
                    carry = 0;
            }
            if (carry == 1) {
                int[] new_digits = new int[digits.length + 1];
                new_digits[0] = 1;
                for (int i = 1; i < new_digits.length; i++) {
                    new_digits[i] = digits[i - 1];
                }
                return new_digits;
            }
        }
        return digits;
    }
}