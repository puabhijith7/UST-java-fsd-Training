package Date20_9;

import java.util.Scanner;

public class work1 {

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
		else if(a=='M' && (b>=20 && b<=40))
		{
			System.out.println("Works in Any Areas");
		}
		else if(a=='M' && (b>=40 && b<=60))
		{
			System.out.println("Works only in Urban Areas");
		}
		else {
			System.out.println("ERROR");
		}
	}

}
