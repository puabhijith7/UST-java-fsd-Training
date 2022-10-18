package aa;

import java.util.Scanner;

public class Desiredsum {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Desired sum : ");
		int a=sc.nextInt();		
		System.out.println("Enter Array Size : ");
		int b=sc.nextInt();
		int e=0,i=0,l=0;
		int array[]=new int[b];
		System.out.println("Enter Numbers : ");
		for( i=0;i<array.length;i++)
		{	
			e=0;	
			int c=sc.nextInt();
			for(int s=0;s<i;s++)
			{
				if(c==array[s])
				{
					e=1;
				}
			}
			if(e==0)
			{
			array[i]=c;
			l++;
			}
		}
		for( i=0;i<l;i++)
		{		
			int p=a-array[i];
			for(int j=i;j<l;j++)
			{
				if(p==array[j])
				{
				System.out.println(array[j]+" "+(a-array[j]));
				for(int y=j;y<l;y++)
				{
					array[y]=array[y+1];
				}
				}
				
			}
		}
		
		

	}

}
