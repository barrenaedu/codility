package codility.lessons;

import java.util.ArrayDeque;
import java.util.Deque;

public class Nesting {

    public int solutionStack(String str) {
        Deque<Character> stack = new ArrayDeque<Character>();
        boolean nested = str.length() % 2 == 0 && str.length() <= 1_000_000;
        int i = 0;
        char curr;
        while (nested && i < str.length()) {
            curr = str.charAt(i);
            if (curr == '(') {
                stack.push(curr);
            } else {
                // Assuming ')' is the only valid character here
                nested = stack.size() > 0;
                if (nested) {
                    stack.pop();
                }
            }
            i++;
        }
        return nested && stack.size() == 0 ? 1 : 0;
    }

    public int solutionAlternative(String str) {
        int i = 0;
        char curr;
        int count = 0;
        if (str.length() > 1_000_000) {
            count = -1;
        }
        while (count >= 0 && i < str.length()) {
            curr = str.charAt(i);
            if (curr == '(') {
                count++;
            } else {
                // Assuming ')' is the only valid character here
                count--;
            }
            i++;
        }
        return count == 0 ? 1 : 0;
    }

}
