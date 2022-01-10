import java.math.BigInteger;
import java.util.*;
public class CovidSpread {

	public static void main(String[] args) {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		for(int i =0;i<t;i++)
		{
			long n = sc.nextLong();
			long d = sc.nextLong();
			
			long ans = 1;
			
			for(long j =1;j<=d;j++)
			{
				if(j<=10)
				{
					ans=ans*2;
					
					if(ans>n)
					{
						ans = n;
						break;
					}
				}
				else
				{
					ans = ans *3;
					
					if(ans>n)
					{
						ans=n;
						break;
					}
				}
			}
			
			System.out.println(ans);
		}

	}

}
