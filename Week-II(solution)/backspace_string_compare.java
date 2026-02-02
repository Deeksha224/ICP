import java.util.Stack;

public class backspace_string_compare {
    public static void main(String[] args) {
        String s = "ab#c";
        String t = "ad#c";
        System.out.println(backspaceCompare(s, t));
    }

    public  static boolean backspaceCompare(String s, String t) {
        return op(s).equals(op(t));
    }
    public static String op(String s) {
        Stack<Character> st = new Stack<>();
        for (char ch : s.toCharArray()) {
            if (ch == '#') {
                if (!st.isEmpty()) st.pop();
            } 
            else {
                st.push(ch);
            }
        }

        StringBuilder sb = new StringBuilder();
        while (!st.isEmpty()) {
            sb.append(st.pop());
        }
        return sb.reverse().toString(); 
    }
}
