/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		double a;
     double p;
     double c=0;
     Scanner s=new Scanner(System.in);
     a=s.nextDouble();
    for(double i=1;i<=a;i++){
      p=Math.pow(2, i);
      if(p>a){
          c=i;
          break;
      }
    }
     double f=Math.pow(2, c);
     int d=(int) f;
     System.out.println(d);

	}
}
