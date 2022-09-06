package aa;
public class Diamondfull {   
	public static void main(String[] args) {
		for (int i=1;i<9;i++)
		{
			int c=i;
			while(c!=15)
			{
				System.out.print(" ");
				c++;
			}			
			for (int j=1;j<i;j++)
			{				
				System.out.print("* ");
			}		
			System.out.println();
		}
		for (int i=9;i>0;i--)
		{
			int c=i;
			while(c!=15)
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


