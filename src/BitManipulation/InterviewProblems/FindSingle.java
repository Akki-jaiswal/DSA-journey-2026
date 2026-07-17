package BitManipulation.InterviewProblems;

public class FindSingle {
    public int getSingleElement(int[] arr){
        int xorr = 0;
        for (int num: arr){
            xorr^=num;
        }
        return xorr;
    }
    static void main(String[] args){
        int[] arr = {4,1,2,1,2};
        FindSingle obj = new FindSingle();
        int ans = obj.getSingleElement(arr);
        System.out.println(ans);
    }
}
