import java.util.Stack;

public class longest_valid_parentheses {
    public static void main(String[] args) {
        String s = "(()))())(";
        System.out.println(longestValidParentheses(s));
    }

    public static int longestValidParentheses(String s) {
        Stack<Integer> st = new Stack<>();
        st.push(-1);
        int ans = 0;
        for (int i = 0; i < s.length(); ++i) {
            if (s.charAt(i) == '(') {
                st.push(i); 
            }
            else {
                st.pop();
                if (st.empty()){
                    st.push(i);
                } 
                else{
                    ans = Math.max(ans, i - st.peek()); 
                }
            }
        }
        return ans;
    }
}
