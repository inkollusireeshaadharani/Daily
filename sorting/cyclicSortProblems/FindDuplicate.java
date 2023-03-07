package sorting.cyclicSortProblems;

// https://leetcode.com/problems/find-the-duplicate-number/
public class FindDuplicate {
    public int findDuplicate(int[] arr) {
        int i = 0;
        while (i < arr.length) {

        	//is element in right position
            if (arr[i] != i + 1) {
            	
                int correct = arr[i] - 1;
                
                //is there a different element at my position => yes => i will go there
                //=> swap
                
                if (arr[i] != arr[correct]) {
                    swap(arr, i , correct);
                } 
                //no => same element is there => i am the duplicate
                else {
                    return arr[i];
                }
            } else {
                i++;
            }
        }
        return -1;
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}