package pqueue;

import java.util.PriorityQueue;

public class pq3 {

	public static void main(String[] args) {
		int a=0;
		PriorityQueue<String> p=new PriorityQueue<String>();
		p.add("red");
		p.add("green");
		p.add("blue");
		p.add("pink");
		p.add("yellow");
		for(String i:p)
		{
          a++;
		}
		System.out.println("Count "+a);
          
	}

}
