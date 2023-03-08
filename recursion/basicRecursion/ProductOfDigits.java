package recursion.basicRecursion;

class ProductOfDigits {
	public static int productofd(int n) {
		
		if(n<=0) {
			return 1;
		}
		return (n%10)*productofd(n/10);
		 
}

	public static void main(String[] args) {
	
		System.out.println(productofd(1243));
	}
}
