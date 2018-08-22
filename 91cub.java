/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int length,height,width;
	
		int suf,vol;
	
		Scanner s=new Scanner(System.in);
		length=s.nextInt();
		height=s.nextInt();
		width=sc.nextInt();
		suf=2*((length*height)+(height*width)+(width*length));
		vol=length*height*width;

		System.out.print(suf +" ");
		System.out.print(vol);

		
	}
}
