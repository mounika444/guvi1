/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		for(int i=0;i<3;i++)
		{
		usingRandomClass();
		}
	}
	static void usingRandomClass()
	{
		Random randomGenerator = new Random();
		int randomInt = randomGenerator.nextInt(10) + 1;
		int rm=randomGenerator.nextInt(10)+1;
		System.out.println(" "+randomInt);
		System.out.println(" "+rm);
		if(randomInt==rm)
		{
			System.out.println("true");
		}
		else
		{
			System.out.println("false");
		}
		
	}
}
