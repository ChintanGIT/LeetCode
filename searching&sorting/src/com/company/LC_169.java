package com.company;

public class LC_169 {
    public int majorityElement(int[] nums) {
        int count = 0;
        Integer candidate = null;

        for ( int i = 0; i < nums.length; i++){
            if(count == 0){
                candidate = nums[i];
            }

            count += (candidate == nums[i]) ? 1 : -1;
        }
        return candidate;
    }
}
