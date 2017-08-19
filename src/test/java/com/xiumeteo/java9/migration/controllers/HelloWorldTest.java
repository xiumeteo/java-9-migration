package com.xiumeteo.java9.migration.controllers;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertThat;

public class HelloWorldTest {

    @Test
    public void testCumbersomeMath() {
        HelloWorld helloWorld = new HelloWorld();
        final String cumbersomeMath = helloWorld.getCumbersomeMath();

        assertNotNull(cumbersomeMath);
        assertThat(cumbersomeMath, is("Math is OK"));
    }

}