//https://www.codechef.com/START21C/problems/CHEFGRD

import java.util.*;
public class AkashAndGrid {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		
		for(int i =0;i<t;i++)
		{
			int n = sc.nextInt();
			
			int x = sc.nextInt();
			int y = sc.nextInt();
			
			int center_x = (n+1)/2;
			int center_y = (n+1)/2;
			
			if(Math.abs(center_x-x)==Math.abs(center_y-y))
			{
				System.out.println(0);
				continue;
			}
			
			long one = Math.abs(center_x-x);
			long two = Math.abs(center_x-y);
			
			long ans = one+two;
			
			ans=ans%2;
			System.out.println(ans);
			
			
		}

	}

}
