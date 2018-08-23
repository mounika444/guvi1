/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		String a;
    int d;
    Scanner s=new Scanner(System.in);
    d=s.nextInt();
    a=String.valueOf(d);
    char v[]=a.toCharArray();
    int sum=1;
    for(int i=0;i<v.length;i++){
        int y=Character.getNumericValue(v[i]);
        sum=sum*y;
    }
    System.out.println(sum);
   
	}
}
