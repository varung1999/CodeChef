import java.util.*;
public class ElectionsInChefLand {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		
		while(t--!=0)
		{
			int xa = sc.nextInt();
			int xb= sc.nextInt();
			int xc = sc.nextInt();
			int a=0,b=0,c=0;
			if(xa>50)
			{
				a++;
			}
			if(xb>50)
			{
				b++;
			}
			if(xc>50)
			{
				c++;
			}
			
			if(a==1)
			{
				System.out.println("A");
			}
			else if(b==1)
			{
				System.out.println("B");
			}
			else if(c==1)
			{
				System.out.println("C");
			}
			else if(a==0 && b==0 && c==0)
			{
				System.out.println("NOTA");
			}
		}

	}

}
