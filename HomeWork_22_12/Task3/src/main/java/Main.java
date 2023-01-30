package main.java;

import java.util.Arrays;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        String string1 = "Первая строка11";
        String string2 = "Первая строка";
        int kod1 = myHashCode(string1);
        int kod2 = myHashCode(string2);
        System.out.println("хэшкод " + kod1);
        System.out.println("хэшкод " + kod2);
        System.out.println(myEquals(string1, string2));
        System.out.println("first string до шифрования :  " + string1);
        string1 = createNewString(string1, "макс");
        System.out.println("new string : " + string1);
        System.out.println("old string : " + returnedString(string1, "макс"));
    }

    public static boolean myEquals(String string1, String string2) {
        if (string1 == string2) return true;
        if (string1 == null) return false;
        if (string2 == null) return false;
        int s = 0;
        if (string1.length() != string2.length()) return false;
        else {
            char[] array1 = string1.toCharArray();
            char[] array2 = string2.toCharArray();
            for (int i = 0; i < array1.length - 1; i++) {
                while (array1[i] == array2[i]) i++;
                s = i;
            }
        }
        if (s == string1.length()) return true;
        else return false;
    }

    public static int myHashCode(String string) {
        int result = (int) string.chars().
                filter(x -> x > x - 1).
                reduce(15, (acc, x) -> x - acc) * 31
                + 15 + string.length() >> 1;
        return result;
    }

    public static String createNewString(String string, String key) {

        String newString = string.concat(key).chars()
                .mapToObj(i -> (char) i + 1)
                .collect(Collectors.toList())
                .toString();
        return newString;
    }

    public static String returnedString(String string, String key) {
        int d = string.length() - key.length();
        string = string.replace("[", "").replace("]", "").replaceAll(" ", "");
        Pattern pattern = Pattern.compile(",");
        String[] chars = pattern.split(string);
        String oldString = "";
        for (String char1 : chars) {
            int t = Integer.parseInt(char1) - 1;
            char p = (char) t;
            oldString = oldString.concat(Character.toString(p));
        }
        oldString = oldString.substring(0, oldString.length() - key.length());
        return oldString;
    }


}