package excep;

public class exception {

	public static void main(String[] args) {
		try
		{
			int d=(3/1);
			int a[]=new int[2];
			a[1]=4;
			String n=null;
			
			System.out.println("try code Works");
		}
		catch(ArithmeticException e)
		{
			System.out.println(e.getMessage());
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("s");
		}
		catch(NullPointerException e)
		{
			System.out.println("s");
		}
	}

}
