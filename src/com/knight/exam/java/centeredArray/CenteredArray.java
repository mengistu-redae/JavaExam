package com.knight.exam.java.centeredArray;

/**
 * Created by sachinkeshav on 1/5/15.
 */
public class CenteredArray {

    public static void main(String[] args) {
        System.out.println(isCentered(new int[]{1, 2, 3, 4, 5}));
        System.out.println(isCentered(new int[]{5, 3, 3, 4, 5}));
        System.out.println(isCentered(new int[]{3, 2, 1, 4, 5}));
        System.out.println(isCentered(new int[]{3, 2, 1, 4, 1}));
        System.out.println(isCentered(new int[]{3, 2, 1, 1, 4, 6}));
        System.out.println(isCentered(new int[]{}));
        System.out.println(isCentered(null)); //this case not present in the original question
        System.out.println(isCentered(new int[]{1}));
    }

    static int isCentered(int[] a) {
        if (a == null || a.length % 2 == 0) //should handle null array and 0 or even sized arrays
            return 0;

        int middleIndex = (a.length-1) / 2; //
        int middleValue = a[middleIndex];

        for (int i = 0; i < a.length; i++) {
            if (i != middleIndex && a[i] <= middleValue)
                return 0;
        }
        return 1;
    }
}
