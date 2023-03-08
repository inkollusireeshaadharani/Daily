package recursion.basicRecursion;

class NtoOne {

	public static void display(int n) {
		System.out.println(n);
		if(n==1)
			return;
		display(n-1);
	}
	
	public static void main(String[] args) {
		
		display(5);
	}

}
