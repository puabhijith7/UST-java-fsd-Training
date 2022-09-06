package aa;
import java.util.Scanner;
public class evenodd {

	public static void main(String[] args) {
		int a,q,e=0,o=0;
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		while(a!=0)
		{
			q=a%10;
			a=a/10;
			if(q%2==0)
			{
				e=e+q;
			}
			else
			{
				o=o+q;
			}
		}
		System.out.println("sum of Odd numbers "+o);
		System.out.println("sum of Even numbers "+e);
		sc.close();
		
		

	}

}
