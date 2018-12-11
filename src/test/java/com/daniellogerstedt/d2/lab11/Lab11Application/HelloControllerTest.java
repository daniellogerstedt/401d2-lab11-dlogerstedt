package com.daniellogerstedt.d2.lab11.Lab11Application;

import org.junit.Test;

import static org.junit.Assert.*;

public class HelloControllerTest {

    @Test
    public void testHomepage() {
        HelloController test = new HelloController();
        assertEquals("please proceed to \"/hello\"!", test.homepage());
    }

    @Test
    public void testHellopage() {
        HelloController test = new HelloController();
        assertEquals("hello world!", test.hellopage());
    }

    @Test
    public void testCapitalize() {
        HelloController test = new HelloController();
        assertEquals("WORD", test.capitalize("word"));
        assertEquals("WORDS TO CAPITALIZE", test.capitalize("words to capitalize"));
        assertEquals("WORDS TO CAPITALIZE", test.capitalize("words TO capitalize"));
    }

    @Test
    public void testCapitalizeNoInput() {
        HelloController test = new HelloController();
        assertEquals("Please add a word to capitalize like this: \"capitalize/yourwordshere\"", test.capitalize());
    }
}