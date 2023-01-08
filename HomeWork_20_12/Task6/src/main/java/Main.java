package main.java;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        String text="Раз два,два три два четыре";
        System.out.println(stringCut(text,"два"));
    }
    public static String stringCut (String text, String word){
        Pattern pattern=Pattern.compile(word);
        Matcher matcher= pattern.matcher(text);
        text=matcher.replaceAll("«[вырезано цензурой]»");
        return text;
    }
}