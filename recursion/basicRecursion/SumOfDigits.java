package recursion.basicRecursion;

class SumOfDigits {
	public static int sumofd(int n) {
		
		if(n<=0) {
			return 0;
		}
		return (n%10)+sumofd(n/10);
		 
	}
	
public static int numofd(int n,int count) {
		
		if(n==0) {
			return count;
		}
		return numofd(n/10, count+1);
		 
	}

	public static void main(String[] args) {
		
		System.out.println(sumofd(1243));
		System.out.println(numofd(1243,0));
	}

}
