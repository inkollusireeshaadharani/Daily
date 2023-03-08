package backtracking;
class SudokuSolver {

	public static void main(String[] args) {
		int[][] board = new int[][]{
            {3, 0, 6, 5, 0, 8, 4, 0, 0},
            {5, 2, 0, 0, 0, 0, 0, 0, 0},
            {0, 8, 7, 0, 0, 0, 0, 3, 1},
            {0, 0, 3, 0, 1, 0, 0, 8, 0},
            {9, 0, 0, 8, 6, 3, 0, 0, 5},
            {0, 5, 0, 0, 9, 0, 6, 0, 0},
            {1, 3, 0, 0, 0, 0, 2, 5, 0},
            {0, 0, 0, 0, 0, 0, 0, 7, 4},
            {0, 0, 5, 2, 0, 6, 3, 0, 0}
	    };
	
	    if (solve(board)) {
	        display(board);
	        System.out.println();
	    } else {
	        System.out.println("Cannot solve");
	    }

	}
	
	//solve the sudoku and dont take any other parameter
	static boolean solve(int[][] board) {
		 // this is how we are not using the r,c in arguments
		
		int n=board.length;
		int row=-1;//row value of empty item inititally -1
		int col=-1;//col value of empty item inititally -1
		
		boolean emptyOver = true;
		
		//for every element
		for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (board[i][j] == 0) {//found an empty item
                    row = i;//assigning row and col of empty item
                    col = j;
                    emptyOver = false; // empty places are left
                    break;//found one of the possible answers
                }
            }
            //after traversing entire row
            // if you found some empty element in row, then break
            if (emptyOver == false) {
                break;
            }
        }
		
		if (emptyOver == true) {
            return true;
            // soduko is solved
        }
		
		
		//put the number and if required backtrack
		for (int number = 1; number <= 9; number++) {
            if (isSafe(board, row, col, number)) {
                board[row][col] = number;
                if (solve(board)) {
                    // found the answer
                	//display(board);
                    return true;
                } else {
                    // backtrack
                    board[row][col] = 0;
                }
            }
        }
		return false;//sudoku cant be solved
		
	}
	
	private static void display(int[][] board) {
        for(int[] row : board) {
            for(int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
	

	//can i put this 'num' at the 'row' and 'col' of the 'board'
	static boolean isSafe(int[][] board, int row, int col, int num) {
		//check the row
		for (int i = 0; i < board.length; i++) {
			//check if the number is in the row or not
			if(board[row][i]==num)
				return false;
		}
		
		//check the col
		for (int[] nums : board) {
            // check if the number is in the col
            if (nums[col] == num) {
                return false;//let col=3 --> checking with col 3 of each row
            }
        }
		
		int sqrt=(int)(Math.sqrt(board.length));//if board length=9 sqrt=3
		int rowstart=row-row%sqrt;
		int colstart=col-col%sqrt;
			
		for(int r=rowstart;r<rowstart+sqrt;r++) {
			for(int c=colstart;c<colstart+sqrt;c++) {
				if(board[r][c]==num)
					return false;
			}
		}
		
		return true;
			
	}
}
