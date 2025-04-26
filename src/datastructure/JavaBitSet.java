package datastructure;

import java.util.*;

public class JavaBitSet {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        scanner.nextLine(); // consume the rest of the line

        BitSet b1 = new BitSet(N);
        BitSet b2 = new BitSet(N);

        for (int i = 0; i < M; i++) {
            String operation = scanner.next();
            int operand1 = scanner.nextInt();
            int operand2 = scanner.nextInt();

            switch (operation) {
                case "AND":
                    if (operand1 == 1) {
                        b1.and(operand2 == 1 ? b1 : b2);
                    } else {
                        b2.and(operand2 == 1 ? b1 : b2);
                    }
                    break;
                case "OR":
                    if (operand1 == 1) {
                        b1.or(operand2 == 1 ? b1 : b2);
                    } else {
                        b2.or(operand2 == 1 ? b1 : b2);
                    }
                    break;
                case "XOR":
                    if (operand1 == 1) {
                        b1.xor(operand2 == 1 ? b1 : b2);
                    } else {
                        b2.xor(operand2 == 1 ? b1 : b2);
                    }
                    break;
                case "FLIP":
                    if (operand1 == 1) {
                        b1.flip(operand2);
                    } else {
                        b2.flip(operand2);
                    }
                    break;
                case "SET":
                    if (operand1 == 1) {
                        b1.set(operand2);
                    } else {
                        b2.set(operand2);
                    }
                    break;
                default:
                    break;
            }

            System.out.println(b1.cardinality() + " " + b2.cardinality());
        }

        scanner.close();
    }
}