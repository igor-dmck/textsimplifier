package com.itrexgroup.adamchik;

import static org.junit.Assert.assertTrue;

import org.junit.Test;


public class TextSimplifierTest
{

    @Test
    public void shouldReplaceCeOnSe()
    {
        String expectedResult = "sucsess";
        TextSimplifier ts = new TextSimplifier();
        String resultString = ts.replaceCe("success");
        System.out.println(resultString);


        assertTrue( expectedResult.equals(resultString));
    }

    @Test
    public void shouldReplaceCiOnSi()
    {
        String expectedResult = "simple";
        TextSimplifier ts = new TextSimplifier();
        String resultString = ts.replaceCi("cimple");
        System.out.println(resultString);


        assertTrue( expectedResult.equals(resultString));
    }

    @Test
    public void shouldReplaceCkOnK()
    {
        String expectedResult = "Luky";
        TextSimplifier ts = new TextSimplifier();
        String resultString = ts.replaceCk("Lucky");
        System.out.println(resultString);


        assertTrue( expectedResult.equals(resultString));
    }

    @Test
    public void shouldReplaceConK()
    {
        String expectedResult = "Lukky";
        TextSimplifier ts = new TextSimplifier();
        String resultString = ts.replaceC("Lucky");
        System.out.println(resultString);


        assertTrue( expectedResult.equals(resultString));
    }
    @Test
    public void shouldReplaceDoubleE()
    {
        String expectedResult = "simple";
        TextSimplifier ts = new TextSimplifier();
        String resultString = ts.replaceE("seemple");
        System.out.println(resultString);


        assertTrue( expectedResult.equals(resultString));
    }

    @Test
    public void shouldReplaceDoubleO()
    {
        String expectedResult = "Dude";
        TextSimplifier ts = new TextSimplifier();
        String resultString = ts.replaceO("Doode");
        System.out.println(resultString);


        assertTrue( expectedResult.equals(resultString));
    }

    @Test
    public void shouldReplaceDuplicteCharachtersOnSingle() {
        String expectedResult = "bonjour";
        TextSimplifier ts = new TextSimplifier();
        String resultString = ts.replaceDuplicates("bonjouuuuuuuur");
        System.out.println(resultString);


        assertTrue(expectedResult.equals(resultString));
    }

    @Test
    public void shouldRemoveLastE() {
        String expectedResult = "e email";
        TextSimplifier ts = new TextSimplifier();
        String resultString = ts.removeE("e emaile");
        System.out.println(resultString);


        assertTrue(expectedResult.equals(resultString));
    }

    @Test
    public void shouldRemoveThe() {
        String expectedResult = " cure";
        TextSimplifier ts = new TextSimplifier();
        String resultString = ts.removeArt1("The cure");
        System.out.println(resultString);


        assertTrue(expectedResult.equals(resultString));
    }

    @Test
    public void shouldRemoveA() {
        String expectedResult = " place at";
        TextSimplifier ts = new TextSimplifier();
        String resultString = ts.removeArt3("A place at");
        System.out.println(resultString);


        assertTrue(expectedResult.equals(resultString));
    }

    @Test
    public void shouldRemoveAn() {
        String expectedResult = " annotations";
        TextSimplifier ts = new TextSimplifier();
        String resultString = ts.removeArt2("An annotations");
        System.out.println(resultString);


        assertTrue(expectedResult.equals(resultString));
    }
}
