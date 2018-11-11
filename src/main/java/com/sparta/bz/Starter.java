package com.sparta.bz;

import java.util.Arrays;

public class Starter
{
    public static void main( String[] args )
    {
       int[] arrayToSort = {3,55,33,76,1,12,3};
       QuickSort quickSort = new QuickSort();
       int[] sortedArray = quickSort.sortArray(arrayToSort);
       System.out.println( Arrays.toString(sortedArray));
    }
}
