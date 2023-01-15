package main.java;

import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {

        String string1 = "Первая строка";
        String string2 = "Первая строак";
        int kod1 = myHashCode(string1);
        int kod2 = myHashCode(string2);
        System.out.println("хэшкод " + kod1);
        System.out.println("хэшкод " + kod2);
        System.out.println(myEquals(string1, string2));

        System.out.println("first string до шифрования :  " + string1);
        string1 = newString(string1, "77аб");
        System.out.println("new string : " + string1);
        System.out.println("old string : " + oldString(string1, "77аб"));

    }
    public static boolean myEquals(String string1, String string2) {
        if (myHashCode(string1) == myHashCode(string2)) {
            return true;
        } else return false;
    }

    public static int myHashCode(String string) {
        int result = (int) string.chars().
                filter(x->x>x-1).
                reduce(15,(acc,x)->x-acc)
                 + 15 + string.length();
        return result;
    }

    public static String newString(String string, String key) {
        String newstring = string.concat(key).chars().mapToObj(i -> (char) i)
                .collect(Collectors.toList())
                .stream()
                .map(x -> x + "2")
                .collect(Collectors.joining())
                .toString();
        return newstring;
    }

    public static String oldString(String string, String key) {
        int d = string.length() - key.length() * 2;

        String oldstring = string.chars().mapToObj(i -> (char) i)
                .collect(Collectors.toList())
                .stream()
                .map(x -> x + "")
                .map(x -> {
                    if (x.equals("2")) x = "";
                    return x;
                })
                .limit(d)
                //.map(i -> (char)i)
                .collect(Collectors.toList())
                .stream()
                .collect(Collectors.joining())
                .toString();
        return oldstring;
    }


}