package recursion.basicRecursion;

class RecursiveFactorial {
	
	public static double factorial(int num) {//for simple numbers use int
											//for medium numbers use long
											//for large numbers use double
		if(num==1)
			return 1;
		else						
			return num*factorial(num-1);
	}

	public static void main(String[] args) {
		
		System.out.print(factorial(40));
	}

}
