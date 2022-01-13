import java.util.*;
public class SarthakAndHisMagicGrid {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		
		
		for(int i =0;i<t;i++)
		{
			int n = sc.nextInt();
			
			int arr[][] = new int[n][n];
			
			for(int[] row:arr)
			{
				Arrays.fill(row, 1);
			}
			
			
			for(int j=0;j<arr.length;j++)
			{
				for(int k=0;k<arr[0].length;k++)
				{
					System.out.print(arr[j][k]+" ");
				}
				System.out.println();
			}
		}

	}

}
