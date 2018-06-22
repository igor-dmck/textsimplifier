package com.itrexgroup.adamchik;

import java.io.BufferedReader;
import java.io.InputStreamReader;


public class TextSimplifier {
    public static void main(String[] args) {

        String input = "Coffee, The table, doodeee!";

        String str = simpleText(input);


        System.out.println(str);

    }

    public static String simpleText(String input) {

        String removeCe = input.replaceAll("(?i)(ce)","se");
        System.out.println(removeCe);

        String replaceCk = removeCe.replaceAll("(?i)c","k");
        System.out.println(replaceCk);

        String replaceC = replaceCk.replaceAll("(?i)c","k");
        System.out.println(replaceC);

        String replE = replaceC.replaceAll("e{2}", "i");
        System.out.println(replE);

        String replO = replE.replaceAll("o{2}", "u");
        System.out.println(replO);

        String replaceDuplicates = replO.replaceAll("(\\w)\\1","$1");
        System.out.println(replaceDuplicates);

        String remArt1 = replaceDuplicates.replaceAll("(?<![a-zA-Z])(?i)the(?![a-zA-Z])","");

        String removeLastE = remArt1.replaceAll("(?<!\\b)e\\b","");
        System.out.println(removeLastE);

        String remArt2 = removeLastE.replaceAll("(?<![a-zA-Z])(?i)an(?![a-zA-Z])","");
        return remArt2.replaceAll("(?<![a-zA-Z])(?i)a(?![a-zA-Z])","");


    }
}
