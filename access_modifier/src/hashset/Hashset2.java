package hashset;
import java.util.HashSet;
public class Hashset2 {
	public static void main(String[] args) {
		HashSet<String> l=new HashSet<String>();
		l.add("a");
		l.add("b");
		l.add("h");
        l.add("i");
        System.out.println(l);
        HashSet<String> l2=new HashSet<String>();
        l2=(HashSet)l.clone();  
        System.out.println(l2);		
	}
}