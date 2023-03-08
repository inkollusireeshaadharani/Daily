package recursion.basicRecursion;
/* Given an integer num, return the number of steps to reduce it to zero
 * In one step, if the current number is even, you have to divide it by 2, otherwise subtract 1
 * from it.
 * 14->7
 * 7->6
 * 6->3
 * 3->2
 * 2->1
 * 1->0
 * so, 6 steps
 */



class CountSteps {
	public static int numberOfSteps(int num) {
		return helper(num,0);
	}
	private static int helper(int num,int steps) {
		if(num==0)
			return steps;
		if(num%2==0)
			return helper(num/2, steps+1);
		else {
			return helper(num-1, steps+1);
		}
	}
	public static void main(String[] args) {
		System.out.println(numberOfSteps(14));
	}

}
