package com.softserve.edu;

import java.util.ArrayList;
import java.util.Arrays;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SecondTest {
    Second second = new Second();

    @DataProvider(name = "data-provider")
    public final Object[][] dataProviderMethod() {
        return new Object[][] {
                { 10, 2, new ArrayList<Integer>(Arrays.asList(10, 20)) },
                { 2, 3, new ArrayList<Integer>(Arrays.asList(6)) },
                { 20, 4, new ArrayList<Integer>(
                        Arrays.asList(20, 40, 60, 80)) } };
    }
/**
 * @param number1 number from command line
 * @param number2 number from command line
 * @param expected common number div
 */
    @Test(dataProvider = "data-provider")
    public void testMethod(final int number1, final int number2,
            final ArrayList<Integer> expected) {
        ArrayList<Integer> actual = new Second().findCommon(number1, number2);
        Assert.assertEquals(actual, expected);
    }
}
