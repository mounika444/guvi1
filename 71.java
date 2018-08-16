/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		 String a;
    Scanner s=new Scanner(System.in);
    a=s.next();
    String w=new StringBuffer().reverse().toString();
    if(a.equalsIgnoreCase(w)){
        System.out.println("no");
    }
 else{
        System.out.println("yes");
 }

}
	
}
