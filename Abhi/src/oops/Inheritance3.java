package oops;
class PrintNumber
{
	public void print(int a)
	{
		System.out.println("This is Integer");
	}
	public void print(char b)
	{
		System.out.println("This is Character");
	}
	public void print(double a)
	{
		System.out.println("This is Double");
	}
	public void print(String a)
	{
		System.out.println("This is String");
	}
}
public class Inheritance3 {
	public static void main(String[] args) {
		PrintNumber p=new PrintNumber();
		p.print(1);
		p.print('q');
		p.print(7.89);
		p.print("ytfyf");
	}
}