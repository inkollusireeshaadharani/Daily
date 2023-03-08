package recursion.basicRecursion;

class IterativeFactorial {
	public static double factorial(int n) {	//for simple numbers use int
											//for medium numbers use long
											//for large numbers use double
		double fact=1;                      //hence fact is double
		for(int u=n;u>=1;u--) {
			fact=fact*u;
		}
		return fact;
	}
	
	public static void main(String[] args) {
		System.out.print(factorial(145));
	}

}
