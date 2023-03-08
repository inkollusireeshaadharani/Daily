package recursion.subsetProblems;

import java.util.ArrayList;
import java.util.*;

class DupEleSubseq {
	static List<List<Integer>> subsetDuplicate(int[] arr){
		Arrays.sort(arr);
		List<List<Integer>> outer=new ArrayList<>();
		outer.add(new ArrayList<>());
		int startingIndex=0;
		int prev_end=0;
		for(int i=0;i<arr.length;i++) {
			startingIndex=0;
			//if prev_end is calculated here....then we would be looking at the updated list
			//skip this fr 1st iteration
			//this condition is executed only from the 2nd element
			if(i > 0 && arr[i] == arr[i-1]) {
				startingIndex=prev_end+1;
			}
			
			//the following steps are done at every step
			//for our current step, we are deciding where the previous elements ended
			
			prev_end=outer.size()-1;
			int n=outer.size();
			for(int j=startingIndex;j<n;j++) {
				List<Integer> internal=new ArrayList<>(outer.get(j));//create a copy of outer
				internal.add(arr[i]);
				outer.add(internal);//update main list
			}
		}
		
		return outer;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {2,1,2,2};
		System.out.println(subsetDuplicate(arr));

	}

}
