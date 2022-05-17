package com.company;

public class BinarySearch {
    public static boolean binSearch(int [] arr, int x){
        if(arr == null || arr.length == 0){
            return false;
        }

        int start = 0;
        int end = arr.length-1;
        while(start <= end){
            int mid = (start + end)/2;
            if (x == mid){
                return true;
            }
            else if(x > arr[mid]){
                start = mid + 1;
            }else{
                end = mid - 1;
            }
        }
        return false;
    }

    public static boolean binSearchRecursive(int [] arr, int x){
        if (arr == null || arr.length == 0){
            return false;
        }
        return binSearchRecursive(arr, x, 0, arr.length -1);
    }
    public static boolean binSearchRecursive(int [] arr, int x, int start, int end){
        if (start > end ){
            return false;
        }
        int mid = (start + end)/2;
        if ( x == mid ){
            return true;
        }else if( x > arr[mid]){
            binSearchRecursive(arr, x, mid + 1, end);
        }else {
            binSearchRecursive(arr, x, start, mid - 1);
        }
        return false;
    }

    public static void main(String[] args) {
        int[] array = {1,1,2,3,4,5,6,7,8,9,9,10,11,12};
        System.out.println(binSearchRecursive(array , 5));


    }
}
