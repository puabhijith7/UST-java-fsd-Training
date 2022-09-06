package treeset;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSet2 {

	public static void main(String[] args) {
		TreeSet<String> l=new TreeSet<String>();
		l.add("Green");		
		l.add("Blue");
		l.add("red");
		l.add("pink");
		l.add("violet");
		Iterator itr=l.iterator();
	       while(itr.hasNext())
	       {
	    	   System.out.println(itr.next());
	       }

	}

}
