package BitManipulation.Basics;

public class CountNoOfSets {
    public int countSetBits(int n){
        int count = 0;
        while (n>0){
            n &= (n-1);
            count++;
        }
        return count;
    }
    static void main(String[] args) {
        int n = 29;  // Example input for n (binary: 11101)

        CountNoOfSets sol = new CountNoOfSets();
        int result = sol.countSetBits(n);

        System.out.println("The number of set bits is: " + result);
    }
}
