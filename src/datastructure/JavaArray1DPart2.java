package datastructure;

import java.util.*;

public class JavaArray1DPart2 {

    public static boolean canWin(int leap, int[] game) {
        int n = game.length;
        boolean[] visited = new boolean[n];
        return canWinHelper(0, leap, game, visited);
    }

    private static boolean canWinHelper(int position, int leap, int[] game, boolean[] visited) {
        int n = game.length;
        if (position >= n) {
            return true;
        }
        if (position < 0 || game[position] == 1 || visited[position]) {
            return false;
        }
        visited[position] = true;


        if (canWinHelper(position + 1, leap, game, visited)) {
            return true;
        }

        if (canWinHelper(position + leap, leap, game, visited)) {
            return true;
        }

        if (canWinHelper(position - 1, leap, game, visited)) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int q = scan.nextInt();
        while (q-- > 0) {
            int n = scan.nextInt();
            int leap = scan.nextInt();

            int[] game = new int[n];
            for (int i = 0; i < n; i++) {
                game[i] = scan.nextInt();
            }

            System.out.println( (canWin(leap, game)) ? "YES" : "NO" );
        }
        scan.close();
    }
}