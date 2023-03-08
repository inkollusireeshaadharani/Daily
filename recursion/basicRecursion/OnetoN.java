package recursion.basicRecursion;

class OnetoN {
	public static void display(int n) {
		if(n==1) {
			System.out.println(n);
			return;
		}
		display(n-1);
		System.out.println(n);
	}
	public static void main(String[] args) {
		display(5);
	}

}
