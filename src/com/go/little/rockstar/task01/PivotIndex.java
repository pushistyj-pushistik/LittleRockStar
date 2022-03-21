package com.go.little.rockstar.task01;

public class PivotIndex {
    public static void main(String[] args) {
        int[] array1 = {2, 1, -1,};
        System.out.println(pivotIndex(array1));
    }
    public static int pivotIndex(int[] array1) {
        if(array1.length == 0) return -1;
        int l = array1.length;
        int[] left = new int[l];
        int[] right = new int[l];
        left[0] = array1[0]; // -1
        right[l-1] = array1[l-1]; //-1

        for(int i = 1; i<l; i++){
            left[i] = array1[i] + left[i-1];
            right[l-1-i] = array1[l-1-i] + right[l-i];
        }

        for(int i=0; i< l; i++){
            if(left[i] == right[i]) return i;
        }
        return -1;
    }

}


