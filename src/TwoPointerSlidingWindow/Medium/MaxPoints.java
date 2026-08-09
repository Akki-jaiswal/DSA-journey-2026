package TwoPointerSlidingWindow.Medium;

public class MaxPoints {
    public int maxScore(int[] cardPoints, int k){
        int n = cardPoints.length;
        int total =0;
        for (int i=0; i<k; i++){
            total+=cardPoints[i];
        }
        int maxPoints = total;
        for (int i=0; i<k; i++){
            total-=cardPoints[k-i-1];
            maxPoints=Math.max(maxPoints, total);
        }
        return maxPoints;
    }
    static void main(String[] args) {
        int[] cards = {1, 2, 3, 4, 5, 6, 1};
        int k = 3;
        MaxPoints sol = new MaxPoints();
        System.out.println(sol.maxScore(cards, k));
    }
}
