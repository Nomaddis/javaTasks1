package com.softserve.edu;

import java.util.ArrayList;

/**
 * Given a natural number n. Find all Marsens number less then n.
 */
public final class ThirdRunner {
    /**
     * constructor.
     */
    private ThirdRunner() {
        //not called
     }
/**
 * @param arg number
 */
    public static void main(final String[] arg) {
        Input input = new Input();
        int n = input.getNumber("Enter n:");
        Third marsens = new Third();
        ArrayList<Double> findMarsens = marsens.findMarsens(n);
        System.out.println("Marsen numbers are:" + findMarsens);
    }
}
