package excep;

public class Classnotfoundexcep1 {

	public static void main(String[] args) {
		try
		{
			final String h="com.mysqldbc.Driver";
			System.out.println("Loading MySql");
			Class.forName(h);
		}
		catch(ClassNotFoundException e)
		{
			System.out.println(e);
		}

	}

}
