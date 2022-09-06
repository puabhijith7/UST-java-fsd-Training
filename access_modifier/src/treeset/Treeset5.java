package treeset;
import java.util.TreeSet;
//less than 7

public class Treeset5 {

	public static void main(String[] args) {
		int c=0;
		TreeSet<Integer> l=new TreeSet<Integer>();
		l.add(1);
		l.add(8);
		l.add(2);
		l.add(9);
		l.add(10);
		for(Integer i:l)
		{
			if(i<7)
			{
				System.out.println(i+" ");
			}
		}
	}

}
