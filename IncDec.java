/*
You are given an array of integers nums. Return the length of the longest 
subarray
 of nums which is either 
strictly increasing
 or 
strictly decreasing
.
*/
class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        int n=nums.length;
        int inc=1;
        int dec=1;
        int longest=1;
        for(int i=1;i<n;i++){
            if(nums[i]>nums[i-1]) inc++; else inc=1;
             if(nums[i]<nums[i-1]) dec++; else dec=1;
            
            longest=Math.max(longest,Math.max(inc,dec)) ;
            
        }
        
        
    
    return longest;
}
}