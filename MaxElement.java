
class MaxElement {

	public static void main(String[] args) {
		int[] arr= {1,3,23,9,18};
		System.out.println(maxl(arr));
		System.out.println(maxRange(arr,1,3));
	}
	
	
	
	//max value in a range
	static int maxRange(int[] arr,int start,int end) {
		
		if(end<start) {//some times we may pass the wrong values like start =5 end =2
			return -1;
		}
		
		if(arr==null) {
			return -1;
		}
		
		int max=arr[start];
		for(int i=1;i<=end;i++) {
			if(arr[i]>max) {
				max=arr[i];
			}
		}
		return max;
	}
	//work on edge cases like array being null
	
	
	
	//imagine arr is not empty
		static int maxl(int[] arr) {
			
			if(arr.length==0) {
				return -1;//just like the null case
			}
			
			int max=arr[0];
			for(int i=1;i<arr.length;i++) {
				if(arr[i]>max) {
					max=arr[i];
				}
			}
			return max;
		}
}
