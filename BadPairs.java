/*
You are given a 0-indexed integer array nums. A pair of indices (i, j) is a bad pair if i < j and j - i != nums[j] - nums[i].

Return the total number of bad pairs in nums.
*/
class Solution {
    public long countBadPairs(int[] nums) {
        int n = nums.length;
        long totalPairs = (long) n * (n - 1) / 2; // Total pairs

        HashMap<Integer, Integer> map = new HashMap<>();
        long goodPairs = 0;

        for (int i = 0; i < n; i++) {
            int key = i - nums[i];
            goodPairs += map.getOrDefault(key, 0); // Count how many times this difference occurred before
            map.put(key, map.getOrDefault(key, 0) + 1);
        }

        return totalPairs - goodPairs; // Bad pairs = Total pairs - Good pairs
    
        
    }
}