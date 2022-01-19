import java.util.*;
public class EqualCardGame {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int  t = sc.nextInt();
		while(t--!=0)
		{
			int k = sc.nextInt();
			int cards = 52;
			int division = cards%k;
			
			if(division == 0)
			{
				System.out.println(0);
			}
			else
			{
				System.out.println(division);
			}
		}

	}

}
