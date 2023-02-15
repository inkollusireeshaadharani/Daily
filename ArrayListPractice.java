import java.util.Arrays;

public class ArrayListPractice {
    //Array and ArrayList practice

    int[] arr=new int[5];

    //datatype arrayname=object 
    //stack ref => points object in heap
    //compile time -- runtime

    //memory is not allocated contiguously
    //memory is allocated randomly in heap

    //objects are in heap
    //heap objects are not continuous--may or may not be
    //Dynamic memory allocation
    //uses new keyword

    //can also be done in two steps
    //declaration and initialization

    //default value of reference variable is null
    //default values of integer array are zeroes

    String str=null;


    //Taking input for array
    //can be done using loop

    //printing contents of array can be done using
    //loop
    //for each loop
    //Arrays.toString(arr)

    //length of array is given by length variable

    public static void main(String args[]){
        int[] nums={3,4,5,6};
        System.out.println(nums);
        System.out.println(Arrays.toString(nums));
        change(nums);
        System.out.println(nums);
        System.out.println(Arrays.toString(nums));

        int[][] arr2={
            {1,2,3},
            {1,2,4},
            {1,2,5}
        };

        System.out.println(Arrays.toString(arr2));//doesnt work with 2d
    }

    //arrays are mutable in java

    static void change(int[] arr){
        System.out.println(arr);
        arr[0]=99;
        System.out.println(arr);

    }

    //two-D array

    // can create an array that looks like a matrix
    //in c or cpp 2-d array is also continuously allocated


	//but java does not support it
    
    
    




}
