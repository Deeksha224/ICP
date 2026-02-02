import java.util.LinkedList;
import java.util.Queue;

public class find_the_winner_of_circular_game {
    public static void main(String[] args) {
        int n = 5;
        int k = 2;
        System.out.println(findTheWinner(n, k));
    }
    public static int findTheWinner(int n, int k) {
        Queue<Integer> q = new LinkedList<Integer>();
        for (int i = 1; i < n+1; i++){
            q.add(i);
        }
        while(q.size() > 1){
            for (int i = 0; i < k-1; i++){
                q.add(q.remove());
            }
            q.remove();
        }
        return(q.peek());
    }
}
