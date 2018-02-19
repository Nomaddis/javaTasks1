package com.softserve.edu;

import java.util.ArrayList;

/**
 * @author Serhiy
 *
 */
public class Third {
    /**
     * Find all Marsens numbers less then n.
     * @param n number.
     * @return return Marsen numbers less then n.
     */
    public ArrayList<Double> findMarsens(final int n) {
        ArrayList<Double> marsennums = new ArrayList<>();
        for (int i = 0; i <= n; i++) {
            double element = Math.pow(2.0, i + 1.0) - 1.0;
            if (element <= n) {
                marsennums.add(element);
            }
        }
        return marsennums;
    }
}
