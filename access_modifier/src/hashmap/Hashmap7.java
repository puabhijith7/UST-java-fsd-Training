package hashmap;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Hashmap7 {

	public static void main(String[] args) {
		
		HashMap<Integer,String> h=new HashMap<Integer,String>();
		h.put(1,"aa");
		h.put(2,"bb");
		h.put(3,"cc");
		System.out.println("Enter Element : ");
		Scanner sc=new Scanner(System.in);
		int k=sc.nextInt();
		int c=0;
		for(Map.Entry<Integer,String> i : h.entrySet())
		{
           
           if(i.getKey()==k)
           {
        	   System.out.println("Key is present ");
        	   c=1;
        	   break;
           }
          
	   }
		 if(c==0)
         {
      	   System.out.println("Key is Not present ");
         }
         sc.close();
}
}
