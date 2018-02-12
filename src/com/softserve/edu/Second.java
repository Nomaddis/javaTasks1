package com.softserve.edu;

import java.util.Scanner;

/**
 * 226.ƒаны натуральные числа m, n. ѕолучить все их. натуральные общие кратные,
 * меньшие m*n.
 */
public class Second {

    /**
     * @param arg number
     */
    public static void main(String[] arg) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter n: ");
        int n = in.nextInt();
        System.out.println("Enter m: ");
        int m = in.nextInt();
        in.close();
        int max = n * m;
        System.out.print("Your common number is: ");
        for (int i = 1; i <= max; i++) {
            if (i % n == 0 && i % m == 0) {
                System.out.print(i + " ");
            }
        }
    }
}
