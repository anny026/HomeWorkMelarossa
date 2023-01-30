package main.java;

public class Main {
    public static void main(String[] args) {
        int i = 1370;
        System.out.println("Число " + i + " римскими цифрами:  " + joinNumberRoman(i));
    }

    public static String joinNumberRoman(int i) {
        String n = "";
        int k = 0;
        k = (int) i / 1000;
        if (k >= 1) {
            n = n.concat("M");
        }
        int k1 = i % 1000 / 100;
        n = getOneNumberRoman("C", "D", "M", n, k1);
        int k2 = i % 100 / 10;
        n = getOneNumberRoman("X", "L", "C", n, k2);
        int k3 = i % 10;
        n = getOneNumberRoman("I", "V", "X", n, k3);
        return n;
    }

    public static String getOneNumberRoman(String placeNumberCXI, String placeNumberDLV, String placeNumberMCX, String createdNumberRoman, int numberToChange) {
        if (numberToChange == 9) {
            createdNumberRoman = createdNumberRoman.concat(placeNumberCXI).concat(placeNumberMCX);
        }
        if (numberToChange == 8) {
            createdNumberRoman = createdNumberRoman.concat(placeNumberDLV).concat(placeNumberCXI).concat(placeNumberCXI).concat(placeNumberCXI);
        }
        if (numberToChange == 7) {
            createdNumberRoman = createdNumberRoman.concat(placeNumberDLV).concat(placeNumberCXI).concat(placeNumberCXI);
        }
        if (numberToChange == 6) {
            createdNumberRoman = createdNumberRoman.concat(placeNumberDLV).concat(placeNumberCXI);
        }
        if (numberToChange == 5) createdNumberRoman = createdNumberRoman.concat(placeNumberDLV);
        if (numberToChange == 4) createdNumberRoman = createdNumberRoman.concat(placeNumberCXI).concat(placeNumberDLV);
        if (numberToChange == 3)
            createdNumberRoman = createdNumberRoman.concat(placeNumberCXI).concat(placeNumberCXI).concat(placeNumberCXI);
        if (numberToChange == 2) createdNumberRoman = createdNumberRoman.concat(placeNumberCXI).concat(placeNumberCXI);
        if (numberToChange == 1) createdNumberRoman = createdNumberRoman.concat(placeNumberCXI);
        return createdNumberRoman;
    }
}

//для себя вариант
//        i = 1370;
//                n = "";
//                System.out.println("Вариант 2");
//                k1 = 0;
//                if (i >= 1000) {
//                n = n.concat("M");
//                }
//                if (i > 1000) {
//                k1 = (int) (i - 1000) / 100;
//                } else if (i >= 100) {
//                k1 = (int) (i) / 100;
//                }
//                n = rimNumber("C", "D", "M", n, k1);
//                k2 = 0;
//                if (i > 1000) {
//                k2 = (int) (i - 1000 - k1 * 100) / 10;
//                } else if (i >= 100) {
//                k2 = (int) (i - k1 * 100) / 10;
//                } else if (i < 100) {
//        k2 = (int) i / 10;
//        }
//        n = rimNumber("X", "L", "C", n, k2);
//        k3 = 0;
//        if (i > 1000) {
//        k3 = (i - 1000 - k1 * 100 - k2 * 10);
//        } else if (i >= 100) {
//        k3 = (i - k1 * 100 - k2 * 10);
//        } else if (i < 100) {
//        k3 = (i - k2 * 10);
//        }
//        n = rimNumber("I", "V", "X", n, k3);
//        System.out.println(n);