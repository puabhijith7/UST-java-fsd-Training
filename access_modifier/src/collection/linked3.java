package collection;
//specified position traverse
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class linked3 {

	public static void main(String[] args) {
		int p,i=1;
		LinkedList<Integer> l=new LinkedList<Integer>();
		l.add(1);
		l.add(2);
		l.add(3);
		l.add(4);
		l.add(5);
		l.add(6);
		System.out.println("Position :");
		Scanner sc=new Scanner(System.in);
		p=sc.nextInt();		
       Iterator itr=l.iterator();
       while(itr.hasNext())
       {
    	  
    	   if(i<p)
    	   {
    		   i++;
    		   int a=(int) itr.next();
    	   }
    	   else
    	   {
    	    System.out.println(itr.next());
    	   }

       }
       sc.close();

	}

}
