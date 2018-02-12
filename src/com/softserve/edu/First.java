package com.softserve.edu;

import java.util.Scanner;

/**
 * 87. Даны натуральное n, m. Получить сумму m последних цифр
 * числа n.
 */
public class First {

    /**
     * @param args number.
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter n: ");
        int n = in.nextInt();
        System.out.println("Enter m less then n: ");
        int m = in.nextInt();
        in.close();
        int[] digits = Integer.toString(n).chars().map(c -> c -= '0').toArray();
        int sum = 0;
        for (int i = (digits.length - m); i < digits.length; i++) {
            System.out.print(digits[i]);
            sum += digits[i];
        }
        System.out.println("Your sum of m numbers is " + sum);
    }
}
