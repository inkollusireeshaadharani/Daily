package strings.patterns;

public class Practice {
	
	/*
	    *****
	    *****
	    *****
	    *****
	    *****
	 */
	
	static void pattern1(int n) {
		for(int row=1;row<=n;row++) {
			for(int col=1;col<=n;col++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	
	
//	  *
//    **
//    ***
//    ****
//    *****
	static void pattern2(int n) {
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	
	
//	  *****
//    ****
//    ***
//    **
//    *
	
	static void pattern3(int n) {
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=(n-i)+1;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	//can also use j--
	//int j=n;j>=i;j--
	
//	  1
//    1 2
//    1 2 3
//    1 2 3 4
//    1 2 3 4 5
	
	static void pattern4(int n) {
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}
	
	
//	  *
//    **
//    ***
//    ****
//    *****
//    ****
//    ***
//    **
//    *
	
	
//	*
//  **
//  ***
//  ****
//  *****
//  ******
//  ******
//  *****
//  ****
//  ***
//  **
//  *
	
	
	//when n is the total number of rows
	static void patternmisun(int n) {
		for(int i=1;i<=n/2;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		int temp=0;
		if(n%2==0) {
			temp=n/2;
		}
		else {
			temp=n/2+1;
		}
		
		for(int i=1;i<=temp;i++) {
			for(int j=1;j<=temp-i+1;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	
	
	
//	*
//  **
//  ***
//  ****
//  *****
//  ****
//  ***
//  **
//  *
	
	static void pattern5(int n) {
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		for(int i=1;i<=n-1;i++) {
			for(int j=n-1;j>=i;j--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
//     *
//    **
//   ***
//  ****
// *****
	
	static void pattern6(int n) {
		for(int row=1;row<=n;row++) {
			for(int sp=1;sp<=n-row;sp++) {
				System.out.print(" ");
			}
			for(int star=1;star<=row;star++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
//	  *****
//     ****
//      ***
//       **
//        *
	static void pattern7(int n) {
		for(int row=1;row<=n;row++) {
			for(int sp=1;sp<=row-1;sp++) {
				System.out.print(" ");
			}
			for(int star=1;star<=n-row+1;star++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
//     *
//    ***
//   *****
//  *******
// *********
	
	static void pattern8(int n) {
		for(int row=1;row<=n;row++) {
			for(int sp=1;sp<=n-row;sp++) {
				System.out.print(" ");
			}
			for(int star=1;star<=2*row-1;star++) {
				System.out.print("*");
			}
//			for(int sp=1;sp<=n-row;sp++) {
//				System.out.print(" ");
//			}
			System.out.println();
		}
	}
	
//	 *********
//    *******
//     *****
//      ***
//       *

	static void pattern9(int n) {
		for(int row=1;row<=n;row++) {
			for(int sp=1;sp<=row-1;sp++) {
				System.out.print(" ");
			}
			for(int star=1;star<=2*n-(2*row-1);star++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
//     *
//    * *
//   * * *
//  * * * *
// * * * * *
	static void pattern10(int n) {
		for(int row=1;row<=n;row++) {
			for(int sp=1;sp<=n-row;sp++) {
				System.out.print(" ");
			}
			for(int star=1;star<=row;star++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	
//	   * * * * *
//      * * * *
//       * * *
//        * *
//         *
	static void pattern11(int n) {
		for(int row=1;row<=n;row++) {
			for(int sp=1;sp<=row-1;sp++) {
				System.out.print(" ");
			}
			for(int star=1;star<=n-row+1;star++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	
//	   * * * * *
//      * * * *
//       * * *
//        * *
//         *
//         *
//        * *
//       * * *
//      * * * *
//     * * * * *
//
	
	static void pattern12(int n) {
		for(int row=1;row<=2*n;row++) {
			
			int stars= row<=n? n-row+1 : row-n;
			int spaces= row<=n? row-1 : 2*n-row;
			
			for(int sp=1;sp<=spaces;sp++) {
				System.out.print(" ");
			}
			for(int star=1;star<=stars;star++) {
				System.out.print(" *");
			}
			System.out.println();
		}
	}
	
	static void pattern12a(int n) {
		pattern11(n);
		pattern10(n);
	}
	
//     *
//    * *
//   *   *
//  *     *
// *********

	
	static void pattern13(int n) {
		for(int row=1;row<=n;row++) {
			if(row==1||row==n) {
				for(int sp=1;sp<=n-row;sp++) {
					System.out.print(" ");
				}
				for(int star=1;star<=2*row-1;star++) {
					System.out.print("*");
				}
				
			}
			
			else {
				for(int sp=1;sp<=n-row;sp++) {
					System.out.print(" ");
				}
				System.out.print("*");
				for(int sp=1;sp<=2*(row-1)-1;sp++) {
					System.out.print(" ");
				}
				System.out.print("*");
			}
			
			System.out.println();
		}
	}
	
	
//	   *********
//      *     *
//       *   *
//        * *
//         *	
	
	static void pattern14(int n) {
		for(int row=1;row<=n;row++) {
			if(row==1||row==n) {
				for(int sp=1;sp<=row-1;sp++) {
					System.out.print(" ");
				}
				for(int star=1;star<=2*(n-row)+1;star++) {
					System.out.print("*");
				}
				
			}
			
			else {
				for(int sp=1;sp<=row-1;sp++) {
					System.out.print(" ");
				}
				System.out.print("*");
				for(int sp=1;sp<=2*(n-row-1)+1;sp++) {
					System.out.print(" ");
				}
				System.out.print("*");
			}
			
			System.out.println();
		}
	}
	
//     *
//    * *
//   *   *
//  *     *
// *       *
//  *     *
//   *   *
//    * *
//     *
//	
	
	static void pattern15(int n) {
		for(int row=1;row<=2*n-1;row++) {
			
			int spacesBet=row<=n? 2*(row-1) -1 : 2*(2*n-row-2)+1;
			int spacesBef=row<=n?n-row:row-n;
			
			
			if(row==1||row==2*n-1) {
				for(int sp=1;sp<=n-1;sp++) {
					System.out.print(" ");
				}
				System.out.print("*");
			}
			else {
				for(int sp=1;sp<=spacesBef;sp++) {
					System.out.print(" ");
				}
				
				System.out.print("*");
				
				for(int sp=1;sp<=spacesBet;sp++) {
					System.out.print(" ");
				}
				
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
//        1
//      1   1
//    1   2   1
//  1   3   3   1
//1   4   6   4   1	
	
	static void pattern16(int n) {
		int multiple=1;
		for(int row=1;row<=n;row++) {
			for(int sp=1;sp<=2*(n-row);sp++) {
				System.out.print(" ");
			}
			multiple = row==1 ? 1 : multiple*11;
			int temp=multiple;
			String str="";
			while(temp>0) {
				str=str+"   ";
				str=str+(temp%10);
				temp=temp/10;
			}
			StringBuilder sb=new StringBuilder(str);
			System.out.println(sb.reverse().toString());
		}
		
	}
	
//     1
//    212
//   32123
//  4321234
//   32123
//    212
//     1	
	
	static void pattern17(int n) {
		String str="1";
		for(int row=1;row<=2*n-1;row++) {
			
			int spaces=row<=n? n-row:row-n;
			

			for(int sp=1;sp<=spaces;sp++) {
				System.out.print(" ");
			}
			
			if(2<=row && row<=n) {
				str=""+row+str+row;
			}
			else if(row!=1 && row >n && row <=2*n) {
				str=str.substring(1,str.length()-1);
			}
			
			
			System.out.println(str);
			
		}
	}
	
//    **********
//    ****  ****
//    ***    ***
//    **      **
//    *        *
//    *        *
//    **      **
//    ***    ***
//    ****  ****
//    **********	
	
	
	static void pattern18(int n) {
		for(int row=1;row<=2*n;row++) {
			
			int spacesBet=row<=n?(row-1)*2:2*(2*n-row);
			int stars=row<=n?n-row+1:row-n;
			
			for(int sp=1;sp<=stars;sp++) {
				System.out.print("*");
			}
			for(int sp=1;sp<=spacesBet;sp++) {
				System.out.print(" ");
			}
			for(int sp=1;sp<=stars;sp++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
//	     *        *
//       **      **
//       ***    ***
//       ****  ****
//       **********
//       ****  ****
//       ***    ***
//       **      **
//       *        *
//	
	
	static void pattern19(int n) {
		for(int row=1;row<=2*n-1;row++) {
			
			int spacesBet=row<=n?2*(n-row):2*(row-n);
			int stars=row<=n?row:2*n-row;
			
			for(int sp=1;sp<=stars;sp++) {
				System.out.print("*");
			}
			for(int sp=1;sp<=spacesBet;sp++) {
				System.out.print(" ");
			}
			for(int sp=1;sp<=stars;sp++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	
	
//    ****
//    *  *
//    *  *
//    *  *
//    ****	
	
	static void pattern20(int n) {
		for(int row=1;row<=n;row++) {
			if(row==1||row==n) {
				for(int sp=1;sp<=n-1;sp++) {
					System.out.print("*");
				}
			}
			else {
				System.out.print("*");
				for(int sp=1;sp<=n-3;sp++) {
					System.out.print(" ");
				}
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
	
//    1
//    2  3
//    4  5  6
//    7  8  9  10
//    11 12 13 14 15	
	
	static void pattern21(int n) {
		int i=0;
		
		int max=maxDig(n);
		for(int row=1;row<=n;row++) {
			for(int col=1;col<=row;col++) {
				System.out.print((++i));
				for(int j=0;j<(max-digits(i)+1);j++) {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
	
	static int maxDig(int n) {
		int temp=n*(n+1)/2;
		return digits(temp);
	}
	
	
	static int digits(int num) {
		if (num < 0) {
	         num = num * -1;
	     }
	     return (int)(Math.log10(num)) + 1;
	}
	
	
// 	  1
//    0 1
//    1 0 1
//    0 1 0 1
//    1 0 1 0 1	
	
	static void pattern22(int n) {
		for(int row=1;row<=n;row++) {
			int flag=row%2==0?0:1;
			for(int col=1;col<=row;col++) {
				System.out.print(flag+" ");
				flag=flag==0?1:0;
			}
			System.out.println();
		}
	}
	
//    *      *
//  *   *  *   *
//*      *      *
	
	
//      *            *
//    *    *       *    *
//  *        *   *        *
//*            *            *
	
	
//	
//	
//	
//	
//
	
	
	
	public static void main(String[] args) {
		pattern22(6);
		
	}
}
