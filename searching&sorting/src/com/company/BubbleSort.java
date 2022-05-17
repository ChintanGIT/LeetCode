package com.company;

public class BubbleSort {
    public static void bubbleSort(int[]arr){
        for(int i = 0; i < arr.length; i++){
            for(int j = i+1; j < arr.length - 1; j++){
                if (arr[j] < arr[i]){
                    int tmp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] array = {19,16,17,14,15,20,21};
        bubbleSort(array);

        for(int i = 0;i < array.length; i++){
            System.out.println(array[i]);
        }
    }
}
