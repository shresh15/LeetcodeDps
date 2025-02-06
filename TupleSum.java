/*
Tuple with Same Product
Given an array nums of distinct positive integers, return the number of tuples (a, b, c, d) such that a * b = c * d where a, b, c, and d are elements of nums, and a != b != c != d.

*/
class Solution {
    public int tupleSameProduct(int[] nums) {
        HashMap<Integer,Integer>mpp=new HashMap<>();
        int n=nums.length;
        int count=0;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                int val=nums[i]*nums[j];
                mpp.put(val,mpp.getOrDefault(val,0)+1);
            }
        }
             for (int freq : mpp.values()) {
            if (freq > 1) {
                count += (freq * (freq - 1) / 2) * 8;
            }
        }
        return count;
        }
  
}