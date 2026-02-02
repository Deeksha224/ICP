import java.util.Stack;

public class asteroid_collision {
    public static void main(String[] args) {
        int[] asteroids = {5,10,-5};
        int[] result = asteroidCollision(asteroids);
        for(int num : result){
            System.out.print(num + " ");
        }
    }
    public static int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> st = new Stack<>();
        for (int asteroid : asteroids){
            if (asteroid > 0){
                st.push(asteroid);
            }
            else{
                while (!st.isEmpty() && st.peek() > 0 && st.peek() < Math.abs(asteroid)){
                    st.pop();
                }
                if(!st.isEmpty() && st.peek() == Math.abs(asteroid)){
                    st.pop();
                }
                else if (st.isEmpty() || st.peek() < 0){ 
                    st.push(asteroid);
                }
            }
        }
        int[] ans = new int[st.size()];
        for (int i = ans.length - 1; i >=0; i--){
            ans[i] = st.pop();
        }
        return ans;
    }
    
}
