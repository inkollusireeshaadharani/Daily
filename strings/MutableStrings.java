package strings;

class MutableStrings {

	public static void main(String[] args) {
		StringBuilder sb=new StringBuilder();
		for (int i = 0; i < 26; i++) {
			char ch=(char)('a'+i);
			sb.append(ch);
		}
		System.out.println(sb);
		
		sb.deleteCharAt(0);
		System.out.println(sb.toString());
		sb.reverse();
		System.out.println(sb.toString());
		
	
	}

}


/*
 * StringBuilder sb=new StringBuilder();
		for (int i = 0; i < 26; i++) {
			char ch=(char)('a'+i);
			sb.append(ch);
		}
	System.out.println(sb);
	
 * sb.toString() is not required cuz its called internally
 * indexOf
 * insert
 * lastIndex
 * replace
 * reverse
 * 
 * 
 */
