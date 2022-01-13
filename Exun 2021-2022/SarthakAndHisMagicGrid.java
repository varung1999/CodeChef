/*

The key idea of this question is to understand how BITWISE XOR works.

0 ^ 0 = 0
0 ^ 1 = 1
1 ^ 0 = 1
1 ^ 1 = 0

For all the bitwise XOR result to be same from any row, any column, or any of the two main diagonals - we can either fill 
the entire 2D array with the same number. That way we will get the same result.

Here, I filled the entire 2D array(arr[][]) with 1. 
The bitwise XOR operation will yield 0. 


*/


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
