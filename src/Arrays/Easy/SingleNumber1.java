package Arrays;

public class SingleNumber1 {
    public int check(int[] arr) {
        int xor = 0;
        for(int num:arr){
            xor^=num;
        }
        return xor;
    }

    static void main(String[] args) {
        int[] arr = {4,1,2,1,2};
        SingleNumber1 obj = new SingleNumber1();
        System.out.println(obj.check(arr));
    }
}
