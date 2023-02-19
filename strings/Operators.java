package strings;

import java.util.ArrayList;
import java.util.Arrays;

class Operators {

	@SuppressWarnings("removal")
	public static void main(String[] args) {
		System.out.println('a'+'b');
		System.out.println("a"+"b");
		System.out.println('a'+3);
		System.out.println((char)('a'+3));
		System.out.println("a"+3);
		System.out.println("dharani"+new ArrayList<>());
		System.out.println("dharani"+new Integer(57));
		int[] arr=new int[5];
		System.out.println("dharani"+arr);
		System.out.println("dharani"+Arrays.toString(arr));
		System.out.println(new Integer(57)+""+new ArrayList<>());
	}

}

/*
 * System.out.println('a'+'b');            //195
 * System.out.println("a"+"b");           //ab
 * System.out.println('a'+3);             //100
 * System.out.println((char)('a'+3));        //d
 * characters with + produce sum of ASCII values
 * strings with + produce concatenated string
 * type casting of integers or ASCII values using (char) gives character
 * 
 * System.out.println("a"+3);                  //a3
 * 
 * int will be converted to Integer that will call toString()
 * same as "a"+"3"
 * 
 * System.out.println("dharani"+new ArrayList<>());      //dharani[]
 * remember that we can directly print a list unlike array
 * 
 * System.out.println("dharani"+new Integer(57));      //dharani57
 * int[] arr=new int[5];
   System.out.println("dharani"+arr);                   //dharani[I@cac736f
   
   prints the hash value for arr
   whenever an object is passed to println, toString() method of that class is called
      
 * System.out.println("dharani"+Arrays.toString(arr));//the toString() belongs to Arrays class
 * 
 * System.out.println(new Integer(57)+new ArrayList<>());
 * gives an error
 * + operator works only on primitives and if at least one of the objects is a string
 * 
 * System.out.println(new Integer(57)+""+new ArrayList<>());
 * works fine
 * 
 * operator overloading results in poor code
 * hence java does not support it
 * 
 * 
 * 
 * 
 */


