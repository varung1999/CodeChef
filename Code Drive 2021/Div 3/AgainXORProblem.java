//https://www.codechef.com/CDRV21C/problems/KLXOR
//Time Complexity: O(n)


import java.util.*;
public class AgainXORProblem {
	
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		int t = sc.nextInt();
		
		for(int i =0;i<t;i++)
		{
			int n = sc.nextInt();
			int k = sc.nextInt();
			int ans =0;
			int xo=0;
			String s = sc.next();
			
			for(int a =0;a<=n-k;a++)
			{
				xo^=(s.charAt(a)-'0');
			}
			
			if(xo==1)
			{
				ans++;
			}
			
			int start =0;
			int end = n-k+1;
			
			while(end<n)
			{
				xo^=(s.charAt(start++)-'0');
				xo^=(s.charAt(end++)-'0');
				if(xo==1)
				{
					ans++;
				}
			}
			System.out.println(ans);
		}
	}

}
