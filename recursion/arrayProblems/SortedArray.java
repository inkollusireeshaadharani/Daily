package recursion.arrayProblems;
/*
 * Given an array find out whether it is sorted or not using recursion
 */
class SortedArray {
	static boolean sorted(int[] arr, int index) {
		//base condition
		if(index==arr.length-1) {
			return true;
		}
		
		return arr[index]<arr[index+1] && sorted(arr, index+1);
	}
	
	//array  is being changed.......there is no pass by reference in java
	//but pass by value of the reference
	//the arr in every function call is pointing to the same object....the object is same....
	//the reference variables are changing
	

	public static void main(String[] args) {
		int[] arr= {1,2,3,4,5,6,0};
		System.out.println(sorted(arr, 0));
		//check passing and returning arrays
		//check out the arrays video
	}

}
