package collection;
//first and last occurence of a element

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class linked10 {
	

	public static void main(String[] args) {
		LinkedList<Integer> l=new LinkedList<Integer>();
		int c=0,b=0,a=-5;
		
		System.out.println("Enter Element :");
		Scanner sc=new Scanner(System.in);
		int p=sc.nextInt();
		l.add(1);
		l.add(2);
		l.add(3);
		l.add(2);
       Iterator itr=l.iterator();
       while(itr.hasNext())
       {
    	  if (l.get(c)==p)
    	  {
    		  if(a==-5)
    		  {
    		  a=c; 
    		  }
    		  b=c;
    		  
    	  }
    	  c++;
    	  itr.next();
    	 
       }
       System.out.println("First occurence :"+(a+1));
       System.out.println("Second occurence :"+(b+1));
       
	}
}
