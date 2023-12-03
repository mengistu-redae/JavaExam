package com.knight.exam.java.closestFibonacci;

/**
 * Created by sachinkeshav on 1/3/15.
 */
public class ClosestFibonacci {

    public static void main(String[] args) {
        System.out.println(closestFibonacci(13));
        System.out.println(closestFibonacci(12));
        System.out.println(closestFibonacci(33));
        System.out.println(closestFibonacci(34));
        System.out.println(closestFibonacci(-34));
    }

    static int closestFibonacci(int n) {
        if(n<1) return 0; //given direction from the question

        int fib1 = 1;
        int fib2 = 1;
        int fib = fib1+fib2;
        while(fib<n){
            fib=fib1+fib2;
            fib1=fib2;
            fib2=fib;
        }

        if(fib==n) 
            return fib;
        
        return fib1;
    }
}
