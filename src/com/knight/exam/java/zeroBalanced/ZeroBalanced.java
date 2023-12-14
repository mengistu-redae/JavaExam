package com.knight.exam.java.zeroBalanced;

/**
 * Created by sachinkeshav on 1/4/15.
 */
public class ZeroBalanced {

    public static void main(String[] args) {
        System.out.println(isZeroBalanced(new int[]{1, 2, -2, -1}));
        System.out.println(isZeroBalanced(new int[]{-3, 1, 2, -2, -1, 3}));
        System.out.println(isZeroBalanced(new int[]{3, 4, -2, -3, -2}));
        System.out.println(isZeroBalanced(new int[]{0, 0, 0, 0, 0, 0}));
        System.out.println(isZeroBalanced(new int[]{-3, -3, -3}));
        System.out.println(isZeroBalanced(new int[]{3}));
        System.out.println(isZeroBalanced(new int[]{}));
    }

    static int isZeroBalanced(int[] a) {

        if (a == null || a.length == 0)
            return 0;

        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum += a[i];
            boolean flag = false;
            for (int j = 0; j < a.length; j++) {
                if (a[i] == -a[j]) { 
                    flag = true;
                    break;
                }
            }
            if (!flag)
                return 0;
        }

        if (sum == 0) 
            return 1;

        return 0;
    }
}
