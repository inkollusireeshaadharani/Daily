package recursion.basicRecursion;

class RecursiveFibonacci {

	public static int fibonacci(int n) {
		if(n<2)
			return n;
		else {
			return fibonacci(n-1)+fibonacci(n-2);
		}
	}

	public static void main(String[] args) {
		int n=5;
		for(int i=1;i<=n;i++) {
			System.out.println(fibonacci(i));
		}

	}
	

}
