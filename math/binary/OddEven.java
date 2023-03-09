package math.binary;
public class OddEven {

    public static void main(String[] args) {
	    int n = 369;
        System.out.println(isOdd(n));
    }

    private static boolean isOdd(int n) {
        return (n & 1) == 1;
    }
}
