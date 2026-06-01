package Arrays;

import java.util.*;

public class UnionSortedArrays {
    public List<Integer> findUnion(int[] arr1, int[] arr2, int n, int m) {
        List<Integer> union = new ArrayList<>();
        int i = 0, j = 0;

        while (i < n && j < m) {
            if (arr1[i] <= arr2[j]) {
                if (union.isEmpty() || union.get(union.size() - 1) != arr1[i])
                    union.add(arr1[i]);
                i++;
            } else {
                if (union.isEmpty() || union.get(union.size() - 1) != arr2[j])
                    union.add(arr2[j]);
                j++;
            }
        }

        while (i < n) {
            if (union.isEmpty() || union.get(union.size() - 1) != arr1[i])
                union.add(arr1[i]);
            i++;
        }

        while (j < m) {
            if (union.isEmpty() || union.get(union.size() - 1) != arr2[j])
                union.add(arr2[j]);
            j++;
        }
        return union;
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] arr2 = {2, 3, 4, 4, 5, 11, 12};

        UnionSortedArrays sol = new UnionSortedArrays();
        List<Integer> result = sol.findUnion(arr1, arr2, arr1.length, arr2.length);

        System.out.println("Union: " + result);
    }
}