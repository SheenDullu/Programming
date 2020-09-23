package com.practice.code.string;

import org.junit.Test;

import static org.junit.Assert.*;

public class URLifyTest {

    @Test
    public void replaceAllSpace() {
        assertEquals("Check for \'Mr John Smith   \'", "Mr%20John%20Smith",
                URLify.replaceAllSpace("Mr John Smith   "));
    }

    @Test
    public void replaceAllSpaceWithInBuiltMethod() {
        assertEquals("Check for \'Mr John Smith   \'", "Mr%20John%20Smith",
                URLify.replaceAllSpaceWithInBuiltMethod("Mr John Smith   "));
    }
}