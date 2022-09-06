package aa;

import java.util.Scanner;

public class Primefact {

	public static void main(String[] args) {
		int a,c=0,w;
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		for(int i=2;i<(a-1);i++)
		{
			if(a%i==0)
			{
				c=i;
				w=0;
				for(int j=2;j<=(c/2);j++)
				{
					if(c%j==0)
						w=1;	
				}
				if(w==0)
				{
					System.out.println(c);
				}
			}
		}
		sc.close();

	}

}
