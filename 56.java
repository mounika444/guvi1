/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int c=0,b=0,s;
		Scanner d=new Scanner(System.in);
		String e=d.nextLine();
		char a[]=e.toCharArray();
		for(int i=0;i<a.length;i++)
		{
	            	if(a[i]>='0'&&a[i]<='9')
	            	{
	            		c=1;	
	            	}
	            	else if(a[i]>='A'&&a[i]<='Z'||a[i]>='a'&&a[i]<='z')
	            	{
	            		b=1;	
	            	}
		}
		s=c+b;	
		if(s==2)
			{
				System.out.println("Yes");
			}
			else
			{
				System.out.println("No");
			}
	            	
	}
}
