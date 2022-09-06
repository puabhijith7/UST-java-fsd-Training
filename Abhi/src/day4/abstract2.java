package day4;
abstract class Animals
{
	abstract void cats();
	abstract void dogs();
}
 class Cats extends Animals
{
	public void cats()
	{
		System.out.println("Cats meow");
	}
	public void dogs()
	{
		//System.out.println("dogs bark");
	}
}
 class Dogs extends Animals
{
	public void dogs()
	{
		System.out.println("dogs bark");
	}
	public void cats()
	{
		//System.out.println("Cats meow");
	}
}

public class abstract2 {

	public static void main(String[] args) {
		Cats s1=new Cats();
		Dogs s2=new Dogs();
		s1.cats();
		s2.dogs();

	}

}
