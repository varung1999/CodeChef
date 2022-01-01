//https://www.codechef.com/CDRV21C/problems/CHEFFAV
//Author: Varun Gollapalli
//Time Complexity: O(n) because String.indexOf() requires Linear time to compute.

import java.util.*;
public class FavouriteStringOfChef {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		
		for(int i =0;i<t;i++)
		{
			int n = sc.nextInt();
			String input = sc.next();
			
			if(check(input)==true)
			{
				System.out.println("AC");
			}
			else
			{
				System.out.println("WA");
			}
		}
		
		

	}
	
	public static boolean check(String input)
	{
		if(input.length()<4)
		{
			return false;
		}
		
		if(input.length()==4 && input.contentEquals("chef"))
		{
			return false;
		}
		
		boolean ans = false;
		
		if(input.indexOf("code")<input.indexOf("chef"))
		{
			ans = true;
			return ans;
		}
		else
		{
			ans = false;
			return ans;
		}
		
	}

}
