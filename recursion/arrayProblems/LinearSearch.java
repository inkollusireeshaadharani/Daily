package recursion.arrayProblems;

import java.util.ArrayList;

class LinearSearch {
	//math tables add multiply fast
	//can also do from back
	
	
	
	/*
	 * Problem 1
	 */
	
	
	static boolean find(int[] arr,int target, int index) {
		if(index==arr.length) {
			return false;
		}
		return arr[index] == target || find(arr, target, index + 1);
	}
	
	/*
	 * Problem 2
	 */
	
	//to return index
	
	static int find2(int[] arr,int target, int index) {
		if(index==arr.length) {
			return -1;
		}
		
		if(arr[index]==target) {
			return index;
		}
		else {
		return find2(arr, target, index + 1);
		}
	}
	
	/*
	 * Problem 3
	 */
	
	//to search from the end
	
	static int find3(int[] arr,int target, int index) {
		if(index==-1) {
			return -1;
		}
		
		if(arr[index]==target) {
			return index;
		}
		else {
		return find3(arr, target, index - 1);
		}
	}
	
	/*
	 * Problem 4
	 */
	
	/*
	 * things created in function body are for the function call only
	 * things passed as arguments are for all the function calls
	 */
	
	static ArrayList<Integer> list=new ArrayList<>();
	static void findAllIndex(int[] arr,int target, int index) {
		if(index==-1) {
			return ;
		}
		
		if(arr[index]==target) {
			list.add(index);
		}
		
		findAllIndex(arr, target, index - 1);
		
	}	
	
	/*
	 * Problem 5
	 */
	
	
	//returning an arraylist
	//given an array and target....return all the occurences/indices of target in an arraylist
	
	static ArrayList<Integer> findIndices(int[] arr, int target, int index, ArrayList<Integer> al){
		if(index==arr.length)
			return al;
		if(arr[index]==target) {
			al.add(index);
		}
		return findIndices(arr, target, index+1, al);
		
	}
	
	/*
	 * Problem 6
	 */
	
	
	
	//create list inside the function and merge answers from each call
	
	static ArrayList<Integer> findAllIndices(int[] arr,int target, int index){
		
		ArrayList<Integer> list=new ArrayList<>();
		if(index==arr.length)
			return list;
		
		//this will contain answer for that function call only
		if(arr[index]==target) {
			list.add(index);
		}
		
		ArrayList<Integer> ansFromBelowCalls=findAllIndices(arr, target, index+1);
		
		list.addAll(ansFromBelowCalls);
		
		return list;//last function call to execute this stmt is the first function call
	}
	
	//dont use the above approach as objects are created again and again
	
	
	
	
	public static void main(String[] args) {
		ArrayList<Integer> alist=new ArrayList<>();
		int[] arr= {1,2,3,4,5,6,6,0};
		
		/*
		 * Problem 1
		 */
		
		
		System.out.println(find(arr,7, 0));
		
		/*
		 * Problem 2
		 */
		
		System.out.println(find2(arr,6, 0));
		
		/*
		 * Problem 3
		 */
		
		System.out.println(find3(arr,6, arr.length-1));
		
		/*
		 * Problem 4
		 */
		
		findAllIndex(arr,6, arr.length-1);
		System.out.println(list);
		
		/*
		 * Problem 5
		 */
		
		System.out.println(findIndices(arr,6,0,alist));
		System.out.println(alist);//list gets modified
		
		/*
		 * Problem 6
		 */
		
		System.out.println(findAllIndices(arr, 6, 0));
	}

}






