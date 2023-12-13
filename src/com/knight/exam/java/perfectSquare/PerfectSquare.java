package com.knight.exam.java.perfectSquare;

import java.util.Scanner;

/**
 * Created by sachinkeshav on 12/23/14.
 */
public class PerfectSquare {
    
    public static void main(String[] args) {
        System.out.println(isPerfectSquare(6));
        System.out.println(isPerfectSquare(36));
        System.out.println(isPerfectSquare(0));
        System.out.println(isPerfectSquare(-5));

        System.out.println();
        Scanner input = new Scanner(System.in);
        System.out.printf("Enter a integer number: ");
        int num = input.nextInt();
        int nextPerfectSquare = nextPerfectSquare(num);
        System.out.printf("The next perfect square of %d is %d", num, nextPerfectSquare);
    }

    static int nextPerfectSquare(int n) {
        int nextPerfectSquare = 1;

        if (n < 0)
            return 0;
        else if (n == 0)
            return 1;

        for (int i = 0; i < n; i++)
            if (i * i > n) {
                nextPerfectSquare = i * i;
                break;
            }

        return nextPerfectSquare;
    }

    static int isPerfectSquare(int n) {
        if (n == 0)
            return 1;
        if (n < 0)
            return 0;
        int square;
        int number = 1;

        do {
            square = number * number;
            number++;
        } while (square <= n);
        return square;
    }
}
