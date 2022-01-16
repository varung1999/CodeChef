import java.util.*;
public class TCSExamination {

	
	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		int t = sc.nextInt();
		for(int i =0;i<t;i++)
		{
			int DSA1 = sc.nextInt();
			int TOC1 = sc.nextInt();
			int DM1 = sc.nextInt();
			
			int total1 = DSA1+TOC1+DM1;
			
			int DSA2 = sc.nextInt();
			int TOC2 = sc.nextInt();
			int DM2 = sc.nextInt();
			
			int total2 = DSA2+TOC2+DM2;
			
			if(total1>total2)
			{
				System.out.println("DRAGON");
			}
			else if(total2>total1)
			{
				System.out.println("SLOTH");
			}
			else if(total1==total2)
			{
				if(DSA1==DSA2 && TOC1==TOC2 && DM1==DM2)
				{
					System.out.println("TIE");
				}
				else if(DSA1>DSA2)
				{
					System.out.println("DRAGON");
				}
				else if(DSA2>DSA1)
				{
					System.out.println("SLOTH");
				}
				else if(DSA1==DSA2)
				{
					if(TOC1>TOC2)
					{
						System.out.println("DRAGON");
					}
					else if(TOC2>TOC1)
					{
						System.out.println("SLOTH");
					}
				}
				
				
			}
			
		}
		
	}
}
