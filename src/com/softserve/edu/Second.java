package com.softserve.edu;

import java.util.ArrayList;
/**
 * @author Serhiy
 */
public class Second {
    /**
     * @param a first number.
     * @param b second number.
     * @return array list with common numbers.
     */
    public ArrayList<Integer> findCommon(final int a, final int b) {
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
}
