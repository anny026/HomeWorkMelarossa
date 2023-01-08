package main.java;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        String[] arrayChar = new String[]{"a", "б", "в", "г", "д", "е", "ж", "з", "и", "к"};
        int[] arrayNumber = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int i = 0; i < arrayNumber.length; i++) {
            for (int j = 0; j < arrayChar.length; j++) {
                System.out.print(arrayChar[j] + arrayNumber[i] + "\t");
            }
            System.out.println();
        }
        System.out.println("через стримы");

        for (int i = 1; i <= 10; i++) {
            int finalI = i;
            Arrays.stream(arrayChar).map((s) -> s + finalI).collect(Collectors.toList()).forEach(x -> System.out.print(x + "\t"));
            System.out.println();
        }


    }
}