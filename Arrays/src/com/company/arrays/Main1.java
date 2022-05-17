package com.company.arrays;

import java.util.Arrays;

public class Main1 {
    public static void main(String[] args) {
        TwoDimensionalArray tda = new TwoDimensionalArray(3,3);
        tda.insertValue(0, 0, 10);
        tda.insertValue(0, 0, 10);
        System.out.println(Arrays.deepToString(tda.arr));
        tda.accessCell(0, 0);
        tda.accessCell(0, 5);

        tda.traverseArr();

        tda.searchArr(50);
        tda.deleteValue(0,0);
        System.out.println(Arrays.deepToString(tda.arr));
    }
}
