package main.java;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arrayRandom = new int[10];
        for (int i = 0; i < arrayRandom.length; i++) {
            arrayRandom[i] = numberRandomLimit();
            System.out.print(arrayRandom[i] + "  ");
        }
        System.out.println();
        System.out.println(Arrays.stream(arrayRandom).min().getAsInt());
        System.out.println(Arrays.stream(arrayRandom).max().getAsInt());
        System.out.println(Arrays.stream(arrayRandom).average().getAsDouble());

    }
    private static int numberRandomLimit() {
        int i = (int) (Math.random() * 100);
        if (i<=18) i=i+31;
        if (i>18&&i<31) i=i+18;
        if (i>49&&i<=67) i=i-18;
        if (i>67&&i<=83) i=i-36;
        if (i>83) i=i-51;
        return i;
    }



//    private static int numberRandomLimit() {
//        int i = (int) (Math.random() * 100);
//            System.out.println(i);
//        if (i >= 31 && i <= 49) {
//            return i;
//        } else return numberRandomLimit();
//    }
}
