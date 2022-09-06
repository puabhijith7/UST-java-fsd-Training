package collection;

import java.util.LinkedList;
import java.util.Scanner;

public class linked6 {

	public static void main(String[] args) {
		int p,n;
		LinkedList<Integer> l=new LinkedList<Integer>();
		l.add(1);
		l.add(2);
		l.add(3);
		l.add(4);
		l.add(5);
		l.add(6);
		System.out.println("First Position :");
		Scanner sc=new Scanner(System.in);
		p=sc.nextInt();	
		System.out.println("Last Position :");		
		n=sc.nextInt();	
		l.addFirst(p);
		l.addLast(n);
		System.out.println("List"+ l);
		sc.close();
	}
}