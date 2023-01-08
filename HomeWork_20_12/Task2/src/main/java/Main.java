package main.java;

public class Main {
    public static void main(String[] args) {
        for (int l = 0; l < 100; l++) {
            if (numberOdd(l)) System.out.println(l);
        }
    }

    private static boolean numberOdd(int number) {
        for (int i = 2; i < number - 1; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
