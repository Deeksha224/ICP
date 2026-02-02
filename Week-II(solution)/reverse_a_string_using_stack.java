import java.util.Stack;
public class reverse_a_string_using_stack {
    public static void main(String[] args) {
        String s = "LeetCode";
        System.out.println("Reversed String: " + reverseString(s));
    }

    public static String reverseString(String str) {
        Stack<Character> stack = new java.util.Stack<>();

        // Push all characters onto the stack
        for (char ch : str.toCharArray()  ) {
            stack.push(ch);
        }

        // Pop all characters from the stack to get the reversed string
        StringBuilder reversedStr = new StringBuilder();
        while (!stack.isEmpty()) {
            reversedStr.append(stack.pop());
        }

        return reversedStr.toString();
    }
}
