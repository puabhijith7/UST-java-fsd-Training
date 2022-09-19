package java8;

import java.util.Random;

public class two {

	public static void main(String[] args) {//print random numbers
		 Random random = new Random();
	     random.ints().limit(5).forEach(System.out::println);
	}
}
