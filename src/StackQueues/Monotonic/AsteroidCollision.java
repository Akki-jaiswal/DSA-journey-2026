package StackQueues.Monotonic;

import java.util.ArrayList;
import java.util.List;

public class AsteroidCollision {
    public int[] asteroidCollision(int[] asteroids){
        int n = asteroids.length;
        List<Integer> st = new ArrayList<>();
        for (int i=0; i<n; i++){
            if (asteroids[i]>0){
                st.add(asteroids[i]);
            }
            else{
                while (!st.isEmpty() && st.get(st.size() - 1) > 0 &&
                        st.get(st.size() - 1) < Math.abs(asteroids[i])) {
                    st.remove(st.size() - 1);
                }
                if (!st.isEmpty()&&st.get(st.size()-1)==Math.abs(asteroids[i])){
                    st.remove(st.size()-1);
                }
                else if (st.isEmpty()||st.get(st.size()-1)<0){
                    st.add(asteroids[i]);
                }
            }
        }
        int[] result = new int[st.size()];
        for (int i=0; i<st.size(); i++){
            result[i] = st.get(i);
        }
        return result;
    }
    static void main(String[] args) {
        // Input array representing asteroid directions and sizes
        int[] arr = {10, 20, -22, 11, -5, -13, 25};

        // Create an instance of the Solution class
        AsteroidCollision sol = new AsteroidCollision();

        // Call the asteroidCollision function
        int[] ans = sol.asteroidCollision(arr);

        // Print the final state of asteroids
        System.out.print("The state of asteroids after collisions is: ");
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i] + " ");
        }
    }
}
