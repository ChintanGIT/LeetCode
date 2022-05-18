package com.company.arrays;

public class SingleDimensionArray {
    int[] arr = null;

    public SingleDimensionArray(int sizeOfArray){
        arr = new int[sizeOfArray];
        for (int i = 0; i < arr.length; i++){
            arr[i] = Integer.MIN_VALUE;
        }
    }
    public void insert(int location, int valueToBeInserted){
        try {
            if (arr[location] == Integer.MIN_VALUE) {
                arr[location] = valueToBeInserted;
                System.out.println("successfully inserted");
            } else {
                System.out.println("This cell is occupied");
            }
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("invalid index to access array!");
        }
    }

    public void traverseArray(){
        try {
            for (int i = 0; i < arr.length; i++) {
                System.out.println(arr[i] + "  ");
            }
        }catch (Exception e ){
            System.out.println("its over ");
        }

    }
    public void searchInArray(int valueToSearch){
        for ( int i = 0; i < arr.length; i++) {
            if (valueToSearch == arr[i]) {
                System.out.println("Value found at " + i);
                return;
            }
        }
        System.out.println("value not found");
    }
    public void deleteValue(int index){
        try{
            arr[index ] = Integer.MIN_VALUE;
            System.out.println("sucessfully deleted");
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("index not in array range");
        }
    }
}
