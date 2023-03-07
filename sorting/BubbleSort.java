package sorting;

import java.util.Arrays;

public class BubbleSort {
	
	
	static void bubble(int[] arr) {
		//if in a pass we did not perform any swap it means the array is already sorted
        boolean swapped;
        // run the steps n-1 times
        for (int i = 0; i < arr.length; i++) {
            swapped = false;
            // for each step, max item will come at the last respective index
            for (int j = 1; j < arr.length - i; j++) {
                // swap if the item is smaller than the previous item
                if (arr[j] < arr[j-1]) {
                    // swap
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    swapped = true;
                }
            }
            //if in a pass we did not perform any swap....the array is already sorted
            // if you did not swap for a particular value of i, it means the array is sorted hence stop the program
            if (!swapped) { // !false = true
                break;
            }
        }
    }
	
	//my own
	static int[] bubbleSort(int[] arr) {
		int length=arr.length;
		for(int i=0;i<length;i++) {
			//length-i since we dont want to check the already in place ones
			//length-i-1 since we have to go until last but one and swap it
			//we dont need the last one
			//and also it throws index out of bounds exception
			for(int j=0;j<length-i-1;j++) {
				if(arr[j]>arr[j+1]) {
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		return arr;
	}
	
	 public static void main(String[] args) {
	        int[] arr = {5, 3, 4, 1, 2};
	        bubble(arr);
	        System.out.println(Arrays.toString(arr));
	    }

}
