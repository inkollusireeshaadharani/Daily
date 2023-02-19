package strings;


class Performance {

	public static void main(String[] args) {
		String series="";
		for (int i = 0; i < 26; i++) {
			char ch=(char)('a'+i);
			series=series+ch;
		}
		System.out.println(series);
	}
}

/*
 * Performance of String class
 * 
 * for (int i = 0; i < 26; i++) {
		char ch=(char)('a'+i);
		series=series+ch;
	}
		
 * every time, a new object is being created like "a", "ab" etc and are overridden
 * copying the old object and appending the new char
 * wastage of memory
 * time complexity is O(N2)
 * 1+2+3+4+.........+N   => O(N2)
 * 1 letter is copied + 2 are copied + 3 +............+N
 * imagine an inner loop for the process of copying
 * O(N2) bad for just appending a string
 * hence we need a datatype that is mutable
 * we use StringBuilder class
 * 
 * 
 * 
 */
 