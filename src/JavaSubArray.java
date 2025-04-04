import java.util.Scanner;

public class JavaSubArray {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        int negativeSubarrays = 0;

        for (int i = 0; i < n; i++) {
            int currentSum = 0;
            for (int j = i; j < n; j++) {
                currentSum += array[j];
                if (currentSum < 0) {
                    negativeSubarrays++;
                }
            }
        }

        System.out.println(negativeSubarrays);
    }
}
