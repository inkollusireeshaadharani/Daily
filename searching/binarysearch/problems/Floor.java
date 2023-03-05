package searching.binarysearch.problems;

public class Floor {
	public static void main(String[] args) {
        int[] arr = {2, 3, 5, 9, 14, 16, 18};
        int target = 1;
        int ans = floor(arr, target);
        System.out.println(ans);
    }

    // return the index of greatest no <= target
    static int floor(int[] arr, int target) {

        // but what if the target is less than the least number in the array
    	//there is no number less than the target in the array
//        if ( target < arr[0]) {
//            return -1;
//        }
    	
    	//no need to write above code because automatically end=0-1=-1 in the end
    	
        int start = 0;
        int end = arr.length - 1;

        while(start <= end) {
            int mid = start + (end - start) / 2;

            if (target < arr[mid]) {
                end = mid - 1;//left
            } else if (target > arr[mid]) {
                start = mid + 1;//right
            } else {
                // ans found
                return mid;
            }
        }
        return end;
    }
}
