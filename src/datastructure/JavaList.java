package datastructure;

import java.util.*;

public class JavaList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(scanner.nextInt());
        }
        int q = scanner.nextInt();
        scanner.nextLine();
        for (int i = 0; i < q; i++) {
            String operation = scanner.nextLine();
            if (operation.equals("Insert")) {
                int x = scanner.nextInt();
                int y = scanner.nextInt();
                list.add(x, y);
                if (scanner.hasNextLine()) {
                    scanner.nextLine();
                }
            } else if (operation.equals("Delete")) {
                int x = scanner.nextInt();
                list.remove(x);
                if (scanner.hasNextLine()) {
                    scanner.nextLine();
                }
            }
        }
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i));
            if (i < list.size() - 1) {
                System.out.print(" ");
            }
        }
        scanner.close();
    }
}