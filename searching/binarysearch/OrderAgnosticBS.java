package searching.binarysearch;

public class OrderAgnosticBS {
	
	 public static void main(String[] args) {
//       int[] arr = {-18, -12, -4, 0, 2, 3, 4, 15, 16, 18, 22, 45, 89};
       int[] arr = {99, 80, 75, 22, 11, 10, 5, 2, -3};
       int target = 22;
       int ans = orderAgnosticBS(arr, target);
       System.out.println(ans);
   }

   static int orderAgnosticBS(int[] arr, int target) {
       int start = 0;
       int end = arr.length - 1;

       // find whether the array is sorted in ascending or descending
       //instead of using if else 
       boolean isAsc = arr[start] < arr[end];

       while(start <= end) {
           
           int mid = start + (end - start) / 2;

           
           //this is common for both asc and desc
           if (arr[mid] == target) {
               return mid;
           }

           if (isAsc) {
               if (target < arr[mid]) {
                   end = mid - 1;
               } 
               else {
                   start = mid + 1;
               }
           } 
           else {
               if (target > arr[mid]) {
                   end = mid - 1;
               } 
               else {
                   start = mid + 1;
               }
           }
       }
       return -1;
   }
	
	
	
	
	
	
	
	
	
	
	//myown
	
	static int binaryS(int[] arr, int target){
		
		int i=0;
		int j=1;
		
		boolean asc=false;
		
		while(arr[i]==arr[j] && j<=arr.length-1) {
			i++;
			j++;
		}
		
		if(arr[i]>arr[j]) {
			asc=true;
		}
		//instead of above just use arr[start]>arr[end]
		
		
		int start = 0;
        int end = arr.length - 1;
		
		if(asc) {
			while(start <= end) {
	            int mid = start + (end - start) / 2;

	            if (target < arr[mid]) {
	                end = mid - 1;
	            } 
	            else if (target > arr[mid]) {
	                start = mid + 1;
	            } 
	            else {
	               
	                return mid;
	            }
	        }
		}
		
		else {
			
			while(start <= end) {
	            int mid = start + (end - start) / 2;

	            if (target < arr[mid]) {
	            	start = mid + 1;
	            } 
	            else if (target > arr[mid]) {
	            	end = mid - 1;
	            } 
	            else {
	               
	                return mid;
	            }
	        }
			
		}
		
		
		
		return -1;
		
		
	}
}
