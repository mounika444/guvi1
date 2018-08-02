/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Large_Number
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int n,max;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number of elements in ana array");
		n = sc.nextInt();
		int a[]=new int[n];
		System.out.println("enter elements of an array");
		for(int i=0;i<n;i++)
		{
			a[i] = sc.nextInt();
		}
		max=a[0];
		for(int i=0;i<n;i++)
		{
			if(max < a[i])
			{
				max=a[i];
			}
			
			}
			System.out.println(+max);
		}
		
	
	}
