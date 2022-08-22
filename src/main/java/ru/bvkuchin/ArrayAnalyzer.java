package ru.bvkuchin;

import java.util.Arrays;

public class ArrayAnalyzer {
    public int[] getResultedArray(int[] arr) {
        int lastNumberIndex = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 4) {
                lastNumberIndex = i;
            }
        }

        if (lastNumberIndex == -1) {
            throw new RuntimeException("There is no 4 in the given array");
        }

        int[] result = new int[arr.length - lastNumberIndex + 1];
        return Arrays.copyOfRange(arr, lastNumberIndex + 1, arr.length);
    }
}


