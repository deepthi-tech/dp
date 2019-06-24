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
		int n;
		Scanner scan=new Scanner(System.in);
		n=scan.nextInt();
		if(n%2==0)
		{
			System.out.println("Even");
		}
		else if(n<0)
		{
			System.out.println("Invalid");
		}
	        else
		{
			System.out.println("Odd");
		}
	}
}
