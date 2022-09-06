package pqueue;
//compare and print same elements in both

import java.util.PriorityQueue;

public class pq4 {

	public static void main(String[] args) {
		PriorityQueue<String> l=new PriorityQueue<String>();
		l.add("a");
		l.add("b");
		l.add("h");
		PriorityQueue<String> lh=new PriorityQueue<String>();
		lh.add("a");
		lh.add("b");
		lh.add("h");
		lh.add("i");
		for(String i:l)
		{
			for(String j:lh)
			{
				if(i==j)
				{
					System.out.println(i+" ");
				}
			}
		}

	}
}
