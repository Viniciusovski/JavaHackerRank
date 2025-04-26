package datastructure;

import java.util.*;

public class JavaHashset {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        String [] pair_left = new String[t];
        String [] pair_right = new String[t];

        for (int i = 0; i < t; i++) {
            pair_left[i] = s.next();
            pair_right[i] = s.next();
        }

        Set<String> uniquePairs = new HashSet<>();
        for (int i = 0; i < t; i++) {
            String pair1 = pair_left[i] + " " + pair_right[i];
            String pair2 = pair_right[i] + " " + pair_left[i];
            if(!uniquePairs.contains(pair1) && !uniquePairs.contains(pair2)){
                uniquePairs.add(pair1);
            }
            System.out.println(uniquePairs.size());
        }

    }
}