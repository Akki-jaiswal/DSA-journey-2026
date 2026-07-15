package BitManipulation.Basics;

public class SetRightmost {
    public static int setRightmostUnsetBit(int n){
        return n | (n+1);
    }
    static void main(String[] args){
        int n = 10; // binary: 1010

        // Call function
        int result = SetRightmost.setRightmostUnsetBit(n);

        // Print output
        System.out.println("Number after setting rightmost unset bit: " + result);
    }
}
