import java.math.BigInteger;
import java.util.Scanner;

public class JavaBigInteger {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String num1Str = scanner.nextLine();
        String num2Str = scanner.nextLine();

        BigInteger num1 = new BigInteger(num1Str);
        BigInteger num2 = new BigInteger(num2Str);

        BigInteger sum = num1.add(num2);
        BigInteger product = num1.multiply(num2);

        System.out.println(sum);
        System.out.println(product);
    }
}
