package Greedy.Easy;

import java.util.Arrays;

public class AssignCookies {
    public int  findContentChildren(int[] student, int[] cookie){
        Arrays.sort(student);
        Arrays.sort(cookie);
        int studentIndex = 0;
        int cookieIndex = 0;
        while (studentIndex<student.length && cookieIndex<cookie.length){
            if (cookie[cookieIndex]>=student[studentIndex]){
                studentIndex++;
            }
            cookieIndex++;
        }
        return studentIndex;
    }
    static void main(String[] args) {
        int[] student = {1, 2, 3};
        int[] cookie = {1, 1};

        // Create Solution object
        AssignCookies solver = new AssignCookies();

        // Get the number of content students and print it
        int result = solver.findContentChildren(student, cookie);
        System.out.println("Maximum number of content students: " + result);
    }
}
