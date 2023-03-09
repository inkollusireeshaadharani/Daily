package math.binary;
public class Power {
    public static void main(String[] args) {
        int base = 2;
        int power = 4;

        int ans = 1;

        while (power > 0) {
        	//to check the last digit is 1 or 0
        	//if 1 multiply
            if ((power & 1) == 1) {
                ans *= base;
            }

            base *= base;
            //get the next LSB
            power = power >> 1;
        }

        System.out.println(ans);
    }
}