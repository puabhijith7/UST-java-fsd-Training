package oops;
class Member
{
	int age,Phonenumber,salary;
	String Address,name;
	public void PrintSalary() 
	{
		System.out.println(name);
		System.out.println(age);
		System.out.println(Address);
		System.out.println(Phonenumber);
		System.out.println(salary);
    }
}
	class Employee extends Member
	{
		String Spec;
		String Dep;
	}
	class Manager extends Member
	{
		String Spec;
		String Dep;
	}


public class Inheritance1 {

	public static void main(String[] args) {
		Employee e=new Employee();
		Manager m=new Manager();
		e.name="AA";
		e.Address="adsfshsh";
		e.age=22;
		e.Phonenumber=5453673;
		e.salary=363636;
		m.name="BB";
		m.Address="ajttyntsh";
		m.age=26;
		m.Phonenumber=86743445;
		m.salary=8654636;
		e.PrintSalary();
		System.out.println();
		m.PrintSalary();
		

	}

}
