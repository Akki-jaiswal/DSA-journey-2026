package BasicMaths;

//        BRUTE FORCE APPROACH
//        int num1 = 36;
//        int num2 = 45;
//        int gcd = 1;
//
//        int limit = Math.min(num2, num1);
//        for(int i = 1; i <= limit; i++){
//            if(num1 % i == 0 && num2 % 1 == 0){
//                gcd = i;
//            }
//        }
//        System.out.println("gcd is: "+gcd);

//
        public class GCD{

            public static int findGcd(int a, int b) {
                while (a > 0 && b > 0) {
                    // If a is greater than b, update a to the remainder of a / b
                    if (a > b) {
                        a = a % b;
                    }
                    // If b is greater than or equal to a, update b to the remainder of b / a
                    else {
                        b = b % a;
                    }
                }

                // If a becomes 0, return b as the GCD; otherwise, return a
                if (a == 0) {
                    return b;
                }
                return a;
            }

            public static void main(String[] args) {
                int n1 = 20, n2 = 15;

                // Find the GCD of n1 and n2
                int gcd = findGcd(n1, n2);

                System.out.println("GCD of " + n1 + " and " + n2 + " is: " + gcd);
            }
        }