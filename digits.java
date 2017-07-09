/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.util.Scanner;

import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class digits
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int no,temp=0,i=0;
		Scanner s = new Scanner(System.in);
		no=s.nextInt();
		
		temp=no;
		while(temp>0)
		{
			temp = temp/10;
			i++;
		}
		System.out.println(i);
	}
}