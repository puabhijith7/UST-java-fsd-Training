package hackathon1;

import java.util.Scanner;

public class Q8 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter Age");
	    int b=sc.nextInt();
		System.out.println("enter gender M or F");
		char a=sc.next().charAt(0);
	    System.out.println("enter Martial status Y or N");
		char c=sc.next().charAt(0);
		if(a=='F')
		{
			System.out.println("Works only in Urban Areas");
		}
		else
		{
			System.out.println("Works Anywhere");
		}
	}
}