/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int count=1,i=0;
		String s=sc.next();
                      String arr[]=s.split("\t");
    for(i=1;i<s.length()-1;i++)
    {
	count++;	
    }
    System.out.println(""+count);
	}
}
	
