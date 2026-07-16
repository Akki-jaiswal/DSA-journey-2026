package BitManipulation.InterviewProblems;

public class MinBitsFlip {
    public int minBitsFlip(int start, int goal){
        int num = start^goal;
        int count = 0;
        for (int i=0; i<32; i++){
            count+= (num&1);
            num = num>>1;
        }
        return count;
    }
    static void main(String[] args){
        int start = 10, goal = 7;
        MinBitsFlip sol = new MinBitsFlip();
        int ans = sol.minBitsFlip(start,goal);
        System.out.println("The min. bit flips to convert number is: "+ ans);
    }
}

