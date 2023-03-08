package recursion.subsetProblems;

import java.util.*;

class IterSubseq {

	public static void main(String[] args) {
		int[] arr= {1,2,3};
		System.out.println(subset(arr));

	}

	static List<List<Integer>> subset(int[] arr){
		List<List<Integer>> outer=new ArrayList<>();
		outer.add(new ArrayList<>());//[[]]
		for(int num:arr) {
			int n=outer.size();
			for(int i=0;i<n;i++) {//for getting each element / list of outer
				List<Integer> newList=new ArrayList<>(outer.get(i));
				//create a copy of each element of outer
				newList.add(num);
				outer.add(newList);//update main list
			}
		}
		
		return outer;
	}
}


//time complexity O(N*2^N)
//N-- number of levels
//2^N-- number of subsets at each level
//space complexity--O(2^N*N)
//2^N-- number of subsets
//N-- number of elements in each subset