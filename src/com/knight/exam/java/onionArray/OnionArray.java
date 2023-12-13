package com.knight.exam.java.onionArray;

/**
 * Created by sachinkeshav on 1/3/15.
 */
public class OnionArray {

    public static void main(String[] args) {
        System.out.println(isOnionArray(new int[]{1, 2, 19, 4, 5}));
        System.out.println(isOnionArray(new int[]{1, 2, 3, 4, 15}));
    }

    static int isOnionArray(int[] a) {
        if (a == null || a.length <= 1)
            return 1;

        //there is a problem in the question.
        //according to the condition it sayas j+k==a.length
        //but in the given example, it takes j+k==a.length-1
        //so, we assume j+k==a.length-1 as a the genuine one
        for (int j = 0, k = a.length - 1; j < k; j++, k--) 
            if (j + k == a.length-1 && a[k] + a[j] > 10) 
                return 0;
            
        return 1;
    }
}
