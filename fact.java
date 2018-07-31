/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	static int factorial(int number)
	{
		if(number==0)
		return 1;
		else
		return(number*factorial(number-1));
	}
	public static void main (String[] args) throws java.lang.Exception
	{
		int i,fact=1;
		int number=5;
		fact=factorial(number);
		
		
		System.out.println(fact);
		

	}
}
