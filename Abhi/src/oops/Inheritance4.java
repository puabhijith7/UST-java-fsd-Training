package oops;
class Display
{
	public void print(int a,char b)
	{
		System.out.println("First method");
	}
	public void print(char a,int b)
	{
		System.out.println("Second method");
	}
}
public class Inheritance4 {

	public static void main(String[] args) {
		Display d=new Display();
		d.print(1,'p');
		d.print('f',6);
	}
}
