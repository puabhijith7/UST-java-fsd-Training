package Date20_9;

import java.util.Scanner;

public class work3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter String");
		String s=sc.nextLine();
		String rev="";
		char ch;
		for(int i=s.length()-1;i>=0;i--)
		{
			ch=s.charAt(i);
			rev=rev+ch;
		}
		if(s.equals(rev)) {
			System.out.println("Palindrome");
		}
		else {
			 
				System.out.println("Not a Palindrome");
			}
		}

	}


