package recursion.basicRecursion;

class Palindrome {
	public static String reverse(int n) {
		if(n==0) {
			return "";
		}
		return ""+n%10+reverse(n/10);
	}

	static boolean palindrome(int n) {
		return n==Integer.parseInt(reverse(n));
	}
	
	public static void main(String[] args) {
//can also do it by comparing first and last digit etc		
			System.out.println(palindrome(1221));

	}

}
