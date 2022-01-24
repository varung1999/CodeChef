import java.util.*;
public class PalindromesNotAllowed {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);		
		int t = sc.nextInt();
		
		while(t--!=0)
		{
			int n = sc.nextInt();
			
			String all = "abcdefghijklmnopqrstuvwxyz";//length = 26
			
			String ans = "";
			
			if(n<=26)
			{
				System.out.println(all.substring(0, n));
			}
			else
			{
				ans+=all;
				
				int rem = n-26;
				
				while(rem>=0)
				{
					if(rem<=26)
					{
						ans+=all.substring(0, rem);
					}
					else
					{
						ans+=all;
					}
					rem = rem - 26;
				}
				System.out.println(ans);
				
				
			}
			
		}

	}

}
