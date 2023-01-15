package main.java;

public class Main {
    public static void main(String[] args) {
        int i = 1370;
        System.out.println("Число " + i + " римскими цифрами:  " + rimNumberAll(i));
    }

    public static String rimNumberAll(int i) {
        String n = "";
        int k = 0;
        k = (int) i / 1000;
        if (k < 1) {
            k = 0;
        } else {
            n = n.concat("M");
        }
        int k1 = 0;
        k1 = (int) (i - k * 1000) / 100;
        if (k1 < 0) k1 = 0;
        n = rimNumber("C", "D", "M", n, k1);
        int k2 = 0;
        k2 = (int) (i - k * 1000 - k1 * 100) / 10;
        if (k2 < 0) k2 = 0;
        n = rimNumber("X", "L", "C", n, k2);
        int k3 = 0;
        k3 = (i - k * 1000 - k1 * 100 - k2 * 10);
        n = rimNumber("I", "V", "X", n, k3);
        return n;
    }

    public static String rimNumber(String o1, String o2, String o3, String n1, int k) {
        if (k == 9) {
            n1 = n1.concat(o1).concat(o3);
        }
        if (k == 8) {
            n1 = n1.concat(o2).concat(o1).concat(o1).concat(o1);
        }
        if (k == 7) {
            n1 = n1.concat(o2).concat(o1).concat(o1);
        }
        if (k == 6) {
            n1 = n1.concat(o2).concat(o1);
        }
        if (k == 5) n1 = n1.concat(o2);
        if (k == 4) n1 = n1.concat(o1).concat(o2);
        if (k == 3) n1 = n1.concat(o1).concat(o1).concat(o1);
        if (k == 2) n1 = n1.concat(o1).concat(o1);
        if (k == 1) n1 = n1.concat(o1);
        return n1;
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