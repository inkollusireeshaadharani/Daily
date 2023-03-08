package recursion.subsetProblems;

class SkipApp {
	
	/*
	 * skip app but don't skip apple
	 */
	
	static String skipApp(String up) {
		if(up.isEmpty()) {
			return "";
		}
		
		if(up.startsWith("app") && !up.startsWith("apple")) {
			return skipApp(up.substring(3));//check from next character
		}
		else {
			return up.charAt(0) + skipApp(up.substring(1));//check from next character
		}
	}

	public static void main(String[] args) {
		System.out.println(skipApp("sysappbroapple"));
	}

}
