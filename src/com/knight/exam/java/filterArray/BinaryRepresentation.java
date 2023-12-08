package com.knight.exam.java.filterArray;

import java.util.Arrays;

/**
 * Created by sachinkeshav on 1/2/15.
 */
public class BinaryRepresentation {

    public static void main(String[] args) {
        
        System.out.println(isFilter(new int[]{1, 2, 3, 9, 6, 11}));
        System.out.println(isFilter(new int[]{3, 4, 6, 7, 14, 16}));
        System.out.println(isFilter(new int[]{1, 2, 3, 4, 10, 11, 13}));
        System.out.println(isFilter(new int[]{3, 6, 5, 5, 13, 6, 13}));
        System.out.println(isFilter(new int[]{9, 6, 18}));
        System.out.println(isFilter(new int[]{4, 7, 13}));

        System.out.println("");
        System.out.println(Arrays.toString(filterArray(new int[]{8, 4, 9, 0, 3, 1, 2}, 88)));
        System.out.println(Arrays.toString(filterArray(new int[]{18}, 3)));
        System.out.println(Arrays.toString(filterArray(new int[]{9, -9}, 0)));
        System.out.println(Arrays.toString(filterArray(new int[]{9, -9}, 1)));
        System.out.println(Arrays.toString(filterArray(new int[]{9, -9}, 2)));
        System.out.println(Arrays.toString(filterArray(new int[]{9, -9}, 3)));
        System.out.println(Arrays.toString(filterArray(new int[]{9, -9}, 4)));
        System.out.println(Arrays.toString(filterArray(new int[]{9, -9, 5}, 3)));
        System.out.println(Arrays.toString(filterArray(new int[]{0, 9, 12, 18, -6}, 11)));

    }

    //filter an array based on a binary form of given number
    static int[] filterArray(int[] a, int n) {
        int size = 0;
        for (int number = n; number > 0; number /= 2) {
            if (number % 2 == 1)
                size++;
        }
        int[] result = new int[size];
        int i = 0;
        int index = 0;
        for (int number = n; number > 0; number /= 2) {
            if (number % 2 == 1){
                if (index >= a.length)
                    return null;
                result[i] = a[index];
                i++;
            }
            index++;
        }
        return result;
    }

    static int isFilter(int[] a) {
        boolean cond9Flag = false;
        boolean cond7Flag = false;
        boolean cond11Flag = false;
        boolean cond13Flag = false;

        for (int i = 0; i < a.length; i++) {
            if (a[i] == 9) {
                cond9Flag = true;
            } else if (a[i] == 11) {
                cond11Flag = true;
            } else if (a[i] == 7) {
                cond7Flag = true;
            } else if (a[i] == 13) {
                cond13Flag = true;
            }
        }

        if ((cond9Flag && cond11Flag) || (cond7Flag && !cond13Flag) || (!cond9Flag && !cond7Flag))
            return 1;
        return 0;
    }
    
    static int isFilter1(int[] a) {
        boolean cond1 = true;
        boolean cond2 = true;

        for (int i = 0; i < a.length; i++) {

            if (a[i] == 9) {
                for (int j = 0; j < a.length; j++) {
                    if (a[j] == 11) {
                        cond1 = true;
                        break;
                    } else cond1 = false;
                }
            }

            if (a[i] == 7) {
                for (int k = 0; k < a.length; k++) {
                    if (a[k] == 13) {
                        cond2 = false;
                        break;
                    } else cond2 = true;
                }
            }

        }

        if (cond1 && cond2) return 1;
        else return 0;
    }
}
