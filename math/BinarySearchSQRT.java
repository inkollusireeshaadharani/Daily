package math;
public class BinarySearchSQRT {
    public static void main(String[] args) {
        int n = 40;
        int p = 3;

        System.out.printf("%.3f", sqrt(n, p));
    }

    // Time: O(log(n))
    static double sqrt(int n, int p) {
        int s = 0;
        int e = n;

        double root = 0.0;

        while (s <= e) {
            int m = s + (e - s) / 2;

            if (m * m == n) {
                return m;
            }

            if (m * m > n) {
                e = m - 1;
            } else {
                s = m + 1;
                root = m;
                //updating the root only if the mid square is less than number
            }
        }
        
        double incr = 0.1;
        //p represents precision
        //number of decimal places
        //for p=1 incr=0.1 p=2 incr=0.01 p=3 incr=0.001
        //as long as sq(root) <=40 we increment the root by 0.1 0.2 0.3 etc
        //then by 0.01 0.02 0.03 etc
        for (int i = 0; i < p; i++) {
            while (root * root <= n) {
                root += incr;
            }
            //go back
            root -= incr;
            incr /= 10;
        }

        return root;
    }
}