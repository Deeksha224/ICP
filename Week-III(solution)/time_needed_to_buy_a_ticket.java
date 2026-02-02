public class time_needed_to_buy_a_ticket {
    public static void main(String[] args) {
        int[] ticket = {2,3,2};
        int k = 2;
        System.out.println(timeRequiredToBuy(ticket, k));
    }
    public static int timeRequiredToBuy(int[] ticket, int k) {
        int count = 0;
        int range = ticket[k];
        for (int i = 0; i < ticket.length; i++){
            if (i<=k){
                count += Math.min(range,ticket[i]);
            }
            else{
                count += Math.min(range-1,ticket[i]);
            }
        }
        return count;
    }
}