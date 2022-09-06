package hashmap;

import java.util.HashMap;

public class Hashmap5 {

	public static void main(String[] args) {
		HashMap<Integer,String> h=new HashMap<Integer,String>();
		h.put(1,"aa");
		h.put(2,"bb");
		if (h.isEmpty())
		{
			System.out.println("Empty");
		}
		else
		{
			System.out.println("Not Empty");
		}


	}

}
