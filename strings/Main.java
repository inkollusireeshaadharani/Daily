package strings;

class Main {

	public static void main(String[] args) {
		String name="Dharani";
		System.out.println(name);
		
		String a="smtg";
		String b="smtg";
		
		System.out.println(a==b);
		System.out.println(a.equals(b));
		
		String al=new String("Dharani");
		String bl=new String("Dharani");
		
		System.out.println(al==bl);
		System.out.println(al.equals(bl));

		System.out.println(name.charAt(0));
		
		float an=453.1264f;
		System.out.printf("Formatted number is %.2f\n",an);
		System.out.println(Math.PI);
		System.out.printf("Formatted Pi is %.3f\n",Math.PI);
		System.out.printf("hello i am %s\n","dharani");
	}

}


/*
 * Theory goes here
 * -------------------------------
 * 
 * String is the most commonly used class in the Java Class Library
 * 
 * String name="Dharani";
 * <datatype> <refvar>=<obj>;
 * 
 * String a="DSI"
 * String b="DSI"
 * 
 * are a and b pointing to the same "DSI"?
 * 
 * Two concepts:
 * 1. String Pool
 * 2. Immutability
 * 
 * All strings are stored in a string pool
 * It's a separate memory structure inside the heap.
 * primitives are stored in the stack 
 * Why can't I put the string normally inside the heap without the string pool?
 * For the sake of optimization
 * 2 or more string refs can point to the same literal and hence the memory is saved   
 * It is like arrays but in arrays we observe this only during parameter passing 
 * And also when one array is copied into another array 
 * 
 * But here in strings the object remains same 
 * In arrays if 2 different array references are initialised to say [1,3,5] individually 
 * they do not point to the same object 
 * but for strings,
 * if they are initialised with the same string then they point to the same object 
 * in arrays the copy of the array is manually passed 
 * here it is made to automatically point to the string literals 
 * 
 *  
 *  In strings the strings are immutable  
 *  This is a property to improve the security of the application
 *  If strings are mutable it affects the security  
 *  It can be problematic if one refvar is modified as the other refvars are also updated  
 *  Therefore when a string is modified a new object is created and it has to be stored 
 *  Or override whatever string is existing in the original reference variable 
 *  Which means you should have the original reference variable on the left hand side  
 *  And perform all the operations on the right hand side  
 *  You cannot directly perform the operations without the left hand side 
 *  Here we are not modifying whatever is present on the right hand side  
 *  We are creating an entirely new object and storing it into the same reference variable 
 *  The previous object is still present in the string pool  
 *  What happens to it then  
 *  If it's not referenced by any reference variable,
 *  it's gonna be collected by the garbage collector 
 *  Imagine a scenario where there are several person name reference variables  
 *  And all these reference variables are pointing to the same name  
 *  Because all the persons have the same name  
 *  Imagine that a person decides to change his or her name  
 *  If one name is changed all the other people's names are also changed  
 *  This is a serious security issue and hence strings are made immutable  
 *  Instead of making them immutable just make strings like regular objects  
 *  This is a bad thing to do because strings are used a lot in Java  
 *  And there is a lot of repetition and wastage of memory 
 *  to avoid this we use the concept of string pool 
 *  
 *  
 *  -----------------------------------------
 *  int[] arr= {1,2,3};
	int[] arr2= {1,2,3};
	System.out.println(arr);
	System.out.println(arr2);
	int[] arr3=arr;
	System.out.println(arr3);
	
	o/p Dharani
		[I@379619aa
		[I@cac736f
		[I@379619aa
 * -------------------------------------------
 * 
 * 
 * How to create different string objects of same value?
 * By explicitly specifying to create two different objects
 * By using new keyword
 * 
 * String a=new String("Dharani");
 * String b=new String("Dharani");
 * Both are different objects
 * 
 * Outside the pool & inside the heap
 * 
 * 
 * 
 * 
 * 
 * Comparison of Strings
 * -------------------------------------------
 * 
 * use the == operator to verify whether 2 string refvars are pointing to the same object
 * use the str1.equals(str2) for checking only the value
 * 
 *  String a="smtg";
	String b="smtg";
	System.out.println(a==b);//true
	System.out.println(a.equals(b));//true
  
 * String al=new String("Dharani");
   String bl=new String("Dharani");
   System.out.println(al==bl);//false
   System.out.println(al.equals(bl));//true
 * 
 * ---------------------------------------------------------------------------------------
 * getting a character -- using charAt(index)
 * 
 * pretty printing
 * -----------------------
 * (formatting)
 * 
 * float a=453.1234f;
 * System.out.printf("Formatted number is %.2f",a);//also performs rounding off
 * System.out.println(Math.PI);
 * System.out.printf("hello i am %s\n","dharani");
 * 
 * search for other placeholders as well
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 */







