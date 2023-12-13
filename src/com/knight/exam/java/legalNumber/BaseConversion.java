package com.knight.exam.java.legalNumber;

/**
 * Created by sachinkeshav on 12/30/14.
 */
public class BaseConversion {

    public static void main(String[] args) {
        System.out.println(convertToBase10(new int[  ] {1, 0, 1, 1}, 2));
        System.out.println(convertToBase10(new int[  ] {1, 1, 2}, 3));
        System.out.println(convertToBase10(new int[  ] {3, 2, 5}, 8));
        System.out.println(convertToBase10 (new int[ ] {3, 7, 1},  6));
    }

    static int convertToBase10(int[] a, int base) {
        if (LegalNumber.isLegalNumber(a, base) == 1) {
            int base10 = 0;
            int x = a.length - 1; //used to calculate number of times for the base
            for (int i = 0; i < a.length; i++) {
                int baseProd = 1;
                for (int j = 1; j <= x - i; j++) {
                    baseProd *= base;
                }
                base10 += a[i] * baseProd;
            }
            return base10;
        }
        return -1;
    }
    
    static int convertToBase10_1(int[] a, int base) {
        if (LegalNumber.isLegalNumber(a, base) == 1) {
            int base10 = 0;
            for (int i = 0; i < a.length; i++) {
                int baseProd = 1;
                for (int j = i + 1; j < a.length; j++) {
                    baseProd = base * baseProd;
                }
                base10 += a[i] * baseProd;
            }
            return base10;
        }
        return -1;
    }

}
