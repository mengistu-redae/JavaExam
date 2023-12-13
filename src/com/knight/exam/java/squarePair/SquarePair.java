package com.knight.exam.java.squarePair;

/**
 * Created by sachinkeshav on 12/28/14.
 */
public class SquarePair {

    public static void main(String[] args) {
        System.out.println(SquarePair.countSquarePair(new int[]{9, 0, 2, -5, 7}));
        System.out.println(SquarePair.countSquarePair(new int[]{9}));
    }
    
    static int countSquarePair(int[] a) {
        int count = 0;

        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] > 0 && a[j] > 0) {

                    if (isPerfectSquare(a[i] + a[j])) {

                        count++;
                    }
                }
            }

        }
        return count;
    }

    static boolean isPerfectSquare(int num) {
        double sqrt = Math.sqrt(num);

        return sqrt == (int) sqrt;
    }
}
