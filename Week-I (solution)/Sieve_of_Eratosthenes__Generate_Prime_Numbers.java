public class Sieve_of_Eratosthenes__Generate_Prime_Numbers {
    public static void main(String[] args) {
        int n = 30;
        System.out.println(prime_sieve(n));
    }
    // Brute Force
    public static int count(int n){
        int count_prime = 0;
        for (int i = 2; i < n; i++){
            if (isPrime(i)){
                count_prime++;
            }
        }
        return count_prime;
    }
    public static boolean isPrime(int n){
        if (n <= 1){
            return false;
        }
        for (int i = 2; i * i <= n; i++){
            if (n % i == 0){
                return false;
            }
        }
        return true;
    }
    // Optimized - Sieve of Eratosthenes
    public static int prime_sieve(int n){
        int count_prime = 0;
        int[] ans = new int[n];
        ans[0] = ans[1] = 1; // converting index 0 and 1 as non prime
        for (int i = 2; i * i <= ans.length; i++){ //using i^2 to optimize the loop as ahed of i^2 all multiples are already marked.
            if (ans[i] == 0){ // i is prime
                for (int j = 2; i*j < ans.length; j++){ // marking all multiples of i as non prime
                    ans [i*j] = 1;
                }
            }
        }
        for (int i = 0; i < n; i++){
            if (ans[i] == 0){
                count_prime++;
            }
        }
        return count_prime;
    }
}