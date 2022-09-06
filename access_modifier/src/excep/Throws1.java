package excep;

public class Throws1 {

	
		static void check() throws ArithmeticException
		{
			System.out.println(" check function");
			throw new ArithmeticException("demo");
		}
		public static void main(String[] args) {
			try
			{
				check();
				
			}
			catch(ArithmeticException e)
			{
				System.out.println("Caught"+e);
			}
		}
	}


