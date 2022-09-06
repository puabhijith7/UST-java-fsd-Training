package aa;

import java.util.Scanner;

public class fib {

	public static void main(String[] args) {
		int a=0,b=1,c,n;
		System.out.println("Enter N : ");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		System.out.print(a+" "+b+" ");
        for (int i=2;i<n;i++)
        {
        	c=a+b;
        	a=b;
        	b=c;
        	System.out.print(c+" ");
        }
        sc.close();
	}

}
