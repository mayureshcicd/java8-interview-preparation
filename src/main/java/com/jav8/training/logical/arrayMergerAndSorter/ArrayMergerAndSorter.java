package com.jav8.training.logical.arrayMergerAndSorter;


import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.Collections;

public class ArrayMergerAndSorter {

    public static void main(String[] args) {

        // 6. Merge and sort
        int[] arr1 = {1, 8, 7, 6};
        int[] arr2 = {100, 87, 77, 86};
        System.out.println("\n\nMerged & Sorted Array:");
        for (int i : ArrayMergerAndSorter.mergeAndSort(arr1, arr2)) {
            System.out.print(i + " ");
        }

        // 7. Merge using streams
        System.out.println("\n\nSorted (Asc): " + ArrayMergerAndSorter.mergeSortedList(arr1, arr2, false));
        System.out.println("Sorted (Desc): " + ArrayMergerAndSorter.mergeSortedList(arr1, arr2, true));

    }
    public static int[] mergeAndSort(int[] arr1, int[] arr2) {
        int[] result = new int[arr1.length + arr2.length];
        System.arraycopy(arr1, 0, result, 0, arr1.length);
        System.arraycopy(arr2, 0, result, arr1.length, arr2.length);
        Arrays.parallelSort(result);
        return result;
    }

    public static List<Integer> mergeSortedList(int[] arr1, int[] arr2, boolean descending) {
        IntStream combined = IntStream.concat(Arrays.stream(arr1), Arrays.stream(arr2));
        return descending
                ? combined.boxed().sorted(Collections.reverseOrder()).collect(Collectors.toList())
                : combined.boxed().sorted().collect(Collectors.toList());
    }
}