package pqueue;

import java.util.PriorityQueue;
import java.util.Scanner;

public class pq2 {

	public static void main(String[] args) {
		PriorityQueue<String> p=new PriorityQueue<String>();
		p.add("red");
		p.add("green");
		p.add("blue");
		p.add("pink");
		p.add("yellow");
		System.out.println(p);
		System.out.println("Element : ");
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		p.add(s);
		System.out.println(p);
		sc.close();

	}

}
