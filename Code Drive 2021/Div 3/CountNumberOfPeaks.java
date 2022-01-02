//https://www.codechef.com/CDRV21C/problems/CNTPEAK
//Time Complexity: O(1)
//Video Solution : https://youtu.be/VDkd4xSeIVE

/* Possible Tuples are:
[0,1,0]
[1,2,1]
[1,0,1]
[2,1,2]
[0,2,0]
[2,0,2]
[0,2,1]
[1,2,0]
[1,0,2]
[2,0,1]
*/

import java.util.Scanner;
public class CountNumberOfPeaks {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		
		for(int i =0;i<t;i++)
		{
			int n = sc.nextInt();
			int ans = 10 * (n-2);
			ans=ans*((int)Math.pow(3, n-3));
			System.out.println(ans);
		}

	}

}
