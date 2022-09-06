package aa;

public class prime {

	public static void main(String[] args) {
		int w,j;
		for(int i=2;i<=100;i++)
		{
		w=0;
		for( j=2;j<=(i/2);j++)
		{
			if(i%j==0)
				w=1;	
		}
		if(w==0)
		{
			System.out.println(i);
		}
		}

	}

}
