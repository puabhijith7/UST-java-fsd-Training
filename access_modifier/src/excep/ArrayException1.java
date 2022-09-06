package excep;

public class ArrayException1 {

	public static void main(String[] args) {
		try
		{
			
			int a[]=new int[2];
			a[5]=4;	
			System.out.println("try code Works");
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println(e.getMessage());
		}
	}
}
