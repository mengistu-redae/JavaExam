package com.knight.exam.java.centeredFifteen;

/**
 * Created by skushwaha on 12/29/14.
 */
public class CenteredFifteen {

    public static void main(String[] args) {
        System.out.println(CenteredFifteen.isCentered15(new int[]{3, 2, 10, 4, 1, 6, 9}));
        System.out.println(CenteredFifteen.isCentered15(new int[]{2, 10, 4, 1, 6, 9}));
        System.out.println(CenteredFifteen.isCentered15(new int[]{3, 2, 10, 4, 1, 6}));
        System.out.println(CenteredFifteen.isCentered15(new int[]{1, 1, 8, 3, 1, 1}));
        System.out.println(CenteredFifteen.isCentered15(new int[]{9, 15, 6}));
        System.out.println(CenteredFifteen.isCentered15(new int[]{}));
        System.out.println(CenteredFifteen.isCentered15(null));
        System.out.println(CenteredFifteen.isCentered15(new int[]{1, 1, 2, 2, 1, 1}));
        System.out.println(CenteredFifteen.isCentered15(new int[]{1, 1, 15,- 1, -1}));
    }

    static int isCentered15(int[] a) {
        if (a == null || a.length == 0) 
            return 0;

        for (int i = 0; i < a.length; i++) {
            int sum = 0;
            for (int j = i; j < a.length-i; j++) { //note uper and lower bound of index 'j'
                sum += a[j];
                if (sum == 15 && j == a.length-1-i) return 1;
            }
        }

        return 0;
    }

    //OR it can be done using one loop as
    static int isCentered15_1(int[] a){
        if (a == null || a.length == 0) 
            return 0;

        int sum, left, right;
        if(a.length % 2 != 0){ 
            int midIndex = a.length/2;           
            if(a[midIndex]==15) return 1;
            sum = a[midIndex];
            left=midIndex-1;
            right=midIndex+1;
        }
        else{
            sum=0;
            left=(a.length-1)/2; 
            right=left+1;
        }
        
        while(sum!=15 && left>=0 && right<a.length){
            sum = sum + a[left] + a[right];
            left--;
            right++;
        }

        if(sum == 15)
            return 1;

        return 0;
    }
}
