package com.softserve.edu;


/**
 * Given a natural number n, m. Calculate the sum of last m digits of the number
 * n.
 */
public class First {

    /**
     * @param a number.
     * @param b how much number to add.
     * @return sum of m numbers in n.
     */
    public static int calculateSum(final int a, final int b) {
        if (a < b || b < 0) {
            System.out.println(
                    "Please enter valid number. m must be less then n and m>0");
        }
        int[] digits = Integer.toString(a).chars().map(c -> c -= '0').toArray();
        int sum = 0;
        for (int i = (digits.length - b); i < digits.length; i++) {
            sum += digits[i];
        }
        return sum;
    }
    /**
     * @param args some arguments.
     */
    public static void main(final String[] args) {
        Input input = new Input();
        int n = input.getNumber("Enter n");
        int m = input.getNumber("Enter m less then n");
        int mySum = calculateSum(n, m);
        System.out.println("Your sum of m numbers is " + mySum);
    }
}
