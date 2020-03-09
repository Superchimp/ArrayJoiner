package com.sparta.pn;

public class ArrayMerger {

    public static int[] mergeArrays(int[] array1, int[] array2) {
        //Check the size of both Arrays
        int array1Len = array1.length;
        int array2Len = array2.length;
        int totalLen = array1Len + array2Len;
        int[] result = new int[totalLen];
        int longestLen = 0;
        int array1Position = 0;
        int array2Position = 0;

        if (array1Len > array2Len) {
            longestLen = array1Len;
        }
        else{
            longestLen = array2Len;
        }
        int i = 0;

        while (i < totalLen){

            if (array1[array1Position] <= array2[array2Position]){
                result[i] = array1[array1Position];

                if (array1Len > array2Position){
                    array1Position = array1Position + 1;
                }
            }
            else if (array2[array2Position] < array1[array1Position]) {
                result[i] = array2[array2Position];

                if (array2Len > array2Position){
                    array2Position = array2Position + 1;
                }
            }
            i++;
        }
        return result;

        //create new array
    }


}
