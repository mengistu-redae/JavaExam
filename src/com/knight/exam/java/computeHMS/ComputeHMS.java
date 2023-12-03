package com.knight.exam.java.computeHMS;

import java.util.Arrays;

/**
 * Created by sachinkeshav on 1/4/15.
 */
public class ComputeHMS {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(computeHMS(3735)));
        System.out.println(Arrays.toString(computeHMS(380)));
        System.out.println(Arrays.toString(computeHMS(3650)));
        System.out.println(Arrays.toString(computeHMS(55)));
        System.out.println(Arrays.toString(computeHMS(0)));
    }

    static int[] computeHMS(int seconds) {
        int[] hms = new int[3];

        hms[0] = seconds / 3600; //number of hours
        seconds = seconds % 3600;

        hms[1] = seconds / 60; //number of minutes
        seconds = seconds % 60;

        hms[2] = seconds; //number of seconds

        return hms;
    }
}
