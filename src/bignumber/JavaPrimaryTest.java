package bignumber;

import java.io.*;
import java.math.BigInteger;

public class JavaPrimaryTest {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String n = bufferedReader.readLine();
        BigInteger bigInt = new BigInteger(n);
        boolean isPrime = bigInt.isProbablePrime(10); // Using certainty 10 for high confidence
        System.out.println(isPrime ? "prime" : "not prime");
        bufferedReader.close();
    }
}
