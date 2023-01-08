package main.java;

public class ArraysNumberChance {
    int[] arrayNumber;
    int[] arrayNumberChance;


    public ArraysNumberChance(int[] arrayNumber, int[] arrayNumberChance) {
        this.arrayNumber = arrayNumber;
        this.arrayNumberChance = arrayNumberChance;
    }


    public int getNumberChance() {
        double s = 0;
        for (int i = 0; i < arrayNumberChance.length; i++) {
            s = s + arrayNumberChance[i];
        }
        int t = 0;
        double k = (Math.random());
    //    System.out.println("k " + k);
        double l = k * s;
    //    System.out.println("l  " + l);
        double min = 0;
        double max = 0;
        int count=0;
        for (int j = 0; (j < arrayNumber.length)&&(count==0); j++) {
            max =  max + arrayNumberChance[j] ;
            if ((l < max) && (l >= min)) {
                t = arrayNumber[j];
            count=1;}
            min =  max;
        }
            return t;
    }

}