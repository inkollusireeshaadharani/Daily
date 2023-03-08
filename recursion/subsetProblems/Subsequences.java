package recursion.subsetProblems;


/*
 * Permutation and combination type problems
 * 
 * 
 * The pattern of taking some elements and ignoring some at each step from a set is called
 * subset(array) or subsequence(string) problem
 * 
 * Can solve these using both recursion and interation
 * 
 * -------Using Recursion-----------
 * 
 * let us consider a string "abc"
 * just like previous examples.....consider processed and unprocessed string
 * we have two options for every character of string acc to subset rule
 * 1. take it 
 * 2. ignore it
 * 
 * Step 1: p=" " 
 * 		   up="abc"
 * Step 2: a)   if 'a' is taken                           b)   if 'a' is ignored
 * 				p="a"										   p=" "
 * 				up="bc"										   up="bc"
 * 			(left subtree)									(right subtree)
 * Step 3: find (a),(b) for both a and b above.....this time for 'b'
 * Step 4: Similarly for 'c'
 * Step 5: We do this for strings until up=""
 * Step 6: The subsets are found....all the p's at the end are subsets and don't consider
 * 		   empty string
 * 
 * 
 * in function calls, we pass "processed+nextchar" for left subtree and only "processed" for right
 * DFS manner of execution in recursion tree
 */



class Subsequences {
	
	static void subseq(String p,String up) {
		if(up.isEmpty()) {
			System.out.println(p);
			return;
		}
		char ch=up.charAt(0);
		subseq(p + ch, up.substring(1));//left
		subseq(p, up.substring(1));//right
		
	}

	public static void main(String[] args) {
		subseq("", "abc");

	}

}
















