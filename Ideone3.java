/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.Scanner;
/* Name of the class has to be "Main" only if the class is public. */
class Ideone3
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner scan = new Scanner(System.in);
		char str=scan.next().charAt(0);
		if(str=='a'|| str=='e'|| str=='i' || str=='o' || str=='u')
		{
			System.out.println("Vowel");
		}
		else if(str=='b'|| str=='c'|| str=='d' || str=='f' || str=='g'||
                        str=='h'|| str=='j'|| str=='k' || str=='l' || str=='m'||
                        str=='n'|| str=='p'|| str=='q' || str=='r' || str=='s'||
                        str=='t'|| str=='v'|| str=='w' || str=='x' || str=='y'||
                        str=='z')
		{
			System.out.println("Consonant");
		}
		else
		{
			System.out.println("Invalid");
		}
	}
}
