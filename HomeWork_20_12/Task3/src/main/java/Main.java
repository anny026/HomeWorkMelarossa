package main.java;

public class Main {
    public static void main(String[] args) {
        int[] arrayNumber = new int[]{1, 2, 3};
        int[] arrayNumberChance = new int[]{1, 2, 10};
        ArraysNumberChance arraysNumberChance = new ArraysNumberChance(arrayNumber, arrayNumberChance);
        System.out.println(arraysNumberChance.getNumberChance());
    }
}