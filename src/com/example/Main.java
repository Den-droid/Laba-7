package com.example;

import com.example.sorters.BubbleSorter;
import com.example.sorters.InsertionSorter;
import com.example.sorters.SelectionSorter;

public class Main {

    public static void main(String[] args) {
        MainProcessor processor = new MainProcessor(new InsertionSorter());
        processor.processData();
    }

}