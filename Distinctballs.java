/*
 Find the Number of Distinct Colors Among the Balls

You are given an integer limit and a 2D array queries of size n x 2.

There are limit + 1 balls with distinct labels in the range [0, limit]. Initially, all balls are uncolored. For every query in queries that is of the form [x, y], you mark ball x with the color y. After each query, you need to find the number of distinct colors among the balls.

Return an array result of length n, where result[i] denotes the number of distinct colors after ith query.

Note that when answering a query, lack of a color will not be considered as a color
*/
class Solution {
    public int[] queryResults(int limit, int[][] queries) {
        
        Map<Integer, Integer> ballColorMap = new HashMap<>(); // Maps ball index to its color
        Map<Integer, Integer> colorCountMap = new HashMap<>(); // Maps color to its count
        int[] result = new int[queries.length];

        for (int i = 0; i < queries.length; i++) {
            int x = queries[i][0], y = queries[i][1];

            if (ballColorMap.containsKey(x)) {
                int prevColor = ballColorMap.get(x);
                colorCountMap.put(prevColor, colorCountMap.get(prevColor) - 1);
                if (colorCountMap.get(prevColor) == 0) {
                    colorCountMap.remove(prevColor);
                }
            }

            ballColorMap.put(x, y);
            colorCountMap.put(y, colorCountMap.getOrDefault(y, 0) + 1);
            
            result[i] = colorCountMap.size();
        }

        return result;
    }
        
    
}