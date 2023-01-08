package main.java;

public class Main {
    public static void main(String[] args) {
        System.out.println(numberInString("два Один два дватри два три", "два"));
        System.out.println(numberInString("Один два дватри два три", "два"));
    }

    public static int numberInString(String stringLong, String stringСontainedInLong) {
        int number = 0;
        int index = 0;
        while ((index != -1) & index <= stringLong.length()) {
            if (stringLong.indexOf(stringСontainedInLong, index) == -1) {
                break;
            } else {
                index = stringLong.indexOf(stringСontainedInLong, index) + 1;
                number = number + 1;
            }
        }
        return number;
    }
}