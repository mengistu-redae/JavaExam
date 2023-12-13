package com.knight.exam.java.loopSum;

/**
 * Created by sachinkeshav on 1/4/15.
 */
public class LoopSum {

    public static void main(String[] args) {
        System.out.println(loopSum(new int[]{1, 2, 3}, 2));
        System.out.println(loopSum(new int[]{-1, 2, -1}, 7));
        System.out.println(loopSum(new int[]{1, 4, 5, 6}, 4));
        System.out.println(loopSum(new int[]{3}, 10));
    }

    static int loopSum(int[] a, int n) {
        int sum = 0;
        for (int counter = 0, i =0 ; counter < n; counter++, i++) {
            if(counter > a.length-1)
                i = counter%(a.length);
            
            sum += a[i];
        }
        return sum;
    }

    static int loopSum1(int[] a, int n) {
        int sum = 0;

        for (int i = 0, counter = 0; i < a.length && counter < n; i++, counter++) {
            sum += a[i];
            if (i == a.length - 1 && counter != n - 1)
                i = -1;
        }
        return sum;
    }

}
