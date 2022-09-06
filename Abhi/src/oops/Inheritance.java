package oops;

class Parent
{
	public void showp()
	{
	System.out.println("This is Parent class");
	}
}
class Child extends Parent
{
	public void showc()
	{
	System.out.println("This is Child class");
	}
}

public class Inheritance {

	public static void main(String[] args) {
		Parent p=new Parent();
		Child c=new Child();
		p.showp();
		c.showc();
		c.showp();
		
		

	}

}
