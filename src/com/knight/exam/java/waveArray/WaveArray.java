package com.knight.exam.java.waveArray;

/**
 * Created by sachinkeshav on 1/6/15.
 */
public class WaveArray {

    public static void main(String[] args) {
        System.out.println(isWave(new int[]{7, 2, 9, 10, 5}));
        System.out.println(isWave(new int[]{4, 11, 12, 1, 6}));
        System.out.println(isWave(new int[]{1, 0, 5}));
        System.out.println(isWave(new int[]{2}));
        System.out.println(isWave(new int[]{2, 6, 3, 4}));
    }

    static int isWave(int[] a) {
        //there is no given condition for null or length zero array in the question, 
        //but we make a simple assumption
        if(a == null || a.length==0)
            return 0;
        for (int i = 0; i < a.length - 1; i++) {
            if ((a[i] % 2 == 0 && a[i + 1] % 2 == 0) || (a[i] % 2 == 1 && a[i + 1] % 2 == 1))
                return 0;
        }
        return 1;
    }
}
