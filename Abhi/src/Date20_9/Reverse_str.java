package Date20_9;

public class Reverse_str {

	public static void main(String[] args) {
		String s="alfy";
		String rev="";
		char ch;
		for(int i=s.length()-1;i>=0;i--)
		{
			ch=s.charAt(i);
			rev=rev+ch;
		}
		System.out.println("String before reversing "+s);
		System.out.println("String after reversing  "+rev);
	}
}
