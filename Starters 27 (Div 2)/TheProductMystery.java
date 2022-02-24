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
			long num1 = sc.nextLong();
			long num2 = sc.nextLong();
			long c = num2;
			long gcd=0;
			while (num1 != num2) {
	        	if(num1 > num2)
	                num1 = num1 - num2;
	            else
	                num2 = num2 - num1;
	        }

			
			long ans = c/num2;
			System.out.println(ans);

		}
	}
}
