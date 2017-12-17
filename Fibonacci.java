import java.io.*;
// Recursion over Loopin
class GFG {
	public static void main (String[] args)
	{
		System.out.println("GfG!");
		fibonacciTillTerms(0,10);
	}
	
	static int fibonacci(int n)
	{
	    if(n == 1)
	        return 1;
	    if(n == 0)
	        return 0;
	    return fibonacci(n-1) + fibonacci(n-2);
	}
	
	static void fibonacciTillTerms(int i,int n)
	{   
	    System.out.println(fibonacci(i));
	    if(i<=n)
	        fibonacciTillTerms(i+1,n);
	}
	
}
