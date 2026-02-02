import java.util.Stack;

public class baseball_game {
    public static void main(String[] args) {
        String[] ops = {"5","2","C","D","+"};
        System.out.println(calPoints(ops));
    }

    
    public static int calPoints(String[] operations) {
        Stack<Integer> st = new Stack<>();

        for (String s : operations) {
            if (s.equals("C")) {
                st.pop();
            } 
            else if (s.equals("D")) {
                st.push(st.peek() * 2);
            } 
            else if (s.equals("+")) {
                int top = st.pop();
                int newTop = top + st.peek();
                st.push(top);
                st.push(newTop);
            } 
            else {
                st.push(Integer.parseInt(s));
            }
        }

        int ans = 0;
        while (!st.isEmpty()) {
            ans += st.pop();
        }
        return ans;
    }
}
