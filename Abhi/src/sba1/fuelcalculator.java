package sba1;

import java.util.Scanner;

public class fuelcalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		float a,b;
		System.out.println("Enter the no of litres to fill the tank ");
		a=sc.nextInt();
		if(a<0 )
		{
			System.out.println(a+ " is an Invalid Input");
			System.exit(0);
		}
		System.out.println("Enter the distance covered ");
		b=sc.nextInt();
		if(b<0 )
		{
			System.out.println(b+ " is an Invalid Input");
			System.exit(0);
		}
		System.out.println("Litres/100KM");
		float q=a/b;
		q=q*100;
		System.out.printf("%.2f\n",q);
		System.out.println("Miles/gallons");
		float p=(float) (b*(0.6214));
		float l=(float) (a*(0.2642));
		p=p/l;
		System.out.printf("%.2f",p);
		

	}

}
