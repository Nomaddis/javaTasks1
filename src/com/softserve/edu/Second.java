package com.softserve.edu;

import java.util.ArrayList;

/**
 * 226.ƒаны натуральные числа m, n. ѕолучить все их. натуральные общие кратные,
 * меньшие m*n.
 */
public class Second {
    /**
     * @param a first number.
     * @param b second number.
     * @return array list with common numbers.
     */
    public static ArrayList<Integer> findCommon(final int a, final int b) {
        int max = a * b;
        ArrayList<Integer> common = new ArrayList<>();
        for (int i = 1; i <= max; i++) {
            if (i % a == 0 && i % b == 0) {
                common.add(i);
            }
        }
        //int[] array = common.stream().mapToInt(i -> i).toArray();
        return common;
    }

    /**
     * @param arg number
     */
    public static void main(final String[] arg) {
        Input input = new Input();
        int n = input.getNumber("Enter n:");
        int m = input.getNumber("Enter m:");
        ArrayList<Integer> mycommon = findCommon(n, m);
        System.out.print("Your common number is: " + mycommon);
    }
}
