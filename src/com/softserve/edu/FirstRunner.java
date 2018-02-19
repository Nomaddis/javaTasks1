package com.softserve.edu;

/**
 * Given a natural number n, m. Calculate the sum of last m digits of the number
 * n.
 */
public final class FirstRunner {
    /**
     * constructor.
     */
    private FirstRunner() {
        //not called
     }

    /**
     * @param args some arguments from command line.
     */
    public static void main(final String[] args) {
        Input input = new Input();
        First first = new First();
        int n = input.getNumber("Enter n");
        int m = input.getNumber("Enter m less then n");
        if (first.isValid(n, m)) {
            int mySum = first.calculateSum(n, m);
            System.out.println("Your sum of m numbers is " + mySum);
        } else {
            System.out.println(
                    "Please enter valid number. m must be less then n and m>0");
        }
    }
}
