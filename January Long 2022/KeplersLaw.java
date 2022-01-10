import java.util.*;
public class KeplersLaw {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int t =sc.nextInt();
		
		for(int i =0;i<t;i++)
		{
			float t1 = sc.nextInt();
			float t2 = sc.nextInt();
			float r1 = sc.nextInt();
			float r2 = sc.nextInt();
			
			//System.out.println(t1+" "+t2+" "+r1+" "+r2);
			float f_num = (t1*t1);
			float f_denum = (r1*r1*r1);
			//System.out.println(f_num+" "+f_denum);
			float first = f_num/f_denum;
			
			float s_num = (t2*t2);
			float s_denum = (r2*r2*r2);
			float second = s_num/s_denum;
//			System.out.println(s_num+" "+s_denum);
//			System.out.println(first+" "+second);
			if(first==second)
			{
				System.out.println("Yes");
			}
			else
			{
				System.out.println("No");
			}
			
		}

	}

}
