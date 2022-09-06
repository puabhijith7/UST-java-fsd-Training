package day4;

import java.util.Scanner;

public class array5 {

	public static void main(String[] args) {
		int array[][]=new int[3][3];
		int r,c;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of rows");
		r=sc.nextInt();
		System.out.println("Enter number of cols");
		c=sc.nextInt();
		System.out.println("Enter the Elements");
		for (int i=0;i<r;i++)
		{
			for (int j=0;j<c;j++)
			{
				array[i][j]=sc.nextInt();
			}
		}
		for (int i=0;i<r;i++)
		{
			for (int j=0;j<c;j++)
			{
				System.out.print(array[i][j]+" ");
			}
			System.out.println();
	   }
       sc.close();
	}

}
