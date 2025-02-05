/*
Check if One String Swap Can Make Strings Equal

You are given two strings s1 and s2 of equal length. A string swap is an operation where you choose two indices in a string (not necessarily different) and swap the characters at these indices.

Return true if it is possible to make both strings equal by performing at most one string swap on exactly one of the strings. Otherwise, return false.
*/
class Solution {
    public boolean areAlmostEqual(String s1, String s2) {
        if(s1.equals(s2)) return true;
        else{
            int m=s1.length();
            int m2=s2.length();
            int mismatch=0;
            ArrayList<Character>arr=new ArrayList<>();
            int pos=0;
            while(pos<m){
                if(s1.charAt(pos)!=s2.charAt(pos)){
                     arr.add(s1.charAt(pos));
                     arr.add(s2.charAt(pos));
                     mismatch++;
                }
                if(mismatch>2) return false;
                pos++;
            }
            if(
                (arr.size()==4) && ( arr.get(0)==arr.get(3))&& (arr.get(1) == arr.get(2) )
                )
            return true;

            
        }
        return false;
        
    }
}