package hackathon2;
import java.util.*;
public class Q18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> s = new HashSet<String>();
		String[] str = {"hello","world","apple","ball" };
		s.addAll(Arrays.asList(str));
		System.out.println(s);
		s.clear();
		System.out.println(s);
		

	}

}