package com.softserve.edu;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
/***
 * @author Serhiy
 */
public class FirstTest {
    First first = new First();
/**
 * @return data for check.
 */
    @DataProvider(name = "calc-data-provider")
    public final Object[][] calculationMethod() {
        return new Object[][] { { 456, 2, 11 }, { -457, 2, 12 }, { 784, 1, 4 }, { 478, 3, 19 }};
    }
/**
 * @param number1 number from command line
 * @param number2 qty of digits to add
 * @param expected true sum
 */
    @Test(dataProvider = "calc-data-provider")
    public void calculationTest(final int number1, final int number2,
            final int expected) {
        int actual = new First().calculateSum(number1, number2);
        Assert.assertEquals(actual, expected);
    }
    /**
     * @return data for check.
     */
    @DataProvider(name = "valid-data-provider")
    public final Object[][] validMethod() {
        return new Object[][] { { 456, 2, true }, { -456, 2, true }, { 656, 4, false }, { 6, 2, false }};
    }
/**
 * @param number1 number from command line
 * @param number2 qty of digits to add
 * @param expected is Valid numbers
 */
    @Test(dataProvider = "valid-data-provider")
    public void validTest(final int number1, final int number2,
            final boolean expected) {
        boolean actual = new First().isValid(number1, number2);
        Assert.assertEquals(actual, expected);
    }
}

