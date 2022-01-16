import java.util.*;
public class CryingColours {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int t = sc.nextInt();
		while(t--!=0)
		{
			int n = sc.nextInt();
			
			int r1 = sc.nextInt();
			int g1 = sc.nextInt();
			int b1 = sc.nextInt();
			
			int r2 = sc.nextInt();
			int g2 = sc.nextInt();
			int b2 = sc.nextInt();
			
			int r3 = sc.nextInt();
			int g3 = sc.nextInt();
			int b3 = sc.nextInt();
			
			int count = 0,sum=0;
			
			if(r1 == n && g2 == n && b3==n)
			{
				System.out.println(count);
				
			}
			else
			{
				int a = g1+b1+b2;
				int b = r2+r3+g3;
				
				System.out.println(Math.max(a, b));
			}
			
			
			
		}

	}

}
