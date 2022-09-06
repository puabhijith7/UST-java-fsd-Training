package day4;

import java.util.Scanner;

public class array4 {

	public static void main(String[] args) {
		int array[]=new int[10];
		int a,n,s,b,i;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of elements");
		n=sc.nextInt();
		System.out.println("Enter the elements");
		for (i=0;i<n;i++)
		{
			a=sc.nextInt();
			array[i]=a;
		}
		
		s=array[i-1];
		b=array[i-1];
		for (i=0;i<n;i++)
		{		
			if(s>array[i])
			{
				s=array[i];
				
			}
		}
		for (i=0;i<n;i++)
		{		
			if(b<array[i])
			{
				b=array[i];
			}
		}
		
		System.out.println("Biggest number"+b);
		System.out.println("Smallest number"+s);
		sc.close();
		

	}

}
