package backtracking;
class NKnights {

	public static void main(String[] args) {
		int n=4;
		boolean[][] board=new boolean[n][n];
		
		knightPlace(board, 0, 0, n);
	}
	
	static void knightPlace(boolean[][] board,int row,int col,int knights) {
		if(knights==0) {
			display(board);
			System.out.println();
			return;
		}
		//if going beyond the last cell
		if(row == board.length-1 && col==board.length) {
			return;
		}
		
		
		//go to next row and start at the first column
		if(col==board.length) {
			knightPlace(board,row+1,0,knights);
			return;//return statements are important
		}
		
		if(isSafe(board,row,col)) {
			board[row][col]=true;
			knightPlace(board,row,col+1,knights-1);
			board[row][col]=false;//backtrack
		}
		knightPlace(board, row, col+1, knights);//else condition
		//if its not safe go to next column
		
		
	}
	
	
	private static boolean isSafe(boolean[][]board,int row,int col) {
		
			if(isValid(board, row-2, col-1) && board[row-2][col-1]) {
				//making sure we are not going out of bounds
				return false;
			}
			if(isValid(board, row-2, col+1) && board[row-2][col+1]) {
				return false;
			}
			if(isValid(board, row-1, col-2) && board[row-1][col-2]) {
				return false;
			}
			if(isValid(board, row-1, col+2) && board[row-1][col+2]) {
				return false;
			}
		
		return true;
	}
	
	
	private static boolean isValid(boolean[][]board,int row,int col) {
		if(row>=0 && row < board.length && col>=0 && col<board.length) {
			return true;
		}
		return false;
	}
	
	private static void display(boolean[][]board) {
		for (boolean[] row:board) {
			for (boolean element:row) {
				if(element) {
					System.out.print("K ");
				}
				else {
					System.out.print("O ");
				}
			}
			System.out.println();
		}
	}
	
	
}
