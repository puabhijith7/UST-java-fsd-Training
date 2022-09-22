package Mocktest;

public class Ds2 {

	public static void main(String[] args) {
		String a[]= {"a","b","c","d"};
		String b="c";
		int low=0,high=a.length-1;
		int mid=(low+high)/2;
		while(low<=high)
		{
			if (a[mid]==b)
			{
				System.out.println("Found at index "+mid);
				break;
			}
			else if(b.compareTo(a[mid])>0)
			{
				low=mid+1;
			}
			else
			{
				high=mid-1;
			}
			mid=(low+high)/2;
			if(low>high)
			{
				System.out.println("Element not Found");
			}
		}

	}

}
