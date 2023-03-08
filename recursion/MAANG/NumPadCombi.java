package recursion.MAANG;

import java.util.ArrayList;

class NumPadCombi {
	
	static void pad(String p,String up) {
		if(up.isEmpty()) {
			System.out.println(p);
			return;
		}
		
		int digit=up.charAt(0) - '0';//converts '2' to 2
		//let charAt(0)=1
		//ascii for 1 is 49
		//ascii for 0 is 48
		//therefore '1'- '0' = 1
		
		for(int i=(digit-1)*3;i<digit*3;i++) {
			char ch=(char)('a'+i);
			pad(p+ch, up.substring(1));
		}
	}
	
	
	
	static ArrayList<String> padList(String p,String up) {
		if(up.isEmpty()) {
			ArrayList<String> list=new ArrayList<>();
			list.add(p);
			return list;
		}
		
		int digit=up.charAt(0) - '0';
		
		ArrayList<String> list=new ArrayList<>();
		
		for(int i=(digit-1)*3;i<digit*3;i++) {
			char ch=(char)('a'+i);
			list.addAll(padList(p+ch, up.substring(1)));//addAll method***
		}
		return list;
	}

	public static void main(String[] args) {
		pad("", "12");
		System.out.println(padList("", "12"));
	}

}
