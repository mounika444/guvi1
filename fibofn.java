/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Fib
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int ch = sc.nextInt();
		int a, b, d, n;
		a = b = 1;
		for (n = 1; n <= ch; n++)
			{
			System.out.print(a+" ");
			d = a + b;
			a = b;
			b = d;
			}
	}
}
