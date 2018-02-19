package com.softserve.edu;

import java.util.ArrayList;
import java.util.Arrays;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
/**
 * @author Serhiy
 *
 */
public class ThirdTest {
    Third third = new Third();
    /**
     * @return actual and expected
     */
    @DataProvider(name = "data-provider")
    public final Object[][] dataProviderMethod() {
        return new Object[][] {
                {10, new ArrayList<Double>(Arrays.asList(1.0, 3.0, 7.0)) },
                {4, new ArrayList<Double>(Arrays.asList(1.0, 3.0)) },
                {17, new ArrayList<Double>(
                        Arrays.asList(1.0, 3.0, 7.0, 15.0)) } };
    }
/**
 * @param number1 number from command line
 * @param expected Marsen`s numbers
 */
    @Test(dataProvider = "data-provider")
    public void testMethod(final int number1,
            final ArrayList<Double> expected) {
        ArrayList<Double> actual = new Third().findMarsens(number1);
        Assert.assertEquals(actual, expected);
    }
}
