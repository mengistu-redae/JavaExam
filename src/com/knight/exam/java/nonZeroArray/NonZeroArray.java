package com.knight.exam.java.nonZeroArray;

/**
 * Created by sachinkeshav on 12/30/14.
 */
public class NonZeroArray {

    public static void main(String[] args) {
        System.out.println(arrayHasNoZeros(new int[]{1, 2, 3}));
        System.out.println(arrayHasNoZeros(new int[]{1, 0, 4, 0}));
        System.out.println(arrayHasNoZeros(new int[]{1, 2, 3, 0}));
        System.out.println(arrayHasNoZeros(new int[]{0, 0, 0}));
        System.out.println(arrayHasNoZeros(new int[]{}));
        System.out.println(arrayHasNoZeros(null));
    }

    static int arrayHasNoZeros(int[] a) {
        if (a == null || a.length == 0) return 1; // according to the given
        for (int anA : a) {
            if (anA == 0) {
                return 0;
            }
        }

        return 1;
    }
}
