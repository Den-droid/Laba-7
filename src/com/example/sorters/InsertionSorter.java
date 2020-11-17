package com.example.sorters;

import com.example.interfaces.ISorter;

public class InsertionSorter implements ISorter {
    @Override
    public void sort(int[] arr) {
        int key, j;
        for (int i = 0; i < arr.length; i++) {
            key = arr[i];
            j = i - 1;

            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }

            arr[j + 1] = key;
        }
    }

    @Override
    public void showArrayType() {
        System.out.println("Insertion sort");
    }
}
