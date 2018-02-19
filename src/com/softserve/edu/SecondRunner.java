package com.softserve.edu;

import java.util.ArrayList;

/**
 * Given a natural number n, m. Calculate all natural common multiple,
 * less then m*n.
 */
public final class SecondRunner {
    /**
     * helper.
     */
    private SecondRunner() {
        //not called
     }

    /**
     * @param arg number
     */
    public static void main(final String[] arg) {
        Input input = new Input();
        Second second = new Second();
        int n = input.getNumber("Enter n:");
        int m = input.getNumber("Enter m:");
        ArrayList<Integer> mycommon = second.findCommon(n, m);
        System.out.print("Your common number is: " + mycommon);
    }
}
