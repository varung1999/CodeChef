//https://codeforces.com/contest/1621/problem/A
//Time Complexity: O(N^2)

/**

The key idea of this problem is that for an arrangement to be stable, the rooks can be placed only when i==j


**/


import java.util.Scanner;
public class StableArrangementOfRooks {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		
		for(int i =0;i<t;i++)
		{
			int n = sc.nextInt();
			int k =sc.nextInt();
			
			if(k*2-1>n)
			{
				System.out.println("-1");
				continue;
			}
			else
			{
				for(int j=0;j<n;j++)
				{
					for(int b=0;b<n;b++)
					{
						if(j==b && j%2==0 && k>0)
						{
							System.out.print("R");
							k--;
							continue;
						}
						System.out.print(".");
					}
					System.out.println();
				}
			}
			
		}
		
		

	}
	
	

}
