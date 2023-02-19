package strings;

import java.util.Arrays;

class Methods {

	public static void main(String[] args) {
		String name="Dharani Inkollu";
		System.out.println(name.toCharArray());
		System.out.println(Arrays.toString(name.toCharArray()));
		name=name.toLowerCase();
		int n=name.indexOf('i');
		n=name.lastIndexOf('i');
		name="          dharani         ".strip();
		n=n+1;
		String name2="dharani again";
		System.out.println(Arrays.toString(name2.split(" ")));
		palindrome("abccba");
	}
	
	static void palindrome(String s) {
		int start=0;
		int end=s.length()-1;
		if(s.length()==0) {
			System.out.println("Invalid");
		}
		
		while(start<end) {
			if(s.charAt(start)==s.charAt(end)) {
				start++;
				end--;
			}
			else {
				break;
			}
		}
		
		if(start>=end) {
			System.out.println("Yes");
		}
		else {
			System.out.println("no");
		}
	}
	
	
	//array like approach
	static boolean isPalindrome(String s) {
		int start=0;
		int end=s.length()-1;
		if(s.length()==0) {
			System.out.println("Invalid");
		}
		
		while(start<end) {
			if(s.charAt(start)==s.charAt(end)) {
				start++;
				end--;
			}
			else {
				return false;
			}
		}
		
		return true;
	}
	
	//string type approach
	//length of null is not 0
	static boolean isPalin(String str) {
		if(str==null||str.length()==0) {
			return true;
		}
		str=str.toLowerCase();
		for(int i=0;i<=str.length()/2;i++) {
			char start=str.charAt(i);
			char end=str.charAt(str.length()-1-i);
			if(start!=end)
				return false;
		}
		return true;
	}

}


/*
char[] chArr= {'a','b','c'};
System.out.println(chArr);

char arrays can be directly printed as strings

String name="Dharani Inkollu";
System.out.println(name.toCharArray());//Dharani Inkollu

System.out.println(Arrays.toString(name.toCharArray()));
//[D, h, a, r, a, n, i,  , I, n, k, o, l, l, u]
 
 toCharArray
 charAt
 compareTo
 indexOf
 split
 strip
 equals
*/