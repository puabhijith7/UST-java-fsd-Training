package aa;

import java.util.Scanner;

public class ASCII {

	public static void main(String[] args) {
		
        char v;
        int ascii;
        Scanner sc=new Scanner(System.in);
        v=sc.next().charAt(0);
        ascii=v;
        System.out.println("The ASCII value is "+ascii);
        sc.close();
	}

}
