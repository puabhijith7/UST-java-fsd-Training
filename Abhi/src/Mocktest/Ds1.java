package Mocktest;

public class Ds1 {

	public static void main(String[] args) {
		String a[]= {"aa","bb","cc"};
		String b="bb";
		int c=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==b)
			{
				System.out.println("Index pos - "+i);
				c++;
				break;
			}
		}
		if(c==0)
		{
			System.out.println("Not found");
		}
	}

}
