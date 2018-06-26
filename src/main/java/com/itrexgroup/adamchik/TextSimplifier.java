package com.itrexgroup.adamchik;


public class TextSimplifier {
    public static void main(String[] args) {

        String input = "Success, Coffee, cimple, an applE, The Ttable, Lucky, Ttuuuuuuuute, a doodeee! YYyy aaA";

        removeLastLetterE(removeArticles(removeDoubleLetter(removeLetterC(input))));

    }

    public static String removeLetterC (String input) {

        String replaceCe = input.replaceAll("(?i)(ce)", "se");
        String replaceCi = replaceCe.replaceAll("(?i)ci", "si");
        String replaceCk = replaceCi.replaceAll("(?i)ck", "k");
        String removeC = replaceCk.replaceAll("(?i)c", "k");
        System.out.println(removeC);
        return removeC;
    }


    public static String removeDoubleLetter(String input) {
        String replaceDoubleE = input.replaceAll("e{2}", "i");
        String replaceDoubleU = replaceDoubleE.replaceAll("o{2}", "u");
        String removeDuplicates = replaceDoubleU.replaceAll("(?i)(\\w)\\1+","$1");
        System.out.println(removeDuplicates);
        return removeDuplicates;
    }


    public static String removeArticles(String input) {
        String removeThe = input.replaceAll("(?<![a-zA-Z])(?i)the(?![a-zA-Z])","");
        String removeAn = removeThe.replaceAll("(?<![a-zA-Z])(?i)an(?![a-zA-Z])","");
        String removeA = removeAn.replaceAll("(?<![a-zA-Z])(?i)a(?![a-zA-Z])", "");
        System.out.println(removeA);
        return removeA;

        }
    public static String removeLastLetterE(String input) {
        String removeE = input.replaceAll("(?<!\\b)(?i)e\\b","");
        System.out.println(removeE);
        return removeE;
    }
}
