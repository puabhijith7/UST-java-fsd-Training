package hashset;
//compare and print same elements in both
import java.util.HashSet;

public class Hashset3 {

	public static void main(String[] args) {
		HashSet<String> l=new HashSet<String>();
		l.add("a");
		l.add("b");
		l.add("h");
		HashSet<String> lh=new HashSet<String>();
		lh.add("a");
		lh.add("b");
		lh.add("h");
		lh.add("i");
		for(String i:l)
		{
			for(String j:lh)
			{
				if(i==j)
				{
					System.out.println(i+" ");
				}
			}
		}

	}

}
