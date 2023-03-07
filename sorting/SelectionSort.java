package sorting;

import java.util.Arrays;

public class SelectionSort {
	
	
	static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            // find the max item in the remaining array and swap with correct index
            int last = arr.length - i - 1;
            int maxIndex = getMaxIndex(arr, 0, last);
            swap(arr, maxIndex, last);
        }
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

    static int getMaxIndex(int[] arr, int start, int end) {
        int max = start;
        for (int i = start; i <= end; i++) {
            if (arr[max] < arr[i]) {
                max = i;
            }
        }
        return max;
    }
	
	
	//myown
	public static void selection(int[] arr) {
		int n=arr.length;
		for(int i=0;i<n;i++) {
			int max=maximum(arr,n-1-i);
			int temp=arr[n-1-i];
			arr[n-1-i]=arr[max];
			arr[max]=temp;
		}
	}
	public static int maximum(int[] arr,int end) {
		int max=0;
		//the end could also be the max number
		for(int i=0;i<=end;i++) {
			if(arr[i]>arr[max]) {
				max=i;
			}
		}
		return max;
	}
	
	public static void main(String[] args) {
        int[] arr = {5, -3, -4, 1, 2};
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
