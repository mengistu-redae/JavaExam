package com.knight.exam.java.sumFactor;

/**
 * Created by sachinkeshav on 12/29/14.
 */
public class SumFactor {

    public static void main(String[] args) {
        System.out.println(SumFactor.sumFactor(new int[]{1, -1, 1, -1, 1, -1, 1}));
        System.out.println(SumFactor.sumFactor(new int[]{1, 2, 3, 4}));
        System.out.println(SumFactor.sumFactor(new int[]{3, 0, 2, -5, 0}));
        System.out.println(SumFactor.sumFactor(new int[]{9, -3, -3, -1, -1}));
        System.out.println(SumFactor.sumFactor(new int[]{1}));
        System.out.println(SumFactor.sumFactor(new int[]{0, 0, 0}));
    }

    static int sumFactor(int[] a) {

        if(a == null || a.length == 0)
            return 0;
        
        int sum = 0;
        int factor = 0;

        for (int anA : a) {
            sum += anA;
        }

        for (int anA : a) {
            if (anA == sum)
                factor++;
        }

        return factor;
    }
}
