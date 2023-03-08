package recursion.subsetProblems;

import java.util.ArrayList;


class ArrLisOfStr {
	
	static ArrayList<String> subseq(String p, String up){
		
		if(up.isEmpty()) {
			ArrayList<String> al=new ArrayList<>();
			al.add(p);
			return al;
			//in the base condition return the answer at base condition
		}
		
		char ch=up.charAt(0);
		ArrayList<String> left=subseq(p+ch, up.substring(1));
		ArrayList<String> right=subseq(p, up.substring(1));
		
		left.addAll(right);
		return left; 
	}

	public static void main(String[] args) {
		System.out.println(subseq("", "abc"));

	}

}
