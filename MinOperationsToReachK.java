/*
3066. Minimum Operations to Exceed Threshold Value II

You are given a 0-indexed integer array nums, and an integer k.

In one operation, you will:

Take the two smallest integers x and y in nums.
Remove x and y from nums.
Add min(x, y) * 2 + max(x, y) anywhere in the array.
Note that you can only apply the described operation if nums contains at least two elements.

Return the minimum number of operations needed so that all elements of the array are greater than or equal to k.
*/
class Solution {
    public int minOperations(int[] nums, int k) {
        PriorityQueue<Long> minHeap = new PriorityQueue<>();
        
        // Add all elements to the min-heap
        for (int num : nums) {
            minHeap.add((long)num);
        }
        
        int operations = 0;
        
        // Process the heap while there are at least two elements and the smallest is less than k
        while (minHeap.size() > 1 && minHeap.peek() < k) {
            long x = minHeap.poll(); // Smallest element
            long y = minHeap.poll(); // Second smallest element
            
            // Perform the operation
            long newElement = (Math.min(x, y) * 2) + Math.max(x, y);
            minHeap.add(newElement);
            
            operations++;
        }
        
        return operations;
        
    }
}