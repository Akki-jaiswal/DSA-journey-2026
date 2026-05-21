package BasicMaths;

public class Prime {

//        NORMAL Approach --> O(N)
//        boolean result = false;
//        for(int i=2; i<=num-1; i++){
//            if(num % i == 0){
//                result = true;
//                break;
//            }
//        }
//        if(result){
//            System.out.println("prime no.");
//        }else System.out.println("not a prime no.");

//        OPTIMAL APPROACH --> O(sqrt(N))
        public static boolean isPrime(int n) {
            if (n <= 1) return false;
            // Only loop up to sqrt(n)
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) return false; // Early exit
            }
            return true;
        }

        public static void main(String[] args) {
            int num = 1433333;
            if (isPrime(num)) {
                System.out.println(num + " is a prime number.");
            } else {
                System.out.println(num + " is not a prime number.");
            }
        }
    }