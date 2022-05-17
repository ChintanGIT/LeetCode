package com.company;

public class LC_280 {
    public void wiggleSort(int[] nums) {
        boolean bValue = true;

        for (int i = 0; i < nums.length - 1; i++){
            if(bValue  && nums[i] > nums[i+1]){
                swap(nums, i, i+1);
            }else if (!bValue && nums[i] < nums[i+1]){
                swap(nums, i, i+1);
            }
            bValue = !bValue;
        }

    }

    public void swap(int[] arr, int i, int j){
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }
}

