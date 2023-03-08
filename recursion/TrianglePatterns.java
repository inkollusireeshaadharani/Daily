package recursion;
import java.util.Arrays;

public class TrianglePatterns {
    public static void main(String[] args) {
        //triangle2(4, 0);
        int[] arr = {1, 4, 3, 5, 4, 5, 7};
        //bubble(arr, arr.length-1, 0);
        //System.out.println(Arrays.toString(arr));
        selection(arr, arr.length, 0,0);
        System.out.println(Arrays.toString(arr));
    }
    
    
    
    static void bubble(int[] arr, int passLength, int index) {
        if (passLength == 0) {
            return;
        }
        
        //we dont have to check last index and indices start from 0
        //generally indices go from 0 to N-1
        //here we dont want last index so N-2 is the last index
        //passLength value is N-1
        // therefore <N-1
        if (index < passLength) {
            if (arr[index] > arr[index+1]) {
                // swap
                int temp = arr[index];
                arr[index] = arr[index+1];
                arr[index+1] = temp;
            }

            bubble(arr, passLength, index+1);
        } else {
            bubble(arr, passLength-1, 0);
        }
    }

    
    //max is the index of max element
    static void selection(int[] arr, int currLen, int index, int maxIndex) {
        if (currLen == 0) {
            return;
        }
        
        //traverse all the indices even the last one and update the max
        //if current index element is greater than max index element update max=index
        if (index < currLen) {
            if (arr[index] > arr[maxIndex]) {
                selection(arr, currLen, index+1, index);
            } else {
                selection(arr, currLen, index+1, maxIndex);
            }
        } 
        // otherwise if we reach end of row......we found our max 
        //as we reached out of array swap it with length-1 element
        //after swapping go to the next pass and length under consideration is reduced by 1
        else {
            int temp = arr[maxIndex];
            arr[maxIndex] = arr[currLen-1];
            arr[currLen-1] = temp;
            selection(arr, currLen-1, 0, 0);
        }
    }


    static void triangle2(int r, int c) {
        if (r == 0) {
            return;
        }
        if (c < r) {
            triangle2(r, c+1);
            System.out.print("*");
        } else {
            triangle2(r-1, 0);
            System.out.println();
        }
    }

    static void triangle1(int r, int c) {
        if (r == 0) {
            return;
        }
        if (c < r) {
            System.out.print("*");
            triangle1(r, c+1);
        } else {
            System.out.println();
            triangle1(r-1, 0);
        }
    }


    

}