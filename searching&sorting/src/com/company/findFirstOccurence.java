package com.company;

public class findFirstOccurence {
    public static int findFirstOccurence(int[] arr, int x){
        if (arr == null || arr.length == 0){
            return -1;
        }
        return findFindOccurence(arr, x, 0, arr.length -1);
    }
    public static int findFindOccurence(int[] arr, int x, int start, int end){
        if ( arr[start] > x || arr[end] < x){
            return -1;
        }
        int mid = (start + end)/2;
        if(arr[start] == x){
            return start;

        }
        if(mid < x ){
            return findFindOccurence(arr, x, mid+1, end);

        }else if(mid == x ){
            return findFindOccurence(arr, x, start, mid);
        }else{
            return findFindOccurence(arr, x, start, mid-1);
        }
    }
    public static void main(String[] args) {
        int[] array = {1,1,2,3,4,5,5,6,7,8,9,9,10,11,12};
        System.out.println(findFirstOccurence(array , 5));


    }
}
