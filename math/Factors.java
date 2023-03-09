package math;
import java.util.ArrayList;

public class Factors {
    public static void main(String[] args) {
    	System.out.println("meth 1");
    	factors1(20);
    	System.out.println("\nmeth 2");
    	factors2(20);
    	System.out.println("\nmeth 3");
        factors3(20);
    }

    // O(n)
    static void factors1(int n) {
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                System.out.print(i + " ");
            }
        }
    }

    // O(sqrt(n))
    static void factors2(int n) {
        for (int i = 1; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
            	//if smtg like 6*6, 6 will be printed twice
            	//so print only once
                if (n/i == i) {
                    System.out.print(i + " ");
                }
                //20 --> 4*5 print 4 and 20/4 => 5
                else {
                    System.out.print(i + " " + n/i + " ");
                }
            }
        }
    }

    // both time and space will be O(sqrt(n))
    //storing the n/i values in a separate list for maintaining order
    //only n/i values so O(sqrt(n)) space
    static void factors3(int n) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 1; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                if (n/i == i) {
                    System.out.print(i + " ");
                }else {
                    System.out.print(i + " ");
                    list.add(n/i);
                }
            }
        }
        //stored in desc like 20 10 5
        //so print in reverse 
        for (int i = list.size() - 1; i >= 0; i--) {
            System.out.print(list.get(i) + " ");
        }
    }

}