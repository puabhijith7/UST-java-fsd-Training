package collection;
import java.util.Collections;
//reverse traverse
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class linked4 {

	public static void main(String[] args) {
		int p,i=1;
		LinkedList<Integer> l=new LinkedList<Integer>();
		l.add(1);
		l.add(2);
		l.add(3);
		l.add(4);
		l.add(5);
		l.add(6);
			
		Collections.reverse(l);
       Iterator itr=l.iterator();
       while(itr.hasNext())
       {

    	    System.out.println(itr.next());
    	   
       }
      
      

	}

}