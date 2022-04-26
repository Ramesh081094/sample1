package com.java.test;

public class FirstClass {
	
	public static void main(String[] args) { // single thread
		
		System.out.println("Hello World");
		//int public = 20;
		int a = 10, b = 20;
		int c = 3;
		
		//System.out.println( a / c );
		//System.out.println( a % c );
		
		int x = 5; //  x++ ==> x = x + 1 => x = 5 + 1
		/*System.out.println(x); //5
		System.out.println(++x); // 6
		System.out.println(--x); // 5
		System.out.println(x++); // 5 // x= 6
		System.out.println(x--); // 6 // x = 5
		System.out.println(x); // 5
		System.out.println(++x); // 6
		System.out.println(x); // 6 */
		
		//System.out.println( ++a + b--); // 11 + 20 = 31 // b = 19
		//System.out.println(b);
		int min = (a>b)&&(a<b)?a:b; // => (10<20)?10:20; => (true)?true:false
		// T & T = T
		// T & F = F
		// F & T = F
		// F & F = F
		System.out.println(min);
		
		int y = 10;
		
		y%=2; // y = y % 2 
		System.out.println(y);
		
		if(i=0,i<5,i++){
	        system.out.println("passed")
			}
		
		
		
	}

}
