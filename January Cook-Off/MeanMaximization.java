import java.util.*;
public class MeanMaximization {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		
		while(t--!=0)
		{
			int n = sc.nextInt();
			
			int arr[] = new int[n];
			int max = 0,sum=0;
			for(int i =0;i<n;i++)
			{
				arr[i]=sc.nextInt();
				max = Math.max(max, arr[i]);
				sum+=arr[i];
			}
			
			double ans = (double)(sum-max)/(n-1);
			ans = ans + max;
			System.out.format("%6f \n", ans);
			
			
		}

	}

}
