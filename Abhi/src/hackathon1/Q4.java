package hackathon1;

import java.util.Scanner;

public class Q4 {

	public static void main(String[] args) {
		int r1,c1,r2,c2,c=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number of rows of first matrix"); 
		r1=sc.nextInt();
		System.out.println("enter number of cols of first matrix"); 
		c1=sc.nextInt();
		System.out.println("enter number of rows of Second matrix"); 
		r2=sc.nextInt();
		System.out.println("enter number of cols of Second matrix"); 
		c2=sc.nextInt();
		int a[][]=new int[r1][c1];		
		int b[][]= new int[r2][c2];
		if(r1==r2 && c1==c2)
		{
		System.out.println("enter the values of First matrix in row order"); 
		for(int i=0;i<r1;i++)
		{
			for(int j=0;j<c1;j++)
			{
				int q=sc.nextInt();
				a[i][j]=q;
			}
		}
		System.out.println("enter the values of Second matrix in row order"); 
		for(int i=0;i<r2;i++)
		{
			for(int j=0;j<c2;j++)
			{
				int q=sc.nextInt();
				b[i][j]=q;
			}
		}
		    c=0;
			for(int i=0;i<r1;i++)
			{
				for(int j=0;j<c1;j++)
				{
					if(a[i][j]!=b[i][j])
					{
						c=1;
						break;
					}
					else 
					{
						c=0;
					}
				}
			}
			
		}
		else
		{
			System.out.println(" Matrices are not equal ");
			System.exit(0);
		}
		if(c==0)
		{
			System.out.println("Matrices are Equal");
		}
		else
		{
			System.out.println(" Matrices are not equal ");
		}

	}

	}
