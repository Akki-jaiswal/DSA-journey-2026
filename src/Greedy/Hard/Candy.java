package Greedy.Hard;

public class Candy {
    public int candy(int[] ratings){
        int n=ratings.length;
        int candies = n;
        int i=1;
        while (i<n){
            if (ratings[i] == ratings[i-1]){
                i++;
                continue;
            }
            int peak = 0;
            while (i<n && ratings[i]>ratings[i-1]){
                peak++;
                candies+=peak;
                i++;
            }
            int valley = 0;
            while (i<n && ratings[i]<ratings[i-1]){
                valley++;
                candies+=valley;
                i++;
            }
            candies-=Math.min(peak, valley);
        }
        return candies;
    }
    static void main(String[] args) {

        // Input array of ratings
        int[] ratings = {1, 3, 6, 8, 9, 5, 3};

        // Create object of Solution class
        Candy sol = new Candy();

        // Call function and print result
        System.out.println("Minimum candies required: " + sol.candy(ratings));
    }
}
