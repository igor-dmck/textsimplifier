package com.itrexgroup.adamchik;


public class TextSimplifier {
    public static void main(String[] args) {

        String input = "Success, Coffee, cimple, an apple, The Ttable, Lucky, Ttuuuuuuuute, a doodeee!";

        removeArt3(removeArt2(removeE(removeArt1(replaceDuplicates(replaceO(replaceE(replaceC(replaceCk(replaceCi(replaceCe(input)))))))))));

    }

    public static String replaceCe(String input) {

        String resultText = input.replaceAll("(?i)(ce)", "se");
        System.out.println(resultText);
        return resultText;
    }

    public static String replaceCi(String input) {
        String resultText = input.replaceAll("(?i)ci", "si");
        System.out.println(resultText);
        return resultText;
    }

    public static String replaceCk(String input) {
        String resultText = input.replaceAll("(?i)ck", "k");
        System.out.println(resultText);
        return resultText;
    }

    public static String replaceC(String input) {
        String resultText = input.replaceAll("(?i)c", "k");
        System.out.println(resultText);
        return resultText;
    }


    public static String replaceE(String input) {
        String resultText = input.replaceAll("e{2}", "i");
        System.out.println(resultText);
        return resultText;
    }

    public static String replaceO(String input) {
        String resultText = input.replaceAll("o{2}", "u");
        System.out.println(resultText);
        return resultText;
    }
    public static String replaceDuplicates(String input) {
        String resultText = input.replaceAll("(\\w)\\1+","$1");
        System.out.println(resultText);
        return resultText;
    }
    public static String removeArt1(String input) {
        String resultText = input.replaceAll("(?<![a-zA-Z])(?i)the(?![a-zA-Z])","");
        System.out.println(resultText);
        return resultText;
    }
    public static String removeE(String input) {
        String resultText = input.replaceAll("(?<!\\b)e\\b","");
        System.out.println(resultText);
        return resultText;
    }
    public static String removeArt2(String input) {
        String resultText = input.replaceAll("(?<![a-zA-Z])(?i)an(?![a-zA-Z])","");
        System.out.println(resultText);
        return resultText;
    }
    public static String removeArt3(String input) {
        String resultText = input.replaceAll("(?<![a-zA-Z])(?i)a(?![a-zA-Z])", "");
        System.out.println(resultText);
        return resultText;
    }
}
