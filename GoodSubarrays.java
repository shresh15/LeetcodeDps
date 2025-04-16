/*
Given an integer array nums and an integer k, return the number of good subarrays of nums.

A subarray arr is good if there are at least k pairs of indices (i, j) such that i < j and arr[i] == arr[j].

A subarray is a contiguous non-empty sequence of elements within an array.
*/
class Solution {
    public long countGood(int[] nums, int k) {
        HashMap<Integer,Integer>mpp=new HashMap<>();
        int i=0,j=0;
        long pairs=0,result=0;
        int n=nums.length;
        while(j<n)
        {
            pairs=pairs+mpp.getOrDefault(nums[j],0);
            mpp.put(nums[j],mpp.getOrDefault(nums[j],0)+1);

            while(pairs>=k){
                result=result+(n-j);
                mpp.put(nums[i], mpp.get(nums[i])-1 ); // shrinking the window
                pairs= pairs- mpp.get(nums[i]);
                i++;

            }
            j++;

        }
        return result;
    }
}