package com.knight.exam.java.inertialArray;

/**
 * Created by sachinkeshav on 12/27/14.
 */
public class InertialArray {

    public static void main(String[] args) {
        System.out.println(isInertial(new int[]{1}));
        System.out.println(isInertial(new int[]{2}));
        System.out.println(isInertial(new int[]{1, 2, 3, 4}));
        System.out.println(isInertial(new int[]{1, 1, 1, 1, 1, 1, 2}));
        System.out.println(isInertial(new int[]{2, 12, 4, 6, 8, 11}));
        System.out.println(isInertial(new int[]{2, 12, 12, 4, 6, 8, 11}));
        System.out.println(isInertial(new int[]{-2, -4, -6, -8, -11}));
        System.out.println(isInertial(new int[]{2, 3, 5, 7}));
        System.out.println(isInertial(new int[]{2, 4, 6, 8, 10}));
    }

    static int isInertial1(int[] a) {
        int greatestEven1 = Integer.MIN_VALUE;
        int greatest = greatestEven1;
        int greatestEven2 = greatestEven1;
        int smallestOdd = Integer.MAX_VALUE;
        int totalOdd = 0;
        for (int number : a) {
            if (number > greatest) greatest = number;
            if (number % 2 == 0) {
                if (number > greatestEven1) {
                    greatestEven2 = greatestEven1;
                    greatestEven1 = number;
                } else if (number != greatestEven1 && number > greatestEven2) {
                    greatestEven2 = number;
                }
            } else {
                if (number < smallestOdd) smallestOdd = number;
                totalOdd++;
            }
        }
        if (greatest == greatestEven1 && smallestOdd > greatestEven2 && totalOdd > 0) return 1;
        else return 0;
    }

    static int isInertial(int[] a) {
        boolean oddFlag = false;
        int maxEven = Integer.MIN_VALUE;
        int secondMaxEven = maxEven;
        int minOdd = Integer.MAX_VALUE;

        for (int anA : a) {
            if (anA % 2 != 0) {
                oddFlag = true;
                if (anA < minOdd)
                    minOdd = anA;
            } else {
                if (anA > maxEven) {
                    secondMaxEven = maxEven;
                    maxEven = anA;
                } else if (anA > secondMaxEven && anA < maxEven) {
                    secondMaxEven = anA;
                }
            }
        }
        if (oddFlag && minOdd > secondMaxEven && maxEven > minOdd) return 1;
        return 0;
    }
}
