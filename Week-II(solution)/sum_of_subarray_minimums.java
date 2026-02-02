import java.util.Stack;

public class sum_of_subarray_minimums {
    public static void main(String[] args) {
        int[] arr = {3,1,2,4};
        System.out.println(sumSubarrayMins(arr));
    }
    public static int sumSubarrayMins(int[] arr) {
        final int MOD = 1000000007;
        Stack<Integer> st = new Stack<>();
        long min = 0;

        for (int i = 0; i <= arr.length; i++) {
            while (!st.empty() && (i == arr.length || arr[st.peek()] >= arr[i])) {
                int mid = st.pop();
                int leftBoundary = st.empty() ? -1 : st.peek();
                int rightBoundary = i;

                long count = (mid - leftBoundary) * (rightBoundary - mid) % MOD;

                min += (count * arr[mid]) % MOD;
                min %= MOD;
            }
            st.push(i);
        }

        return (int) min;
    }
}
