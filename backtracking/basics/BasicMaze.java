package backtracking.basics;
import java.util.ArrayList;

class BasicMaze {
	//returning the number of different paths
	static int count(int r, int c) {
		if(r==1||c==1) {
			return 1;
		}
		int left=count(r-1, c);//going down
		int right =count(r, c-1);
		return left+right;
	}

	
	//printing the paths
	
	static void printPath(String p,int r,int c) {
		if(r==1 && c==1) {
			System.out.println(p);
			return;
		}
		if(r>1 && c>1) {
			printPath(p+"D", r-1, c);
			printPath(p+"R", r, c-1);
		}
		else if(r==1 && c>1) {
			printPath(p+"R", r, c-1);
		}
		else if(r>1 && c==1){
			printPath(p+"D", r-1, c);
		}
		
	}
	
	static void path(String p,int r,int c) {
		if(r==1 && c==1) {
			System.out.println(p);
			return;
		}
		//if r>1 c>1 both of the below conditions will execute
		//if if only one of these is true...only one will execute
		if(r>1) {
			path(p+"D", r-1, c);
		}
		if(c>1) {
			path(p+"R", r, c-1);
		}
		
	}
	
	static ArrayList<String> pathRet(String p,int r,int c) {
		if(r==1 && c==1) {
			ArrayList<String> list=new ArrayList<>();
			list.add(p);
			return list;
		}
		
		ArrayList<String> list=new ArrayList<>();
		
		if(r>1) {
			list.addAll(pathRet(p+"D", r-1, c));
		}
		if(c>1) {
			list.addAll(pathRet(p+"R", r, c-1));
		}
		return list;
	}
	
	
	
	
	
	
	public static void main(String[] args) {

		printPath("", 3, 3);
		
	}

}
