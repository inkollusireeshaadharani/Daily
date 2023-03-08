package backtracking.basics;
import java.util.Arrays;

class PrintPathInMatrix {

	static void allPathBackTrack(String p,boolean[][] maze,int r,int c,int[][] path,int step){
		if(r==maze.length-1&&c==maze[0].length-1) {
			path[r][c]=step;
			for(int[] arr:path) {
				System.out.println(Arrays.toString(arr));
			}
			
			System.out.println(p);
			return;
		}
		
		if(!maze[r][c]) {
			return;
		}
		
		maze[r][c]=false;
		path[r][c]=step;

		if(r<maze.length-1) {//down
			allPathBackTrack(p+"D",maze, r+1, c,path,step+1);
		}
		if(c<maze[0].length-1) {//right
			allPathBackTrack(p+"R", maze,r, c+1,path,step+1);
		}
		if(r>0) {//up
			allPathBackTrack(p+"U", maze,r-1, c,path,step+1);
		}
		if(c>0) {//left
			allPathBackTrack(p+"L", maze,r, c-1,path,step+1);
		}
		
		maze[r][c]=true;
		path[r][c]=0;
	}
	
	
	public static void main(String[] args) {
		
		boolean[][] board={
				{true,true,true},
				{true,true,true},
				{true,true,true}
			};
		int[][] path=new int[board.length][board[0].length];
			
			allPathBackTrack("", board,0, 0,path,1);
	}

}
