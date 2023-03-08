package recursion.subsetProblems;

class SkipApple {
	
	static String skipApple(String up) {
		if(up.isEmpty()) {
			return "";
		}
		
		if(up.startsWith("apple")) {
			return skipApple(up.substring(5));//check from next character
		}
		else {
			return up.charAt(0) + skipApple(up.substring(1));//check from next character
		}
	}
	

	public static void main(String[] args) {
		System.out.println(skipApple("sysapplebroapple"));

	}

}
