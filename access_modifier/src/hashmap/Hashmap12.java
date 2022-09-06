package hashmap;

import java.util.HashMap;
import java.util.Map;


public class Hashmap12 {

	public static void main(String[] args) {
		
		HashMap<Integer,String> h=new HashMap<Integer,String>();
		h.put(1,"aa");
		h.put(2,"bb");
		h.put(3,"cc");		
		for(Map.Entry<Integer,String> i : h.entrySet())
		{
        	   System.out.println(i.getValue());
        }	
}
}