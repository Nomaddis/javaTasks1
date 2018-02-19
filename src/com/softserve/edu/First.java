package com.softserve.edu;
/**
 * @author Serhiy
 *
 */
public class First {
    /**
     * Check numbers for valid.
     * @param a first number for check.
     * @param b second number for check.
     * @return boolean is valid.
     */
    public boolean isValid(final int a, final int b) {
        if (((Math.abs(a) + "").length()) < b) {
            return false;
        } else {
            return true;
        }
    }
    /**
     * @param a number.
     * @param b how much number to add.
     * @return sum of m numbers in n.
     */
    public int calculateSum(final int a, final int b) {
        int[] digits = Integer.toString(a).chars().map(c -> c -= '0').toArray();
        int sum = 0;
        for (int i = (digits.length - b); i < digits.length; i++) {
            sum += digits[i];
        }
        return sum;
    }
}
