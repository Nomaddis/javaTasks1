package com.softserve.edu;

import java.io.BufferedReader;
import java.util.Scanner;

/**
 * @author Serhiy Input class
 */
public class Input {
    /**
     * @param s String to preview
     * @return read line
     */
    public int getNumber(final String s) {
        // BufferedReader reader = new BufferedReader(new
        // InputStreamReader(System.in));
        Scanner in = new Scanner(System.in);
        System.out.println(s);
        return in.nextInt();
    }
}