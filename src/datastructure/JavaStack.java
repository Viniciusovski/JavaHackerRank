package datastructure;

import java.util.Scanner;
import java.util.Stack;

public class JavaStack {
    public static boolean isBalanced(String s) {
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else {
                if (stack.isEmpty()) {
                    return false;
                }
                char top = stack.pop();
                if (!((c == ')' && top == '(') ||
                        (c == '}' && top == '{') ||
                        (c == ']' && top == '['))) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }

    public static void main(String []argh) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String input = sc.next();
            System.out.println(isBalanced(input));
        }
        sc.close();
    }
}
