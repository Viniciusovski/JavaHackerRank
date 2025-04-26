package datastructure;

import java.util.*;

public class JavaDequeue {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Deque<Integer> deque = new ArrayDeque<>();
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        int n = in.nextInt();
        int m = in.nextInt();
        int maxUnique = 0;

        for (int i = 0; i < n; i++) {
            int num = in.nextInt();
            deque.add(num);
            // Manually implement getOrDefault
            Integer count = frequencyMap.get(num);
            if (count == null) {
                count = 0;
            }
            frequencyMap.put(num, count + 1);

            if (deque.size() == m) {
                maxUnique = Math.max(maxUnique, frequencyMap.size());
                int removed = deque.removeFirst();
                // Update frequency map
                int newCount = frequencyMap.get(removed) - 1;
                if (newCount == 0) {
                    frequencyMap.remove(removed);
                } else {
                    frequencyMap.put(removed, newCount);
                }
            }
        }
        System.out.println(maxUnique);
    }
}