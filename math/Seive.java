package math;
public class Seive {
    public static void main(String[] args) {
        int n = 40;
        boolean[] primes = new boolean[n+1];//to include 40
        sieve(n, primes);
    }
    
    
//    visit a number
    //check if it is prime if it was not marked previously as visited
    //find all the multiples of the number and mark as true
    //this way we wont visit it later if it is marked true
    //repeat this until sqrt(n) because all the non-primes are already marked true
    //by previous numbers
    //all the numbers with false are not visited because they are primes
    //we dont have to check if N%i==0 because if we reached this index
    //that means this is not a multiple of any previous number otherwise
    //would have been marked true
    //from the basic definition of a prime number and factor

    // false in array means number is prime
    //because by default boolean array elements have value false
    //so we are updating to true -- to mark it as visited
    static void sieve(int n, boolean[] primes) {
        for (int i = 2; i*i <= n; i++) {
            if (!primes[i]) {
            	//generating the multiples until N and marking them as true
            	//j+=i let i=3...we start from second multiple
            	//so j=i*2
            	//to go to next multiple just add i to j
                for (int j = i*2; j <= n; j+=i) {
                    primes[j] = true;
                }
            }
        }

        for (int i = 2; i <= n; i++) {
        	// false in array means number is prime
            if (!primes[i]) {
                System.out.print(i + " ");
            }
        }
    }
}