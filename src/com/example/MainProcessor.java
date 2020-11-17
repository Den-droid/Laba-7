package com.example;

import com.example.interfaces.ISorter;

import java.util.Random;

public class MainProcessor {
    private ISorter sorter;

    public MainProcessor(ISorter sorter) {
        this.sorter = sorter;
    }

    public void processData() {
        int[] arr = new int[20];
        sorter.showArrayType();
        setArray(arr);
        printArray(arr);
        sorter.sort(arr);
        printArray(arr);
    }

    private static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    private static void setArray(int[] arr) {
        Random rand = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(500);
        }
    }
}
