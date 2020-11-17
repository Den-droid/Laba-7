package com.example.sorters;

import com.example.interfaces.ISorter;

public class SelectionSorter implements ISorter {
    @Override
    public void sort(int[] arr) {
        int minIndex;
        for (int i = 0; i < arr.length - 1; i++) {
            minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            swapElements(arr, i, minIndex);
        }
    }

    @Override
    public void showArrayType() {
        System.out.println("Selection sort");
    }

    private void swapElements(int[] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}
