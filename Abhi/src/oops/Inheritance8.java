package oops;
class c
{
	int i;
	public void printNum()
	{
		System.out.println(i);
	}
}
class sub extends c
{
	int j;
	public void printNum()
	{
		//super.printNum();
		System.out.println(j);
	}
}

public class Inheritance8 {

	public static void main(String[] args) {
		sub obj=new sub();
		obj.i=10;
        obj.j=30;
        obj.printNum();
	}

}
