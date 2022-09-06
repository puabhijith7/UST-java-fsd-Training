package hashmap;

import java.util.HashMap;
import java.util.Iterator;

public class Hashmap2 {

	public static void main(String[] args) {
		HashMap<Integer,String> h=new HashMap<Integer,String>();
		h.put(1,"aa");
		h.put(2,"bb");
		h.put(3,"cc");
		h.put(4,"dd");		
		System.out.println(h.size());
	}
}