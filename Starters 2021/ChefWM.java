//https://www.codechef.com/START21C/problems/CHEFWM
//video solution:https://www.youtube.com/watch?v=3l1OXfsaTqM


import java.util.*;
public class ChefWM {
	
	public static int helper(int m)
	{
		int count = 0;
		for(int i =2;i*i<=m;i++)
		{
			if(m%i==0)
			{
				count++;
			}
			while(m%i==0)
			{
				m/=i;
			}
		}
		if(m!=1)
		{
			count++;
		}
		return count;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int  t = sc.nextInt();
		
		for(int i =0;i<t;i++)
		{
			int n = sc.nextInt();
			int m = sc.nextInt();
			
			int primes = helper(m);
			int ans =0;
			for(int j = primes;j>0;j--)
			{
				if(n%j==0)
				{
					ans = j;
					break;
				}
			}
			System.out.println(ans);
		}

	}

}
