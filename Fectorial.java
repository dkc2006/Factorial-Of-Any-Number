import java.math.BigInteger;
import java.util.Scanner;

class FactorialCalculator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        BigInteger result = calculateFactorial(BigInteger.valueOf(n));
        System.out.println("Factorial of " + n + " is:\n" + result);
    }

    public static BigInteger calculateFactorial(BigInteger n) {
        if (n.equals(BigInteger.ZERO) || n.equals(BigInteger.ONE)) {
            return BigInteger.ONE;
        } else {
            return n.multiply(calculateFactorial(n.subtract(BigInteger.ONE)));
        }
    }
}
