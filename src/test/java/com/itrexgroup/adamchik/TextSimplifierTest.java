package com.itrexgroup.adamchik;

import static org.junit.Assert.assertTrue;

import org.junit.Test;


public class TextSimplifierTest
{

    @Test
    public void shouldReplaceDuplicates()
    {
        String expectedResult = " dudi,  apl;  mision";
        TextSimplifier ts = new TextSimplifier();
        String resultString = ts.simpleText("The doouddiee, an apple; a miisseeion");
        System.out.println(resultString);


        assertTrue( expectedResult.equals(resultString));
    }
}
