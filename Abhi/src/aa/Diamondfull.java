package aa;
public class Diamondfull {   
	public static void main(String[] args) {
		for (int i=0;i<5;i++)
		{
			int c=i;
			while(c!=4)
			{
				System.out.print(" ");
				c++;
			}			
			for (int j=0;j<i;j++)
			{				
				System.out.print("* ");
			}		
			System.out.println();
		}
		for (int i=4;i>0;i--)
		{
			int c=i;
			while(c!=5)
			{
				System.out.print(" ");
				c++;
			}				
			for (int j=i;j>1;j--)
			{				
				System.out.print("* ");
			}
			
			System.out.println();
		}

	}
}

