package main.java;

import java.util.Arrays;
import java.util.OptionalInt;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        String text3 = "8 привет 1+0-5*2   ";
        findAndChange(text3);
        System.out.println("Замена макс цифры:  "+findAndChange(text3));
    }
    public static String findAndChange(String text) {
        char symbol ='0';
        int maxNumber=0;
        int isMaxNumber=0;
        String number="";
        for (int i = 0; i < text.length(); i++) {
            symbol =text.charAt(i);
            if (Character.isDigit(symbol)) {
                number+=symbol;
                isMaxNumber=Integer.parseInt(number);
                if (isMaxNumber>maxNumber) maxNumber=isMaxNumber;
                number="";
            }
        }
        number=String.valueOf(maxNumber);
        text = text.replace(number, getWord(maxNumber));
        return text;
    }
    public static String getWord (int number){
        String numberWord="";
        switch (number){
            case (9):
                numberWord="девять";
                break;
            case (8):
                numberWord="восемь";
                break;
            case (7):
                numberWord="семь";
                break;
            case (6):
                numberWord="шесть";
                break;
            case (5):
                numberWord="пять";
                break;
            case (4):
                numberWord="четыре";
                break;
            case (3):
                numberWord="три";
                break;
            case (2):
                numberWord="два";
                break;
            case (1):
                numberWord="один";
                break;
            case (0):
                numberWord="ноль";
                break;
        }
        return numberWord;
    }

}
    //2 вариант для себя оставила
//    String text2 = "text8 4text 7 text text9 6 text 2";
//
//        if (text2.chars().mapToObj(i -> (char) i).collect(Collectors.toList()).stream().anyMatch(x -> x.toString().equals("9")))
//                text2 = text2.replace("9", "девять");
//                else if (text2.chars().mapToObj(i -> (char) i).collect(Collectors.toList()).stream().anyMatch(x -> x.toString().equals("8")))
//                text2 = text2.replace("8", "восемь");
//                else if (text2.chars().mapToObj(i -> (char) i).collect(Collectors.toList()).stream().anyMatch(x -> x.toString().equals("7")))
//                text2 = text2.replace("7", "семь");
//                else if (text2.chars().mapToObj(i -> (char) i).collect(Collectors.toList()).stream().anyMatch(x -> x.toString().equals("6")))
//                text2 = text2.replace("6", "шесть");
//                else if (text2.chars().mapToObj(i -> (char) i).collect(Collectors.toList()).stream().anyMatch(x -> x.toString().equals("5")))
//                text2 = text2.replace("5", "пять");
//                else if (text2.chars().mapToObj(i -> (char) i).collect(Collectors.toList()).stream().anyMatch(x -> x.toString().equals("4")))
//                text2 = text2.replace("4", "четыре");
//                else if (text2.chars().mapToObj(i -> (char) i).collect(Collectors.toList()).stream().anyMatch(x -> x.toString().equals("3")))
//                text2 = text2.replace("3", "три");
//                else if (text2.chars().mapToObj(i -> (char) i).collect(Collectors.toList()).stream().anyMatch(x -> x.toString().equals("2")))
//                text2 = text2.replace("2", "два");
//                else if (text2.chars().mapToObj(i -> (char) i).collect(Collectors.toList()).stream().anyMatch(x -> x.toString().equals("1")))
//                text2 = text2.replace("1", "один");
//                System.out.println(text2);
