package Date21_9;

import java.util.Scanner;

public class matrixodd_even {

	public static void main(String[] args) {
		int r1,c1,c=0,even=0,odd=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number of rows of matrix"); 
		r1=sc.nextInt();
		System.out.println("enter number of cols of matrix"); 
		c1=sc.nextInt();
		int a[][]=new int[r1][c1];		
		System.out.println("enter the values of matrix in row order"); 
		for(int i=0;i<r1;i++)
		{
			for(int j=0;j<c1;j++)
			{
				int q=sc.nextInt();
				a[i][j]=q;
				if(q%2==0) 
				{
					even++;					
				}
				else
				{
					odd++;
				}
			}
		}
     System.out.println("Even numbers in the given matrix -"+even);
     System.out.println("Odd numbers in the given matrix -"+odd);
	}
}
