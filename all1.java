/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int a[]  = new int[20];
		int n;
		Scanner sc = new Scanner(System.in);
		n=sc.nextInt( );
		int i = 0;
		while(n>0)
		{
			int res=n%10;
			a[i]=res;
			n=n/10;
			i++;
			
		}
		while(i>0)
		{
			--i;
			System.out.println(a[i]);
			if(i>=1)
			System.out.println(" ");
			
		}
	}
}
