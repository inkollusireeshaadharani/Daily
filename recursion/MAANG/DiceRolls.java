package recursion.MAANG;

import java.util.ArrayList;

/*
 * number of times dice needs to be rolled to achieve 4, etc.
 */

class DiceRolls {
	
	static void dice(String p,int target) {
		if(target==0) {
			System.out.println(p);
			return;
		}
		
		for(int i=1;i<=6 && i <= target;i++) {
			dice(p+i, target-i);
		}
	}
	
	static void diceFace(String p,int target,int face) {//when the number of faces of the die is 8
		if(target==0) {
			System.out.println(p);
			return;
		}
		
		for(int i=1;i<=face && i <= target;i++) {
			diceFace(p+i, target-i,face);
		}
	}
	
	static ArrayList<String> diceList(String p,int target) {
		if(target==0) {
			ArrayList<String> list=new ArrayList<>();
			list.add(p);
			return list;
		}
		
		ArrayList<String> list=new ArrayList<>();
		
		for(int i=1;i<=6 && i <= target;i++) {
			list.addAll(diceList(p+i, target-i));
		}
		return list;
	}

	public static void main(String[] args) {
		dice("", 4);
		System.out.println(diceList("", 4));
	}

}
