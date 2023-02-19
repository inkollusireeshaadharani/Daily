package arrays;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

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
    //arrays are mutable in java

    static void change(int[] arr){
        System.out.println(arr);
        arr[0]=99;
        System.out.println(arr);

    }

    public static void main(String args[]){

        try (Scanner sc = new Scanner(System.in)) {
			int xyz=sc.nextInt();
			System.out.println(xyz);
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
   
			//two-D array

			// can create an array that looks like a matrix
			//in c or cpp 2-d array is also continuously allocated


			//but java does not support it
			
			//int[][] arr3=new int[5][];
			//Variable size 2D array

			
			int[][] arrnew=new int[3][4];
			System.out.println(arrnew.length);//no of rows
			
			for(int row=0;row<arrnew.length;row++){
			    for(int col=0;col<arrnew[row].length;row++){//arrnew[row].length helps in identifying column length
			        arrnew[row][col]=sc.nextInt();
			    }
			}
			
			//2d array output
	        
			//1. just like taking input
	        //2. print  new line after every row
			
			 for(int row=0;row<arrnew.length;row++) {
		        	System.out.println(Arrays.toString(arrnew[row]));
		     }
			 
			 
			 //3. enhanced for loop for printing 2D array
			 
			 
			 for(int[] a:arrnew) {
				 System.out.println(Arrays.toString(a));
			 }
			 
			 //Dynamic arrays (Using arraylists)
			 
			 //no need to statically fix size
			 
			 //slower than array
			 
			 ArrayList<Integer> list=new ArrayList<>();//can pass initial capacity in constructor
			 
			 list.add(10);
			 System.out.println(list);//list obj internally calls toString()
			 
			 
			 System.out.println(list.contains(654));
			 list.set(0, 99);//update
			 list.remove(2);
			 
			 //to take input
			 
			 for(int i=0;i<5;i++) {
				 list.add(sc.nextInt());
			 }
			 
			 //to print
			 
			 //1. directly print the list
			 System.out.println(list);
			 
			 //2. element by index
			 for(int i=0;i<5;i++) {
				 System.out.println(list.get(i));//pass index here
				 //list[index] will not work
			 }
			 
			 //ArrayList internal working
			 //doubles the size when arraylist is half full etc.
			 
			 //multidimensional arraylist
			 
			 //al<al<int>>
			 
			 ArrayList<ArrayList<Integer>> list2=new ArrayList<>();
			 
			 //Initialize it as its going to be empty
			 
			 
			 //initialization
			 for (int i = 0; i < 3; i++) {
				list2.add(new ArrayList<>());
			 }
			 
			 //add elements
			 for (int i = 0; i < 3; i++) {
				for (int j = 0; j < 3; j++) {
					list2.get(i).add(sc.nextInt());
				}
			 }
			 
			 //to print
			 System.out.println(list2);
			 
		}//try ends
        
     

    }//main ends

  
}//class ends

