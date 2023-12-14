package com.knight.exam.java.systematicallyIncreasing;

/**
 * Created by sachinkeshav on 1/3/15.
 */
public class SystematicallyIncreasing {

    public static void main(String[] args) {
        System.out.println(isSystematicallyIncreasing(new int[]{1}));
        System.out.println(isSystematicallyIncreasing(new int[]{1, 1, 2}));
        System.out.println(isSystematicallyIncreasing(new int[]{1, 1, 2, 1, 2, 3}));
        System.out.println(isSystematicallyIncreasing(new int[]{1, 1, 2, 1, 2, 3, 1, 2, 3, 4}));
        System.out.println(isSystematicallyIncreasing(new int[]{1, 2, 1, 2, 3, 1, 2, 3, 4}));
        System.out.println(isSystematicallyIncreasing(new int[]{1, 1, 2, 3}));
    }

    static int isSystematicallyIncreasing(int[] a) {

        if(a == null || a.length == 0 ) return 0;

        int index=0;
        int n=1;
        while(index < a.length){
            for(int i=1; i<=n; i++){
                if(a[index] != i)
                    return 0;
                index++;   
            }
            n++;
        }

        return 1;
    }

    static int isSystematicallyIncreasing1(int[] a) {
        int index = 0;
        int i = 0;
        do {
            for (int j = 1; j < i + 1; j++) {
                if (a[index] != j) 
                    return 0;
                index++;
            }
            i++;
        } while (index < a.length);

        return 1;
    }
}
