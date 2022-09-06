package oops;
class AA
{
	public static void print()
	{
		System.out.println("Parent");
	}
}
class B extends AA
{
	public static void print()
	{
		System.out.println("Child");
	}
}
public class Inheritance9 {
	public static void main(String[] args) {
		AA obj1=new AA();
		B obj2=new B();
		obj1.print();
		obj2.print();
		AA obj=new B();
		obj.print();//prints parent
	}
}
