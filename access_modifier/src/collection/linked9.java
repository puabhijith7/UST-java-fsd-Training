package collection;

import java.util.LinkedList;
import java.util.Scanner;

public class linked9 {

	public static void main(String[] args) {
		int p,n,e,i=0;
		LinkedList<Integer> l=new LinkedList<Integer>();
		l.add(1);
		l.add(2);
		l.add(3);
		l.add(4);
		l.add(5);
		l.add(6);
		l.add(7);
		Scanner sc=new Scanner(System.in);
		System.out.println(" How many Elements :");
		e=sc.nextInt();
		System.out.println("Position :");		
		p=sc.nextInt();
		p=p-1;
		System.out.println(" Enter Elements :");
		while(i<e)
		{
		n=sc.nextInt();
		l.add(p++,n);
		//c++;
		i++;
		}
		System.out.println("The list is: "+l);
		sc.close();
	}

}
