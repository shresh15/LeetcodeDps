/*
An array is considered special if every pair of its adjacent elements contains two numbers with different parity.

You are given an array of integers nums. Return true if nums is a special array, otherwise, return false.
*/
class Solution {
    public boolean isArraySpecial(int[] nums) {
        if(nums.length==1) return true;
     else{   for(int i=1;i<nums.length;i++){
        if(!(
                (isEven(nums[i])==true &&isEven(nums[i-1])==false) ||
            (isEven(nums[i])==false &&isEven(nums[i-1])==true )
             ) )
            return false;
            
        }
        return true;
     }
        
    }
    boolean isEven(int n){
        if(n%2==0) return true;
        else return false;
    }
}