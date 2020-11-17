package com.example.sorters;

import com.example.interfaces.ISorter;

public class BubbleSorter implements ISorter {
    @Override
    public void sort(int[] arr) {
        boolean isSorted = false;
        while (!isSorted) {
            isSorted = true;
            for (int i = 1; i < arr.length; i++) {
                if (arr[i] < arr[i - 1]) {
                    swapElements(arr, i, i - 1);
                    isSorted = false;
                }
            }
        }
    }

    @Override
    public void showArrayType() {
        System.out.println("Bubble sort");
    }

    private void swapElements(int[] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}
