package backtracking.basics;

class MazeWithObstacle {
	
	static void pathRestrictions(String p,int r,int c){
		if(r==1&&c==1) {
			return;
		}
		if(r==2&&c==2) {
			System.out.println(p);
			return;
		}
		if(r<2) {
			pathRestrictions(p+"D", r+1, c);
		}
		if(c<2) {
			pathRestrictions(p+"R", r, c+1);
		}
	}
	
	static void pathRes(String p,boolean[][] maze,int r,int c){
//		if(maze[r][c]==false) {
//			return;
//		}
		if(!maze[r][c]) {
			return;
		}

		if(r==maze.length-1&&c==maze[0].length-1) {
			System.out.println(p);
			return;
		}
		if(r<maze.length-1) {
			pathRes(p+"D",maze, r+1, c);
		}
		if(c<maze[0].length-1) {
			pathRes(p+"R", maze,r, c+1);
		}
	}
	
	
	public static void main(String[] args) {
		boolean[][] board={
			{true,true,true},
			{true,false,true},
			{true,true,true}
		};
		
		pathRes("", board,0, 0);
	}
}
