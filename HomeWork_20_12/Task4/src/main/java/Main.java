package main.java;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String[] arrayString = {"aaaaa", "aaaaaaaaa", "aa", "aaa","gggggggggggggggggg"};
        System.out.println(mostLongString(arrayString));
    }

    public static String mostLongString(String[] array) {
        String string = Arrays.stream(array).max(String::compareTo).get();
        return string;
    }
}