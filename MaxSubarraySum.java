/*
Given an array of positive integers nums, return the maximum possible sum of an ascending subarray in nums.

A subarray is defined as a contiguous sequence of numbers in an array.

A subarray [numsl, numsl+1, ..., numsr-1, numsr] is ascending if for all i where l <= i < r, numsi  < numsi+1. Note that a subarray of size 1 is ascending.

*/
class Solution {
    public int maxAscendingSum(int[] nums) {
        int n=nums.length;
        int sum=nums[0];
       int  maxsum=nums[0];
        for(int i=1;i<n;i++){
            if(nums[i-1]<nums[i]) sum=sum+nums[i];
            else sum=nums[i];
            maxsum=Math.max(maxsum,sum);

        }
        return maxsum;
        
    }
}