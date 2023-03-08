package recursion.basicRecursion;

class IterativeFibonacci {
	//we are not printing the series
	//we return the fibo number
	public static int fibonacci(int n) {
		int f1=0,f2=1;
		int fibo=0;
		if(n==1) {
			return 1;
		}
		for(int u=2;u<=n;u++) {
			fibo=f1+f2;
			f1=f2;
			f2=fibo;
		}
		return fibo;
	}

	public static void main(String[] args) {
		int n=5;
		for(int i=0;i<=n;i++) {
			System.out.println(fibonacci(i));
		}

	}

}
