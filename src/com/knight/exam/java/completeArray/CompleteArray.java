package com.knight.exam.java.completeArray;

import com.knight.exam.java.isSquare.IsSquare;

/**
 * Created by skushwaha on 12/29/14.
 */
public class CompleteArray {

    public static void main(String[] args) {
        System.out.println(isComplete(new int[]{2, 3, 2, 4, 11, 6, 10, 9, 8}));
        System.out.println(isComplete(new int[]{2, 3, 2, 4, 11, 8, 10, 9, 8}));
        System.out.println(isComplete(new int[]{2, 3, 3, 6}));
        System.out.println(isComplete(new int[]{2, -3, 4, 3, 6}));

        System.out.println();
        System.out.println(isComplete1(new int[]{36, -28}));
        System.out.println(isComplete1(new int[]{36, 28}));
        System.out.println(isComplete1(new int[]{4}));
        System.out.println(isComplete1(new int[]{3, 2, 1, 1, 5, 6}));
        System.out.println(isComplete1(new int[]{3, 7, 23, 13, 107, -99, 97, 81}));

        System.out.println();
        System.out.println(isComplete2(new int[]{-5, 6, 2, 3, 2, 4, 5, 11, 8, 7}));
        System.out.println(isComplete2(new int[]{5, 7, 9, 13}));
        System.out.println(isComplete2(new int[]{2, 2}));
        System.out.println(isComplete2(new int[]{2, 6, 3, 4}));
    }

    static int isComplete(int[] a) {
        int maximumEven = Integer.MIN_VALUE;

        for (int n : a) {
            if (n < 0) return 0;
            if (n % 2 == 0 && n > maximumEven) maximumEven = n;
        }
        if (maximumEven != 10) return 0;

        for (int i = 2; i < maximumEven; i++) {
            if (i % 2 == 0) {
                boolean flag = false;

                for (int n : a) {
                    if (n == i) {
                        flag = true;
                        break;
                    }
                }
                if (!flag)
                    return 0;
            }
        }

        return 1;
    }

    //another question on complete array
    static int isComplete1(int[] a) {
        if(a == null || a.length < 2) return 0;

        boolean squareFlag = false;
        boolean evenFlag = false;
        boolean sumFlag = false;
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0)
                evenFlag = true;

            if (a[i] != 1 && IsSquare.isSquare(a[i]) == 1)
                squareFlag = true;

            for (int j = i + 1; j < a.length; j++) {
                if (a[i] + a[j] == 8) {
                    sumFlag = true;
                    break;
                }
            }

            if (evenFlag && squareFlag && sumFlag)
                return 1;
        }

        return 0;
    }

    //another question on complete array
    static int isComplete2(int[] a) {
        if (a == null || a.length == 0)
            return 0;

        int smallestEven = Integer.MAX_VALUE - 1;
        int largestEven = Integer.MIN_VALUE;
        boolean evenFlag = false;

        for (int n : a) {
            if (n % 2 == 0) {
                evenFlag = true;
                if (n > largestEven)
                    largestEven = n;
                if (n < smallestEven)
                    smallestEven = n;
            }
        }

        if ((evenFlag && smallestEven == largestEven) || !evenFlag) return 0;

        for (int e = smallestEven; e <= largestEven; e++) {
            boolean flag = false;
            for (int n : a) {
                if (n == e) {
                    flag = true;
                    break;
                }
            }

            if (!flag)
                return 0;
        }

        return 1;
    }
}
