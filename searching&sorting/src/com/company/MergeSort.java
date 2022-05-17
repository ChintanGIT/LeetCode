package com.company;

public class MergeSort {
    public static void mergeSort(int[] arr){
        mergeSort(arr, 0, arr.length-1);


    }

    public static void mergeSort (int[] arr, int low, int high){

        if ( low >= high){
            return;
        }
        int mid = (low + high ) / 2 ;
        mergeSort(arr,low ,mid);
        mergeSort(arr, mid + 1, high);

        merge(arr, low, high);
    }
    public static void merge(int[] arr, int low, int high){
        int mid = (low + high)/2;
        int i = low;
        int j = mid + 1;
        int [] merged = new int[high - low + 1];
        int index = 0;
        while(i <= mid && j <= high){
            if(arr[i] < arr[j]){
                merged[index++] = arr[i++];
            }else{
                merged[index++] = arr[j++];
            }
        }

        while(i <= mid ){
            merged[index++] = arr[i++];
        }
        while(j <= high){
            merged[index++] = arr[j++];
        }
        i = low;
        for(int value : merged){
            arr[i++] = value;
        }
    }



    public static void main(String[] args) {
        int[] array = {19,16,17,14,15,20,21};
        mergeSort(array);

        for(int i = 0;i < array.length; i++){
            System.out.println(array[i]);
        }
    }
}
