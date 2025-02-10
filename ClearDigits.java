/*
Clear Digits

You are given a string s.

Your task is to remove all digits by doing this operation repeatedly:

Delete the first digit and the closest non-digit character to its left.
Return the resulting string after removing all digits.
*/
class Solution {
    public String clearDigits(String s) {
        StringBuilder res=new StringBuilder();
        for(char c:s.toCharArray() ){
            if(c>='0' && c<='9'){
                if(res.length()>0){
                    res.deleteCharAt(res.length()-1);
                }

            }
            else res.append(c);
        }
        return res.toString();
    }
}