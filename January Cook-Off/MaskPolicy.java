import java.util.*;
public class MaskPolicy {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		
		while(t--!=0)
		{
			int total = sc.nextInt();
			int infected = sc.nextInt();
			
			
			int ninfected = total - infected;
			
			if(infected>=ninfected)
			{
				System.out.println(ninfected);
			}
			else
			{
				System.out.println(infected);
			}
			
		}

	}

}
