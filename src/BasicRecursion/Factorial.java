package BasicRecursion;

public class Factorial {
    public int calcFact(int n){
        if(n==0){
            return 1;
        }
        return n * calcFact(n-1);

    }

    void main(String[] args) {
        int num = 5;
        System.out.println(calcFact(num));
    }
}
