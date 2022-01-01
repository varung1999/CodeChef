//https://www.codechef.com/CDRV21C/problems/FRGAME
//Author: Varun Gollapalli
//Time Complexity: O(1)

import java.util.Scanner;
public class GameBetweenFriends {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		
		for(int i =0;i<t;i++)
		{
			int a =sc.nextInt();
			int b =sc.nextInt();
			int c =sc.nextInt();
			int d =sc.nextInt();
			//for c
			if(a>=b)
			{
				b=b+c;
			}
			else if(a<b)
			{
				a=a+c;
			}
			
			//for d
			
			if(a>=b)
			{
				b=b+d;
			}
			else if(a<b)
			{
				a=a+d;
			}
			
			if(b>a)
			{
				System.out.println("S");
			}
			else
			{
				System.out.println("N");
			}
		}

	}

}
