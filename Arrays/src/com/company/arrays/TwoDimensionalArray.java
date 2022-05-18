package com.company.arrays;

public class TwoDimensionalArray {
    int[][] arr = null;

    // constructor

    public TwoDimensionalArray(int numberOfRows, int numberOfColumns){
        this.arr = new int[numberOfRows][numberOfColumns];
        for (int row = 0; row < arr.length; row++){
            for (int col = 0; col < arr.length; col++){
                arr[row][col] = Integer.MIN_VALUE;
            }
        }
    }
    public void insertValue( int row, int col, int value){
        try{
            if (arr[row][col] == Integer.MIN_VALUE){
                arr[row][col] = value;
                System.out.println("The value is assigned ");
            }else{
                System.out.println("The block is taken");
            }

        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Invalid index ");

        }
    }
    public void accessCell( int row, int col){
        try{
            System.out.println(arr[row][col]);

        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Invalid index for 2D array");
        }
    }
    public void traverseArr(){
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[0].length; j++){
                System.out.println(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public void searchArr(int value){
        for(int i = 0; i < arr.length; i++){
            for ( int j = 0;  j < arr[0].length; j++) {
                if (arr[i][j] == value) {
                    System.out.println("value found at " + i + " " + j);
                    return;
                }
            }
        }
        System.out.println("Invalid value");
    }
    public void deleteValue( int row, int col){
        try{
            arr[row][col] = Integer.MIN_VALUE;

        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Invalid index");
        }
    }

}
