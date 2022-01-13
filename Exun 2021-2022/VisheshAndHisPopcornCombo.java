import java.util.*;
public class VisheshandhisPopcornCombo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for(int i =0;i<t;i++)
		{
			long max = Integer.MIN_VALUE;
			
			long a1 = sc.nextLong();
			long a2 = sc.nextLong();
			long b1 = sc.nextLong();
			long b2 = sc.nextLong();
			long c1 = sc.nextLong();
			long c2 = sc.nextLong();
			
			long one = a1 + a2;
			long two = b1+b2;
			long three = c1+c2;
			
			max = Math.max(one, Math.max(two, three));
			
			System.out.println(max);
		}

	}

}
