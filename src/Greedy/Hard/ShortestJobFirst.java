package Greedy.Hard;

import java.util.Arrays;

public class ShortestJobFirst {
    public float calculateAverageWaitTime(int[] jobs){
        Arrays.sort(jobs);
        float waitTime = 0;
        int totalTime = 0;
        int n = jobs.length;
        for (int i=0; i<n; i++){
            waitTime+=totalTime;
            totalTime+=jobs[i];
        }
        return waitTime/n;
    }
    static void main(String[] args) {
        int[] jobs = {4, 3, 7, 1, 2};

        System.out.print("Array Representing Job Durations: ");
        for (int job : jobs) {
            System.out.print(job + " ");
        }
        System.out.println();

        ShortestJobFirst sjf = new ShortestJobFirst();
        float ans = sjf.calculateAverageWaitTime(jobs);

        System.out.println("Average waiting time: " + ans);
    }
}
