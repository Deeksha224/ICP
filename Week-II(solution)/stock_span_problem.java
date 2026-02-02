import java.util.ArrayList;
import java.util.Stack;
public class stock_span_problem {
    public static void main(String[] args) {
        int[] arr = {100, 80, 60, 70, 60, 75, 85};
        System.out.println(calculateSpan(arr));
    }

    public static ArrayList<Integer> calculateSpan(int[] arr) {
        // code here
        int[] temp = new int[arr.length];
        Stack<Integer> st = new Stack<>();
        
        for (int i = 0; i < arr.length; i++){
            while(!st.isEmpty() && arr[st.peek()] <= arr[i]){
                st.pop();
            }
            if (st.isEmpty()){
                temp[i] = i+1;
            }
            else{
                temp[i] = i-st.peek();
            }
            st.push(i);
        }
        ArrayList<Integer> ans = new ArrayList<>();
        for (int x : temp) ans.add(x);

        return ans;
    }
}
