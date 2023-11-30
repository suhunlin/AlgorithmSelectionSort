package org.suhun;

public class SelectionSortImplement {
    public int[] selection_sort(int[] nums){

        for(int rounds = nums.length; rounds >0; rounds--){
            int first = nums.length - rounds;
            int max_index = first;
            int max_value = nums[first];
            for(int start = nums.length - rounds ; start < nums.length; start ++){
                if(nums[start] > max_value){
                    max_value = nums[start];
                    max_index = start;
                }
            }
            if(first != max_index)
                swap(nums, nums.length - rounds, max_index);
        }

        return nums;
    }

    private void swap(int[] nums, int left_index, int right_index){
        int temp = nums[left_index];
        nums[left_index] = nums[right_index];
        nums[right_index] = temp;
    }


}
