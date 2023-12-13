package com.knight.exam.java.primeFactor;

import java.util.Arrays;

/**
 * Created by sachinkeshav on 1/2/15.
 */
public class PrimeFactor {

    public static void main(String[] args) {
        System.out.println(largestPrimeFactor(10));
        System.out.println(largestPrimeFactor(6936));
        System.out.println(largestPrimeFactor(1));
        System.out.println(largestPrimeFactor(11));

        System.out.println();
        System.out.println(Arrays.toString(encodeNumber(2)));
        System.out.println(Arrays.toString(encodeNumber(6)));
        System.out.println(Arrays.toString(encodeNumber(14)));
        System.out.println(Arrays.toString(encodeNumber(24)));
        System.out.println(Arrays.toString(encodeNumber(1200)));
        System.out.println(Arrays.toString(encodeNumber(1)));
        System.out.println(Arrays.toString(encodeNumber(-18)));
    }

    static int largestPrimeFactor(int n) {
        if (n <= 1)
            return 0;

        int largestPrimeFactor = 2;

        for (int i = 2; i <= n; i++) {
            if (n % i == 0 && isPrime(i)) {
                largestPrimeFactor = i;
            }
        }
        return largestPrimeFactor;
    }

    static boolean isPrime(int n) {
        for (int i = 2; i < n; i++) {
            if (n % i == 0)
                return false;
        }

        return n > 0;
    }

    static int[] encodeNumber(int n) {
        if ( n <= 1) 
            return null;
            
        int size = 0;
        int nCopy = n;
        for (int i = 2;  i <= nCopy; ) {
            if(isPrime(i) && nCopy%i == 0){
                size++;
                nCopy/=i;
            }
            else{
                i++;
            }
        }

        int[] result = new int[size];        
        int index = 0;
        nCopy = n;
        for (int i = 2;  i <= nCopy; ) {
            if(isPrime(i) && nCopy%i == 0){
                result[index] = i;
                nCopy/=i;
                index++;
            }
            else{
                i++;
            }
        }
        return result;
    }

    static int[] encodeNumber1(int n) {
        if (n <= 1) return null;
        int size = 0;
        int number = 2;
        for (int nCopy = n; nCopy > 1; ) {
            boolean prime = true;
            for (int i = number / 2; i > 1; i--) {
                if (number % i == 0) prime = false;
            }
            if (prime && nCopy % number == 0) {
                size++;
                nCopy = nCopy / number;
            } else {
                number++;
            }
        }
        int[] result = new int[size];
        number = 2;
        int nCopy = n;
        for (int i = 0; i < size; ) {
            boolean prime = true;
            for (int j = number / 2; j > 1; j--) {
                if (number % j == 0) prime = false;
            }
            if (prime && nCopy % number == 0) {
                result[i] = number;
                nCopy = nCopy / number;
                i++;
            } else {
                number++;
            }
        }
        return result;
    }
}
