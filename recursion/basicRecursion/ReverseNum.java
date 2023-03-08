package recursion.basicRecursion;

class ReverseNum {
	static int sum=0;
	public static String reverse(int n) {
		if(n==0) {
			return "";
		}
		return ""+n%10+reverse(n/10);
	}
	
	public static void rev(int n) {
		
		
		if(n==0) {
			return;
		}
		sum=sum*10+n%10;//sum calculated for rev(5) is used for rev(4) thefo its mulplied by 10
		
		rev(n/10);
	}
	
public static int reve(int n,int ans) {
		
		if(n==0)
			return ans;
		return reve(n/10,10*ans+n%10);
	}

	public static void main(String[] args) {
		rev(123);
		System.out.println(sum);
		System.out.println(reverse(12345));
		sum=0;
		rev(4567);
		System.out.println(sum);
		System.out.println(reve(12345,0));
	}

}


//1234
//
//4*10+3
//43*10+2
//432*10+1

//123
//300+20+1



