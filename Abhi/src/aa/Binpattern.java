package aa;

public class Binpattern {

	public static void main(String[] args) {
		for (int i=4;i>0;i--)
		{
			int c=i;
			while(c!=4)
			{
				System.out.print(" ");
				c++;
			}
				
			for (int j=i;j>1;j--)
			{
				
				System.out.print("10");
			}
			
			System.out.print("1\n");
		}
	}

}
