import java.util.*;
public class DevendraAndWaterSports {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		
		for(int i =0;i<t;i++)
		{
			long z = sc.nextLong();
			long y = sc.nextLong();
			long a = sc.nextLong();
			long b = sc.nextLong();
			long c = sc.nextLong();
			
			z=z-y;
			
			long sum = a +b+c;
			if(z-sum>=0)
			{
				System.out.println("YES");
			}
			else
			{
				System.out.println("NO");
			}
		}

	}

}
