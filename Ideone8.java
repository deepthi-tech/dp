/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.Scanner;
/* Name of the class has to be "Main" only if the class is public. */
class Ideone8
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
              
		Scanner scan = new Scanner(System.in);
                System.out.println("enter n");
                int n=scan.nextInt();
                System.out.println("enter k");
                int k=scan.nextInt();
                System.out.println("enter array");
                int a[]=new int[n];
                int sum=0;
                for(int i=0;i<n;i++)
                 { 
                   a[i]=scan.nextInt();  
                  }
                 for(int j=0;j<k;j++)
                 {   
                System.out.println(a[j]);
		}
	}
}
