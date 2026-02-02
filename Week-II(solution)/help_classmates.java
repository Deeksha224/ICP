import java.util.Stack;

public class help_classmates {
    public static void main(String[] args) {
        int arr[] = {4,5,2,10,8};
        int n = arr.length;
        int[] result = help_classmate(arr, n);
        for (int val : result) {
            System.out.print(val + " ");
        }
    }
    public static int[] help_classmate(int arr[], int n) {
        int[] ans = new int[n];
        Stack<Integer> st = new Stack<>();

        for (int i = n - 1; i >= 0; i--) {
            while (!st.isEmpty() && st.peek() >= arr[i]) {
                st.pop();
            }

            ans[i] = st.isEmpty() ? -1 : st.peek();
            st.push(arr[i]);
        }

        return ans;
    }
}
