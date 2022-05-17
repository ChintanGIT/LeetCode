package com.company;

public class SelectionSort {
    public static void selectionSort(int[] arr){
        for(int i = 0; i < arr.length -1; i++){
            int minIndex = i;
            for(int j = i+1 ; j < arr.length; j++ ){
                if(arr[minIndex] > arr[j]){
                    minIndex = j;
                }
            }
            if (minIndex != i  ){
                int tmp = arr[minIndex];
                arr[minIndex] = arr[i];
                arr[i] = tmp;
            }
        }
    }
    public static void main(String[] args) {
        int[] array = {19,16,17,14,15,20,21};
        selectionSort(array);

        for(int i = 0;i < array.length; i++){
            System.out.println(array[i]);
        }
    }
}
