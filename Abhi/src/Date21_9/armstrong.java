package Date21_9;

import java.util.Scanner;

public class armstrong {

	public static void main(String[] args) {
		System.out.println("Enter number to check ");
		Scanner sc=new Scanner(System.in);
		int a,rem,c=0;
		a=sc.nextInt();
		int b=a;
		while(a!=0)
		{
			rem=a%10;
			c=c+((rem)*(rem)*(rem));
			a=a/10;
		}
		if(c==b)
		{
			System.out.println("Armstrong Number");
		}
		else
		{
			System.out.println("Not an Armstrong Number");
		}

	}

}
