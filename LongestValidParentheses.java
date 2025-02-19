import java.util.ArrayDeque;
import java.util.Deque;

public class LongestValidParentheses {

    public static int longestValidParentheses(String s) {
        int maxLength = 0;
        // Use a stack to store indices; push -1 as a base index for valid substrings
        Deque<Integer> stack = new ArrayDeque<>();
        stack.push(-1);
        
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            
            // If it's an opening parenthesis, push its index onto the stack
            if (c == '(') {
                stack.push(i);
            } else { // c == ')'
                // Pop the top index for the matching '('
                stack.pop();
                // If the stack becomes empty, push the current index as the new base
                if (stack.isEmpty()) {
                    stack.push(i);
                } else {
                    // The current valid substring length is i - index at top of stack
                    maxLength = Math.max(maxLength, i - stack.peek());
                }
            }
        }
        
        return maxLength;
    }

    public static void main(String[] args) {
        String s1 = "(()";
        System.out.println("Longest valid parentheses in \"" + s1 + "\": " + longestValidParentheses(s1)); // Expected output: 2

        String s2 = ")()())";
        System.out.println("Longest valid parentheses in \"" + s2 + "\": " + longestValidParentheses(s2)); // Expected output: 4
    }
}
