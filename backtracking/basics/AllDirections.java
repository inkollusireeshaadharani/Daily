package backtracking.basics;

class AllDirections {
	
	static void allPath(String p,boolean[][] maze,int r,int c){
		if(r==maze.length-1&&c==maze[0].length-1) {
			System.out.println(p);
			return;
		}
		//below approach leads to infinite loop
		if(!maze[r][c]) {
			return;
		}


		if(r<maze.length-1) {//down
			allPath(p+"D",maze, r+1, c);
		}
		if(c<maze[0].length-1) {//right
			allPath(p+"R", maze,r, c+1);
		}
		if(r>0) {//up
			allPath(p+"U", maze,r-1, c);
		}
		if(c>0) {//left
			allPath(p+"L", maze,r, c-1);
		}
	}
	
	
	static void allPathBackTrack(String p,boolean[][] maze,int r,int c){
		if(r==maze.length-1&&c==maze[0].length-1) {
			System.out.println(p);
			return;
		}
		
		if(!maze[r][c]) {
			return;
		}//should come after the above condition
		
		//i am considering this block in my path
		
		maze[r][c]=false;
		

		if(r<maze.length-1) {//down
			allPathBackTrack(p+"D",maze, r+1, c);
		}
		if(c<maze[0].length-1) {//right
			allPathBackTrack(p+"R", maze,r, c+1);
		}
		if(r>0) {//up
			allPathBackTrack(p+"U", maze,r-1, c);
		}
		if(c>0) {//left
			allPathBackTrack(p+"L", maze,r, c-1);
		}
		
		//this line is where the function will be over
	//so, before the function gets removed, also remove the changes that were made by that function
		maze[r][c]=true;
	}
	
	
	

	public static void main(String[] args) {
		boolean[][] board={
				{true,true,true},
				{true,true,true},
				{true,true,true}
			};
			
			allPathBackTrack("", board,0, 0);
	}

}
