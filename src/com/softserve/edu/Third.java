package com.softserve.edu;

import java.util.ArrayList;

/**
 * 559. Дано натуральное число n. Найти все меньшие n числа Марсена.
 */
class Third {

    /**
     * Find all Marsens numbers less then n.
     * @param n number.
     * @return return Marsen numbers less then n.
     */
    public static ArrayList<Double> findMarsens(final int n) {
        ArrayList<Double> marsennums = new ArrayList<>();
        for (int i = 0; i <= n; i++) {
            double element = Math.pow(2.0, i + 1.0) - 1.0;
            if (element <= n) {
                marsennums.add(element);
            }
        }
        return marsennums;
    }
/**
 * @param arg number
 */
    public static void main(final String[] arg) {
//        Scanner in = new Scanner(System.in);
//        System.out.println("Enter n: ");
//        int n = in.nextInt();

        Input input = new Input();
        int n = input.getNumber("Enter n:");

        ArrayList<Double> marsennums = new ArrayList<>();
        for (int i = 0; i <= n; i++) {
            double element = Math.pow(2.0, i + 1.0) - 1.0;
            if (element <= n) {
                marsennums.add(element);
            }
        }
        ArrayList<Double> findMarsens = findMarsens(n);
        System.out.println("Marsen numbers are:" + findMarsens);
    }
}
