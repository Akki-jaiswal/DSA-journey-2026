public class SumEndingWithDigit{
    public static long getSum(int d){
        int firstTerm = (d == 0) ? 10 : d;
        long n = 50;
        return (n * (2L * firstTerm + (n-1)*10)) / 2;
    }

    public static void main(String[] args) {
        int digit = 3;
        System.out.println("Sum for digit "+digit+":"+getSum(digit));
        System.out.println("Sum for digit 0: "+getSum(0));
    }
}