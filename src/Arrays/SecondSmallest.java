package Arrays;

public class SecondSmallest {
    static void main(String[] args) {


        int[] arr = {2, 5, 1, 6, 8, 6};
        int n = arr.length;
        int Smallest = Integer.MAX_VALUE;
        int sSmallest = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            if (arr[i] < Smallest) {
                sSmallest = Smallest;
                Smallest = arr[i];
            } else if (arr[i] < sSmallest && arr[i] != Smallest) {
                sSmallest = arr[i];
            }
        }
        System.out.println(sSmallest);

    }
}