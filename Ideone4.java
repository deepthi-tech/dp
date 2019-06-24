/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.Scanner;
/* Name of the class has to be "Main" only if the class is public. */
class Ideone4
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
                int temp;
                int i=0; 
		Scanner scan = new Scanner(System.in);
		int num=scan.nextInt();
                while(num!=0)
                {
                  temp=num%10;
                  i++;
                  num=num/10;

                 }
                 System.out.println(i);
	
		
	}
}
