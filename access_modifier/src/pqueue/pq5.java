package pqueue;

import java.util.Iterator;
import java.util.PriorityQueue;

public class pq5 {

	public static void main(String[] args) {
		PriorityQueue<String> l=new PriorityQueue<String>();
		l.add("a");
		l.add("b");
		l.add("h");
		Iterator itr=l.iterator();
		while(itr.hasNext())
	       {
	    	   System.out.println(itr.next());
	    	   break;
	       }

	}

}
