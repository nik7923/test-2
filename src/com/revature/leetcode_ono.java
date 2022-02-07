package com.revature;
import java.util.Arrays;

public class leetcode_ono {

    public int[] twoSum(int[] nums, int target) {
        for(int i = 0; i < (nums.length - 1); i++) {
            if((nums[i] + nums[i+1]) == target) {
                return new int[]{i, i + 1};
            }
        }
        System.out.println("oops");
        return new int[] {0,0};
    }


    public static void main(String[] args) {
        int[] nums = {9,20,45,29,11,4,5};
        int target = 40;
        leetcode_ono trial = new leetcode_ono();
        System.out.println(Arrays.toString(trial.twoSum(nums,target)));
    }

}
