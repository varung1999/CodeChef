import java.util.*;
public class PrimeInABinaryString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		
		
		for(int i =0;i<t;i++)
		{
			String s = sc.next();
			boolean ans = false;
			
			
			if(s.contains("10") || s.contains("11"))
			{
				ans=true;
			}
			
			if(ans)
			{
				System.out.println("Yes");
			}
			else
			{
				System.out.println("No");
			}
			
			
		}

	}
	
	private static boolean check(int number)
	{
		if(number<=1)
		{
			return false;
		}
		
		for(int i =2;i<number;i++)
		{
			if(number%i==0)
			{
				return false;
			}
		}
		return true;
	}
	
	

}
