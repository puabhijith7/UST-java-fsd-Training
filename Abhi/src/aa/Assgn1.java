package aa;

import java.util.Scanner;

public class Assgn1 {

	public static void main(String[] args) {
		float b=0;
		int a;
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<10;i++)
		{
			a=sc.nextInt();
			b=b+a;
		}
	    float c= b/10;
		System.out.println(c);
		sc.close();
	}

}
