package Date20_9;

import java.util.Scanner;

public class work2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter Year");
	    int b=sc.nextInt();
	    if(b%100==0) {
	    	if(b%400==0) {
	    		System.out.println("Leap year");
	    	}
	    	else {
	    		System.out.println("Not a Leap year");
	    	}
	    }
	    else {
	    	if(b%4==0) {
	    		System.out.println("Leap year");
	    	}
	    	else {
	    		System.out.println("Not a Leap year");	    	
	         }
	}
	}
}
