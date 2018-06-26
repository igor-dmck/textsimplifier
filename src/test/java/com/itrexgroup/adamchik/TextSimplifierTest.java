package com.itrexgroup.adamchik;

import static org.junit.Assert.assertTrue;

import org.junit.Test;


public class TextSimplifierTest
{

    @Test
    public void shouldRemoveC()
    {
        String expectedResult = "suksess";
        TextSimplifier ts = new TextSimplifier();
        String resultString = ts.removeLetterC("success");
        System.out.println(resultString);


        assertTrue( expectedResult.equals(resultString));
    }


    @Test
    public void shouldReplaceDoubleLetter()
    {
        String expectedResult = "simple, Dude, bonjour";
        TextSimplifier ts = new TextSimplifier();
        String resultString = ts.removeDoubleLetter("seemple, Doode, bonjouuuuuuuur");
        System.out.println(resultString);


        assertTrue( expectedResult.equals(resultString));
    }


    @Test
    public void shouldRemoveLastE() {
        String expectedResult = "e email";
        TextSimplifier ts = new TextSimplifier();
        String resultString = ts.removeLastLetterE("e emaile");
        System.out.println(resultString);


        assertTrue(expectedResult.equals(resultString));
    }

    @Test
    public void shouldRemoveArticles() {
        String expectedResult = " cure,  place at,  annotations";
        TextSimplifier ts = new TextSimplifier();
        String resultString = ts.removeArticles("The cure, A place at, An annotations");
        System.out.println(resultString);


        assertTrue(expectedResult.equals(resultString));
    }

}
