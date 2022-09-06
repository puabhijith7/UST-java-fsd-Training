package aa;

import java.util.Scanner;

public class smallestofthree {

	public static void main(String[] args) {
		int a,b,c;
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		if(a<b)
		{
			if(a<c)
			{
			System.out.println( a+" is smaller");
			}
			else 
			{
				System.out.println( c+" is smaller");
			}
		}
		else 
		{
				if(b<c)
			{
				System.out.println( b+" is smaller");
			}
				else {
					System.out.println( c+" is smaller");
				}
		}
		
		
    sc.close();
    
	}
	}


