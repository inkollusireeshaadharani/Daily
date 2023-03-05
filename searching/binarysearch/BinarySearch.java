package searching.binarysearch;

public class BinarySearch {

    public static void main(String[] args) {
        int[] arr = {-18, -12, -4, 0, 2, 3, 4, 15, 16, 18, 22, 45, 89};
        int target = 22;
        int ans = binarySearch(arr, target);
        System.out.println(ans);
        int ans1 = binarySearch(arr, 1);
        System.out.println(ans1);
    }

    // return the index
    // return -1 if it does not exist
    static int binarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while(start <= end) {
            // find the middle element
            //int mid = (start + end) / 2; 
        	// might be possible that (start + end) exceeds the range of int in java
        	
            int mid = start + (end - start) / 2;

            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                // ans found
                return mid;
            }
        }
        return -1;
    }
    
    //my own
    public static int binSearch(int[] arr,int target) {
    	int s=0;
    	int e=arr.length-1;
    	int m=(s+e)/2;
    	
    	while(s<=e) {
    		if(target>arr[m]) {
    			s=m+1;
    		}
    		else if(target<arr[m]) {
    			e=m-1;
    		}
    		else {
    			
    			return m;
    		}
    		m=(s+e)/2;
    	}
    	return -1;
    }   
    
}