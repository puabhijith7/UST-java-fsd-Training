package hashmap;

import java.util.HashMap;

public class Hashmap6 {

	public static void main(String[] args) {
		HashMap<Integer,String> h=new HashMap<Integer,String>();
		HashMap<Integer,String> h1=new HashMap<Integer,String>();
		h.put(1,"aa");
		h.put(2,"bb");
		h.put(3,"cc");
		h1=(HashMap)h.clone();
		System.out.println(h1);

	}

}
