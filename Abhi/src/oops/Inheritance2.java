package oops;
class Shape
{
	public void print()
	{
		System.out.println("This is Shape");
	}
}
class Rectangle extends Shape
{
	public void print1()
	{
		System.out.println("This is  Rectangle shape");
	}
}
class Circle extends Shape
{
	public void print2()
	{
		System.out.println("This is Circular shape");
	}
}
class Square extends Rectangle
{
	public void print3()
	{
		System.out.println("Square is a Rectangle");
	}
}

public class Inheritance2 {

	public static void main(String[] args) {
		Square s=new Square();
		s.print();
		s.print1();

	}

}
