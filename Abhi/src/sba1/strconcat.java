package sba1;

import java.util.Scanner;

public class strconcat {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Inmate's name :");
		String a=sc.nextLine();
		a=a.toUpperCase();
		a=a+" ";
		System.out.println("Inmate's father's name :");
		String b=sc.nextLine();
		b=b.toUpperCase();
		a=a+b;
		b=a.replaceAll(" ","");	
		System.out.println(b);
		if(b.matches("[a-zA-Z]+"))
		{
			System.out.println(a);
		}
		else 
		{
			System.out.println("Invalid name");
		}
	}
}
