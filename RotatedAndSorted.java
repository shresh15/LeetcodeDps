/*
Given an array nums, return true if the array was originally sorted in non-decreasing order, then rotated some number of positions (including zero). Otherwise, return false.
Feb : 2
*/
class Solution {
    public boolean check(int[] nums) {
        int n=nums.length;
        int cnt=0;
        for(int i=1;i<n;i++){
            if(nums[i-1]>nums[i]) cnt++;
        }
        if(nums[n-1]>nums[0])cnt++;
        if(cnt<=1) return true;
        else
        return false;
    }
}