/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.Scanner;
/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
              
		Scanner scan = new Scanner(System.in);
		int yr=scan.nextInt();
                if(yr%4==0 || yr%400==0)
                 {
               System.out.println("yr is a leap year");
                  }
                else
                  {
                 System.out.println("yr is not a leap year");
                   }
	
		
	}
}
