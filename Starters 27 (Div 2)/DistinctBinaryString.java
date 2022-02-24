/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner sc = new Scanner(System.in);
	    int t = sc.nextInt();
		while(t--!=0)
		{
			int n = sc.nextInt();
			String s = sc.next();
			int count = 1;
			for(int i =1;i<n;i++)
			{
				if(s.charAt(i)==s.charAt(i-1))
				{
					continue;
				}
				count++;
			}
			System.out.println(count);
		}
	}
}
