package com.udacity.examples.Testing;

import junit.framework.TestCase;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static org.junit.Assert.assertEquals;

public class HelperTest {



    @Test
    public void testGetCount() {
        List<String> empNames = Arrays.asList("Thomas", "Sabine");
        final long actual = Helper.getCount(empNames);
        assertEquals(2, actual);
    }

    @Test
    public void verify_getMergedList() {
        List<String> names = Arrays.asList("Thomas", "Sabine", "Timo");
        String actual = Helper.getMergedList(names);
        assertEquals("Thomas, Sabine, Timo", actual);
            }

    //public static String getMergedList(List<String> empName) {
    //    return empName.stream().filter(string ->!string.isEmpty()).collect(Collectors.joining(", "));

}
