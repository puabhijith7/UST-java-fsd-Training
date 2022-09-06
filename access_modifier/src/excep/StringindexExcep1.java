package excep;

public class StringindexExcep1 {

	public static void main(String[] args) {
		try {
		String s="qwerty";
		System.out.println(s.charAt(9));
		}
		catch(StringIndexOutOfBoundsException e)
		{
			System.out.println(e.getMessage());
			
		}
	}

}
