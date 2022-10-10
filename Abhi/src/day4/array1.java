package day4;
import java.util.Scanner;
public class array1 {

	public static void main(String[] args) {
		String array[]=new String[10];
		String a;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter elements");
		for (int i=0;i<10;i++)
		{
			a=sc.nextLine();
			array[i]=a;
		}
		System.out.println("Elements are");
		for (int i=0;i<10;i++)
		{
			System.out.println(array[i]);
		}
		sc.close();

	}

}
