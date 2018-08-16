/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner s=new Scanner(System.in);
       String sh=s.nextLine();
       if(sh.length()%2!=0)
       {
           int a=sh.length()/2;
       for(int i=0;i<sh.length();i++)
       {
           if(i==a)
               System.out.print("*");
           else
           System.out.print(sh.charAt(i));
       }
       }
       else{
           int c=sh.length()/2;     
       for(int i=0;i<sh.length();i++)
       {
           if(i==c ||i==c-1)
               System.out.print("*");
           else
           System.out.print(sh.charAt(i));
       
           
	}
       }
	}
}
