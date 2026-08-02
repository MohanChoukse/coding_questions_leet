class Solution {
    public int maxScore(int[] cardPoints, int k) {
int totSum = 0;
int minSum = 0;
        for(int i=0; i<cardPoints.length; i++){
            totSum += cardPoints[i];
        }
int n= cardPoints.length-k;
        for(int i=0; i<n; i++){
            minSum += cardPoints[i];
        }
int min = minSum;
        for(int i=n; i<cardPoints.length; i++){
               minSum += cardPoints[i];
                  minSum -= cardPoints[i-n];
                  min = Math.min(min, minSum);
        }

     return     totSum - min;
        
    }
}