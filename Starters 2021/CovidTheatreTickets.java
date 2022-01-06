import java.util.Scanner;
public class CovidAndTheatreTickets {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		
		for(int i =0;i<t;i++)
		{
			long n = sc.nextInt();
			long m = sc.nextInt();
			
			long a = n/2 + n%2;
			long b = m/2 + m%2;
			
			System.out.println(a*b);
		}

	}

}
