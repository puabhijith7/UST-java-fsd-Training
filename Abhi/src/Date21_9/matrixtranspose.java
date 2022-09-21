package Date21_9;

import java.util.Scanner;

public class matrixtranspose {
    
	public static void main(String[] args) {
		int r1,c1,c=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number of rows of matrix"); 
		r1=sc.nextInt();
		System.out.println("enter number of cols of matrix"); 
		c1=sc.nextInt();
		int a[][]=new int[r1][c1];	
		int b[][]=new int[c1][r1];
		System.out.println("enter the values of matrix in row order"); 
		for(int i=0;i<r1;i++)
		{
			for(int j=0;j<c1;j++)
			{
				int q=sc.nextInt();
				a[i][j]=q;
			}
		}
		for(int i=0;i<r1;i++)
		{
			for(int j=0;j<c1;j++)
			{	
			    b[i][j]=a[j][i];
			}			
		}
		System.out.println("Printing Transpose Matrix");
		for(int i=0;i<c1;i++)
		{
			for(int j=0;j<r1;j++)
			{	
			    System.out.print(b[i][j]+" ");
			}			
			    System.out.println();
		}
	}
}