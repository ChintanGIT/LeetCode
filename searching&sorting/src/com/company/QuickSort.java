package com.company;

public class QuickSort {
     static void swap ( int[] arr, int i, int j){
         int tmp = arr[i];
         arr[i] = arr[j];
         arr[j] = tmp;

     }

     public static void quickSort(int[] arr){
         quickSort( arr, 0, arr.length - 1);
     }

     public static void quickSort(int[] arr, int left, int right){
         if (left < right){
             int position = partition( arr, left,right);

             quickSort(arr, left, position-1);
             quickSort(arr, position+1, right);
         }
     }
     public static  int partition(int[] arr , int left, int right){
         int pivot = arr[right];
         int wall = left - 1;
         for ( int i = left ; i < right; i++){
             if (arr[i] < pivot ){
                 wall ++;
                 swap(arr, i ,wall);
             }
         }
         wall++;
         swap(arr, wall, right);
         return wall;

     }

    public static void main(String[] args) {
        int[] array = {19,16,17,14,15,20,21};
        quickSort(array);

        for(int i = 0;i < array.length; i++){
            System.out.println(array[i]);
        }
    }
}
