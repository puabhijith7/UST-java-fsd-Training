package excep;

public class NullExcep1 {

	public static void main(String[] args) {
		try {
		
		String s=null;
		System.out.println(s.length());
		}
		catch(NullPointerException e)
		{
			System.out.println(e.getMessage());
		}
	}

}
