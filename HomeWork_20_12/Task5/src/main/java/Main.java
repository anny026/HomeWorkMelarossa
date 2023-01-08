package main.java;

public class Main {
    public static void main(String[] args) {
        System.out.println(isPalindrom("abba"));
        System.out.println(isPalindrom("abba22"));
    }

    public static boolean isPalindrom(String word) {
        String newWord = new StringBuilder(word).reverse().toString();
        System.out.println(newWord);
        if (word.equals(newWord)) {
            return true;
        } else
            return false;
    }
}