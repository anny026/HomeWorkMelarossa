package main.java;

import java.util.Scanner;

public class CountDivisor {

    private int number;

    public CountDivisor(int number) {
        this.number = number;
    }
    public void printPlus(int number) {
        for (int i = 1; i <= number; i++) {
            System.out.print(i);
            for (int j = 1; j <= numberDivisor(i); j++) {
                System.out.print("+");
            }
            System.out.println();
        }
    }

    public int numberDivisor(int eachnumber) {
        int s = 0;
        for (int i = 1; i <= eachnumber; i++) {
            if (eachnumber % i == 0) {
                s++;
            }
        }
        return s;
    }

}
