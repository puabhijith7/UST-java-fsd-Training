package day4;

import java.util.Scanner;

public class array3 {

	public static void main(String[] args) {
		int array[]=new int[10];
		int a,n,s=0,m=1;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of elements");
		n=sc.nextInt();
		System.out.println("Enter elements");
		for (int i=0;i<n;i++)
		{
			a=sc.nextInt();
			array[i]=a;
		}
		for (int i=0;i<n;i++)
		{
			s=s+array[i];
		}
		for (int i=0;i<n;i++)
		{
			m=m*array[i];
		}
		System.out.println("Sum is "+s);
		System.out.println("Product is "+m);
		sc.close();
	}

}
