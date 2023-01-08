package main.java;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число");
        int number = scanner.nextInt();
        CountDivisor countDivisor = new CountDivisor(number);
        countDivisor.printPlus(number);
    }
}