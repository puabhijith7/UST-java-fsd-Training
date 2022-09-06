package excep;

public class Arithmetic1 {

	public static void main(String[] args) {
		try
		{
			int d=(3/0);
			System.out.println("try code Works");
		}
		catch(ArithmeticException e)
		{
			System.out.println(e.getMessage());
		}
	}

}
