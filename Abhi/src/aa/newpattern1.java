package aa;
import java.util.Scanner;
public class newpattern1 {

	public static void main(String[] args) {
		System.out.println("enter n\n");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
			System.out.print(i+" ");
			}
			System.out.println();
		}
		sc.close();

	}

}
