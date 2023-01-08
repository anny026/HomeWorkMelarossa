package main.java;

public class Main {
    public static void main(String[] args) {
        twoFigureNumber(55);
        twoFigureNumber(50);
        twoFigureNumber(59);
        twoFigureNumber(52);
    }

    public static void twoFigureNumber(int number) {
        int i = number / 10;
        int j=number%10;      // вместо int j = number - i * 10;
        if (i > j) {
            System.out.println("У числа " + number + " цифра " + i + " больше, чем цифра " + j);
        } else if (i == j) {
            System.out.println("У числа " + number + " цифра " + j + " равно цифре " + i);
        } else {
            System.out.println("У числа " + number + " цифра " + j + " больше, чем цифра " + i);
        }
    }
}