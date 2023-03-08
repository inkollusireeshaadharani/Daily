package recursion.subsetProblems;

import java.util.ArrayList;

class PrintAscii {
	


	public static void main(String[] args) {
		char ch='a';
		System.out.println(ch + 0);
		System.out.println((char)(ch + 0));
		subseqAscii("", "abc");
		System.out.println(subseq("", "abc"));
	}

	static void subseqAscii(String p,String up) {
		if(up.isEmpty()) {
			System.out.println(p);
			return;
		}
		char ch=up.charAt(0);
		subseqAscii(p + ch, up.substring(1));//left
		subseqAscii(p, up.substring(1));//right
		subseqAscii(p +(ch+0),up.substring(1));//middle
												//-ascii value instead of letter is concatenated
		
	}
	
static ArrayList<String> subseq(String p, String up){
		
		if(up.isEmpty()) {
			ArrayList<String> al=new ArrayList<>();
			al.add(p);
			return al;
			//in the base condition return the answer at base condition
		}
		
		char ch=up.charAt(0);
		ArrayList<String> first=subseq(p+ch, up.substring(1));
		ArrayList<String> second=subseq(p, up.substring(1));
		ArrayList<String> third=subseq(p+(ch+0), up.substring(1));
		
		first.addAll(second);
		first.addAll(third);
		return first; 
	}
	
}
