package recursion.subsetProblems;

class RemoveAllA {
	
	static String removeA(String inp,int index,String res) {
		if(index==inp.length()) {
			return res;
		}
		if(inp.charAt(index)!='a') {
			res=res+inp.charAt(index);
		}
		
		return removeA(inp, index+1, res);
	}
	
	static String removeCh(String inp,int index) {
		if(index==inp.length()) {
			return "";
		}
		if(inp.charAt(index)!='a') {
			return inp.charAt(index)+removeCh(inp, index+1);
		}
		
		return removeCh(inp, index+1);
	}

	static String removeA2(String inp,int index) {
		
		String res="";
		
		if(index==inp.length()) {
			return res;
		}
		if(inp.charAt(index)!='a') {
			res=res+inp.charAt(index);
		}
		
		String ansFromBelow = removeA2(inp, index+1);
		
		return res+ansFromBelow;//*******************
	}
	
	static void skip(String p,String up) {
		//p processed, up unprocessed
		if(up.isEmpty()) {
			System.out.println(p);
			return;
		}
		
		char ch=up.charAt(0);
		
		if(ch=='a') {
			skip(p, up.substring(1));//passing the remaining string except first char at every call
		}
		else {
			skip(p+ch, up.substring(1));
		}
	}
	
	static String skip2(String up) {
		
		if(up.isEmpty()) {
			return "";
		}
		
		char ch=up.charAt(0);
		
		if(ch=='a') {
			return skip2(up.substring(1));
		}
		else {
			return ch + skip2(up.substring(1));
		}
	}

	
	
	public static void main(String[] args) {
		
//		System.out.println(removeA("baacadaafg", 0, ""));
//		System.out.println(removeA2("baacadaafg", 0));
//		skip("", "aadfgasaas");
		System.out.println(removeCh("baacadaafg", 0));
	}

}
