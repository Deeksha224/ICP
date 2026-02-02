import java.util.ArrayList;
import java.util.Stack;

public class delete_middle_element_of_a_stack {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);

        deleteMid(stack);
    }

    // using ArrayList to store elements temporarily
    public static void deleteMid(Stack<Integer> s) {
        ArrayList<Integer> l = new ArrayList<>();
        while(!s.isEmpty()){
            l.add(s.pop());
        }
        int mid = l.size()/2;
        l.remove(mid);
        for (int i = l.size() - 1; i >= 0; i--) {
            s.push(l.get(i));
        }
    }
    // Time Complexity: O(n)
    // Space Complexity: O(n)

    // using recursion
    public static void deleteMid1(Stack<Integer> s) {
        // code here
        fun(s,(s.size()-(s.size()%2))/2);
    }
    public static void fun(Stack<Integer> st,int ele){
        if(ele==0){
            st.pop();
            return;
        }
        int x = st.pop();
        fun(st,ele-1);
        st.push(x);
    }
    // Time Complexity: O(n)
    // Space Complexity: O(n) 
}
