/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int i = 1 ;
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        while(i <= x)
        {
            sum = sum +i;
            i++;
        }
        System.out.println(sum);
    
	}

}
