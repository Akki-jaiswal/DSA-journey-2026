package BitManipulation.Basics;

public class SetOrNot {
    public boolean checkIthBit(int n, int i){
        return (n & (1<<i)) != 0;
    }
    static void main(String [] args){
        SetOrNot sol = new SetOrNot();
        int num = 5;
        int bitIndex = 3;
        if (sol.checkIthBit(num, bitIndex)){
            System.out.println("The "+ bitIndex + "-th bit of " + num + " is set (1).");
        } else {
            System.out.println("The " + bitIndex + "-th bit of " + num + " is not set (0).");
        }
    }
}
