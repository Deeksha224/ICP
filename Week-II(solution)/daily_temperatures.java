import java.util.Stack;

public class daily_temperatures {
    public static void main(String[] args) {
        int[] temperatures = {73,74,75,71,69,72,76,73};
        int[] result = dailyTemperatures(temperatures);
        for(int num : result){
            System.out.print(num + " ");
        }
    }
    
    public static int[] dailyTemperatures(int[] temperatures) {
        int[] ans = new int[temperatures.length];
        Stack<Integer> st = new Stack<>();
        for(int i = 0; i < temperatures.length; i++){
            while(!st.isEmpty() && temperatures[st.peek()] < temperatures[i]){
                ans[st.peek()] = i-st.pop();
            }
            st.push(i);
        }
        return ans;
    }
}
