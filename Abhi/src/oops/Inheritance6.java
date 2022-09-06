package oops;
class Degree
{
	public void getDegree()
	{
		System.out.println("I got a Degree");
	}
}
class Undergraduate extends Degree
{
	public void print()
	{
		System.out.println("I am a Undergraduate");
	}
}
class Postgraduate extends Degree
{
	public void print()
	{
		System.out.println("I am a Postgraduate");
	}
}

public class Inheritance6 {

	public static void main(String[] args) {
		
		Postgraduate p=new Postgraduate();
		Undergraduate u=new Undergraduate();
		Degree d=new Degree();
		d.getDegree();
		p.print();
		u.print();		

	}

}
