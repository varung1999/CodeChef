import java.util.*;
public class AnInterestingSequence {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int t = sc.nextInt();
		while(t--!=0)
		{
			long k = sc.nextInt();
			long y =0;
			while(k%2==0)
			{
				k=k/2;
				y=y+1;
			}
			System.out.println(y);
		}

	}

}
