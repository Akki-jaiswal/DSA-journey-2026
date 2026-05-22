package BasicRecursion;

public class SumNatural {


    public int sumN(int num){

        if(num==1) {
            return 1;
        }
        return num + sumN(num - 1);

    }

    public void main(String[] args) {
        int num = 10;
        System.out.println(sumN(num));

    }
}
