import java.util.*;
public class ChefAndFixedDeposits {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		
		for(int i =0;i<t;i++)
		{
			int n = sc.nextInt();
			int x = sc.nextInt();
			int arr[] = new int[n];
			for(int j =0;j<n;j++)
			{
				arr[j]=sc.nextInt();
			}
			Arrays.sort(arr);
			
			int sum=0,count=0,f=0;
			for(int j=arr.length-1;j>=0;j--)
			{
				sum=sum+arr[j];
				count++;
				if(sum>=x)
				{
					f=1;
					break;
				}
			}
			
			if(f==1)
			{
				System.out.println(count);
			}
			else
			{
				System.out.println(-1);
			}
		}

	}

}
