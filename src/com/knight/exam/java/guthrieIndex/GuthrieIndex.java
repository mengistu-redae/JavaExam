package com.knight.exam.java.guthrieIndex;

/**
 * Created by sachinkeshav on 12/29/14.
 */
public class GuthrieIndex {

    public static void main(String[] args) {
        System.out.println(isGuthrie(11));
        System.out.println(isGuthrie(22));
        System.out.println(isGuthrie(8));

        System.out.println();
        System.out.println(guthrieIndex(7));
        System.out.println(guthrieIndex(1));
        System.out.println(guthrieIndex(2));
        System.out.println(guthrieIndex(3));
        System.out.println(guthrieIndex(4));
        System.out.println(guthrieIndex(42));
    }

    static int guthrieIndex(int n) {
        int guthrieIndex = 0;

        while (n > 1) {
            if (n % 2 == 0)
                n = n / 2;
            else 
                n = ((n * 3) + 1);
                
            guthrieIndex++;
        }

        return guthrieIndex;
    }

    static int isGuthrie(int n) {
        int previousElement = 1;
        int index = 1;
        int element = 0;

        while (element < n) {
            element = previousElement + index;
            previousElement = element;
            index++;
        }

        if (element == n) return 1;
        return 0;
    }
}
