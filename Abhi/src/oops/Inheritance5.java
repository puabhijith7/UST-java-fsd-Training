package oops;
class A{
	public void Area(int a,int b)
	{
		System.out.println("Area of Rectangle"+(a*b));
	}
	public void Area(int a)
	{
		System.out.println("Area of Square"+(a*a));
	}
}

public class Inheritance5 {

	public static void main(String[] args) {
		A obj=new A();
		obj.Area(2,3);
		obj.Area(2);

	}

}
