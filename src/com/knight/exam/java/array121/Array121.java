package com.knight.exam.java.array121;

/**
 * Created by sachinkeshav on 1/2/15.
 */
public class Array121 {

    public static void main(String[] args) {
        System.out.println(is121Array(new int[]{1, 2, 1}));
        System.out.println(is121Array(new int[]{1, 1, 2, 2, 2, 1, 1}));
        System.out.println(is121Array(new int[]{1, 1, 2, 2, 2, 1, 1, 1}));
        System.out.println(is121Array(new int[]{1, 1, 2, 1, 2, 1, 1}));
        System.out.println(is121Array(new int[]{1, 1, 1, 2, 2, 2, 1, 1, 1, 3}));
        System.out.println(is121Array(new int[]{1, 1, 1, 1, 1, 1}));
        System.out.println(is121Array(new int[]{2, 2, 2, 1, 1, 1, 2, 2, 2, 1, 1}));
        System.out.println(is121Array(new int[]{1, 1, 1, 2, 2, 2, 1, 1, 2, 2}));
        System.out.println(is121Array(new int[]{2, 2, 2}));
    }

    //Another option using one loop
    static int is121Array(int[] a) {
        if (a == null || a.length < 3 || a[0] != 1 || a[a.length - 1] != 1) //should also handle for null input
            return 0;

        boolean sequence = false; //indicating end of sequence of ones
        for (int i = 0, j = a.length - 1; i <= j ; i++, j--) {
            
            if(!sequence && a[i] == 1 && a[j] ==1 ){
                if(j == i+1) return 0; //the array contains only ones
            }
            else{
                sequence = true; //sequence of ones ended
                if(a[i] != a[j]) return 0;
                if(a[i] != 2) return 0; //a[j] != 2
            }
            
        }
    
        return 1;
    }
    
    //OR it can be done usiing one loop as following
    static int is121Array1(int[] a){
        if(a == null || a.length < 3 || a[0] != 1 || a[a.length-1] != 1)
            return 0;

        int count = 0;
        boolean firstSequence = false; //indicating end of first sequence of ones
        for (int i = 0; i<a.length; i++){
            if(!firstSequence){
                if(a[i] == 1) count++;
                else firstSequence = true;
            }

            if(firstSequence){
                if(i > count -1 && i < a.length-count && a[i] != 2)
                    return 0;
                else if(i >= a.length - count && a[i] != 1 )
                    return 0;
            }
        } //end of loop

        return 1;
    }

    static int is121Array2(int[] a) {
        if (a == null || a.length < 3 || a[0] != 1 || a[a.length - 1] != 1) //should also handle for null input
            return 0;

        int i, j;
        boolean flag = false;
        for (i = 0, j = a.length - 1; i < a.length && j >= 0 && i <= j; i++, j--) {
            if (a[i] != 1 || a[j] != 1) {
                if (a[i] != 2 || a[j] != 2)
                    return 0;
                else {
                    flag = true;
                    break;
                }
            }
        }

        for (int index = i; index <= j; index++) {
            if (a[index] != 2)
                return 0;
        }

        if (flag) 
            return 1;
            
        return 0;
    }

}
