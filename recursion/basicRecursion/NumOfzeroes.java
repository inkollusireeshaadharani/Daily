package recursion.basicRecursion;

class NumOfzeroes {
	static int countz=0;
	static void count(int n) {
		if((n%10==0)&&(n/10!=0)) {
			countz++;
		}
		else if((n%10==0)&&(n/10==0)) {
			return;
		}
		count(n/10);
	}
	static int countZeroes(int n) {
		return helper(n,0);
	}
	//special pattern for passing a value to above calls
	//special example to return same value(same variable) to above function calls
	private static int helper(int n,int c) {
		if(n==0) {
			return c;//number is only returned at one place
		}
		int rem=n%10;
		if(rem==0) {
			return helper(n/10,c+1);		
		}
		return helper(n/10, c);
	}

	public static void main(String[] args) {
		count(30109);
		System.out.println(countz);
		System.out.println(countZeroes(12000));
	}

}
