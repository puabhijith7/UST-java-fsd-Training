package aa;

public class Newpattern3 {

	public static void main(String[] args) {
		int j;
		
		for(int i=1;i<=9;i++)
		{
			for( j=1;j<=i;j++)
			{
			if((j%2)==0)
					{
				System.out.print("0");
					}
			if((j%2)!=0)
			        {
		        System.out.print("1");
			        }
			
		    }
			System.out.println();
		}
		}

}
