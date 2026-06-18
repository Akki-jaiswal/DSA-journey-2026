package BinarySearch.Answers;

public class Median {
    public static void main(String[] args) {
        int[] a = {1, 3, 6, 9};
        int[] b = {2, 5, 7};

        // Safe reference swap to ensure 'a' is always the smaller array
        if (a.length > b.length) {
            int[] temp = a;
            a = b;
            b = temp;
        }

        int n1 = a.length, n2 = b.length;
        int low = 0, high = n1;

        while (low <= high) {
            int cut1 = (low + high) / 2;
            int cut2 = (n1 + n2 + 1) / 2 - cut1;

            int l1 = (cut1 == 0) ? Integer.MIN_VALUE : a[cut1 - 1];
            int l2 = (cut2 == 0) ? Integer.MIN_VALUE : b[cut2 - 1];

            int r1 = (cut1 == n1) ? Integer.MAX_VALUE : a[cut1];
            int r2 = (cut2 == n2) ? Integer.MAX_VALUE : b[cut2];

            if (l1 <= r2 && l2 <= r1) {
                if ((n1 + n2) % 2 == 0) {
                    // Added parentheses to fix operator precedence
                    System.out.println((Math.max(l1, l2) + Math.min(r1, r2)) / 2.0);
                } else {
                    System.out.println(Math.max(l1, l2));
                }
                return; // Prevent infinite loop once found
            }
            else if (l1 > r2) {
                high = cut1 - 1; // Move left in array 'a'
            }
            else {
                low = cut1 + 1;  // Move right in array 'a'
            }
        }
        System.out.println(0.0);
    }
}