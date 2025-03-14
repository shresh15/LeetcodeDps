/*
You are given a 0-indexed integer array candies. Each element in the array denotes a pile of candies of size candies[i]. You can divide each pile into any number of sub piles, but you cannot merge two piles together.

You are also given an integer k. You should allocate piles of candies to k children such that each child gets the same number of candies. Each child can be allocated candies from only one pile of candies and some piles of candies may go unused.

Return the maximum number of candies each child can get.
*/
class Solution {
    public int maximumCandies(int[] candies, long k) {
        int n=candies.length;
        int maxc=0;
        long tc=0;
        for(int i=0;i<n;i++){
            maxc=Math.max(maxc,candies[i]);
            tc=tc+candies[i];
        }
        if(tc<k) return 0;
        //Binary search
        int l=1,r=maxc;
        int res=0;
        while(l<=r){
            int mid=(l+r)/2;
            if(canDistribute(mid,candies,n,k))
           {res=mid;
           l=mid+1;}
           else{
              r=mid-1;
           }

        }
        return res;
    }

    private boolean canDistribute(int mid,int[] candies,int n ,long k){
        for(int i=0;i<n;i++){
            k= k- candies[i]/mid;
            if(k<=0) return true;
        }
        return false;

    }
}