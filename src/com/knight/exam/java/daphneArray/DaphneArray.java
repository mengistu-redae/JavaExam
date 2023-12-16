package com.knight.exam.java.daphneArray;

/**
 * Created by sachinkeshav on 12/29/14.
 */
public class DaphneArray {

    public static void main(String[] args) {
        System.out.println(isDaphne(new int[]{4, 8, 6, 3, 2, 9, 8, 11, 8, 13, 12, 12, 6}));
        System.out.println(isDaphne(new int[]{2, 4, 6, 8, 6}));
        System.out.println(isDaphne(new int[]{2, 8, 7, 10, -4, 6}));

        System.out.println();
        System.out.println(isDaphne3(new int[]{2, 4, 2}));
        System.out.println(isDaphne3(new int[]{1, 3, 17, -5}));
        System.out.println(isDaphne3(new int[]{3, 2, 5}));
    }

    static int isDaphne(int[] a) {
        boolean oddFlag = false;

        for (int i = 0, j = a.length - 1; i <= j; i++, j--) {
            if ((a[i] % 2 == 0 && a[j] % 2 != 0) || (a[i] % 2 != 0 && a[j] % 2 == 0))
                return 0;
            if (a[i] % 2 != 0 || a[j] % 2 != 0)
                oddFlag = true;
        }
        if (oddFlag) return 1;
        return 0;
    }

    static int isDaphne1(int[] a) {
        int headCount = 0;
        int tailCount = 0;
        boolean oddFlag = false;
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0) {
                headCount++;
            } else {
                oddFlag = true;
                break;
            }
        }

        for (int j = a.length - 1; j >= 0; j--) {
            if (a[j] % 2 == 0) {
                tailCount++;
            } else {
                break;
            }
        }
        if (headCount == tailCount && oddFlag) return 1;
        else return 0;
    }

    static int isDaphne2(int[] a) {
        int headCount = 0;
        int tailCount = 0;
        boolean oddFlag = false;
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0) headCount++;
            else oddFlag = true;

            if (a[a.length - 1 - i] % 2 == 0) tailCount++;

            if (headCount != tailCount) return 0;
        }

        if (oddFlag) return 1;
        else return 0;
    }

    static int isDaphne3(int[] a) {
        boolean evenFlag = false;
        boolean oddFlag = false;

        for (int anA : a) {
            if (anA % 2 == 0) 
                evenFlag = true;
            else
                oddFlag = true;

            if (evenFlag && oddFlag)
                return 0;
        }
        return 1;
    }
}
