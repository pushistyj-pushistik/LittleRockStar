package com.go.little.rockstar.task03;

public class PlusOne {
    public static void main(String[] args) {
        int[] digits = {3,2,9};
        plusOne(digits);
        for (int i = 0; i < digits.length; i++) {
            System.out.println(digits[i]);
        }
    }
        public static int[] plusOne(int[] digits) {
            int n = digits.length;
            for (int i = n - 1; i >= 0; i--) {
                if (digits[i] < 9) {
                    digits[i]++;
                    return digits;
                }
                digits[i] = 0;
            }
            int[] newNumber = new int [n+1];
            newNumber[0] = 1;

            return newNumber;
    }

}

