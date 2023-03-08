package backtracking.basics;
import java.util.ArrayList;

class DiagonalPathAlso {

	static ArrayList<String> pathRet(String p,int r,int c) {
		if(r==1 && c==1) {
			ArrayList<String> list=new ArrayList<>();
			list.add(p);
			return list;
		}
		
		ArrayList<String> list=new ArrayList<>();
		
		if(r>1 && c>1) {
			list.addAll(pathRet(p+"D", r-1, c-1));
		}
		
		if(r>1) {
			list.addAll(pathRet(p+"V", r-1, c));
		}
		if(c>1) {
			list.addAll(pathRet(p+"H", r, c-1));
		}
		return list;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(pathRet("", 3,3));
	}

}
