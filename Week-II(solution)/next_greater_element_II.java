import java.util.Stack;

public class next_greater_element_II {
    public static void main(String[] args) {
        int[] nums = {1,2,1};
        int[] result = nextGreaterElements(nums);
        for(int num : result){
            System.out.print(num + " ");
        }
    }
    public static int[] nextGreaterElements(int[] nums) {
        int n = nums.length;
        int[] arr = new int[n];
        for (int i = 0; i < n; i++){
            arr[i] = -1;
        }
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < 2*n; i++){
            while (!st.isEmpty() && nums[st.peek()] < nums[i%n]){
                arr[st.pop()] = nums[i%n];
                
            }
            if (i < n){
                st.push(i);
            }
        }
        return arr;
    }
}
