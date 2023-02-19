package arrays;
import java.util.Arrays;

class SwapArrayElements {
	public static void main(String[] args) {
		int[] arr= {1,3,23,9,18};
		swap(arr,1,3);
		System.out.println(Arrays.toString(arr));
		int[] arr2={1,3,23,9,18,34};
		reverse(arr2);
		System.out.println(Arrays.toString(arr2));
	}
	
	static void swap(int[] arr,int index1,int index2) {
		int temp=arr[index1];
		arr[index1]=arr[index2];
		arr[index2]=temp;
		//changed permanently
		//passed by value of reference
	}
	
	//	can also reverse an array using it
	//known as  two pointer method
	static void reverse(int[] arr) {
		//swap start and end
		//if start>end stop
		//increment start and decrement end for each iteration
		int start=0;
		int end=arr.length-1;
		
		while(start<end) {
			swap(arr, start, end);
			start++;
			end--;
		}
		
		
	}
}
