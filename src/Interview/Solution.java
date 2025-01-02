package Interview;

class Solution {
    public static int[] plusOne(int[] digits) {
        for(int i = digits.length - 1; i >= 0; i--) {
            if(digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }
        digits = new int[digits.length + 1];
        digits[0] = 1;
        return digits;
    }

    public static void main(String[] args) {
        int[] digits = {9, 9, 3};
        digits = plusOne(digits);
        for(int i = 0; i < digits.length; i++) {
            System.out.print(digits[i] + " ");
        }
    }
}