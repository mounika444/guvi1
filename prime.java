/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int num=22,count=0,i;
		Scanner scan=new Scanner(System.in);
		 num=scan.nextInt();
		System.out.println("enter a number:");
		for(i=2;i<num;i++)
		{
			if(num%i==0)
			{
				count++;
				break;
			}
		}
			if(count == 0)
			{
				System.out.println("is prime");
			}
			else
			{
				System.out.println("is not prime");
			}
			}
		}
		
	
			
	
