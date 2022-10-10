package sba1;

import java.util.Scanner;

public class leastoffer {

    public static void main(String[] args) {
    	Scanner sc=new Scanner(System.in);
    	int a=sc.nextInt();
    	System.out.println("Enter :");
    	String q=sc.nextLine();
    	int m = 0,n=0,z=0,count=1;
    	String array[]=new String[20];
    	String r[]=new String[20];
    	float aa[]=new float[20];
    	for (int i=0;i<a;i++)
    	{
    		array[i]=sc.nextLine();
    		r = array[i].split("[,]", 0);
    		for (int j=0;j<=r.length-2;j++)
        	{
    	     if (j==0)
    	     {
    	    	 array[i]=r[j];
    	     }
    	     else
    	     {
    	    	 m=Integer.parseInt(r[j]);
    	    	 n=Integer.parseInt(r[j+1]);   	    	 
    	     }  	     
        	}
	    	aa[i]=(m*n)/100;	    	   
        }
    	for(int i=0;i<a-1;i++)
    	{
    		if(array[i]==array[i+1])
    		{
    			continue;
    		}
    		else 
    		{
    			count++;
    		}
    	}
    	if(count==a)
    	{
    		for(int i=0;i<a;i++)
    		{
    			System.out.println(array[i]);
    		}
    	}
    	else
    	{
    	float y=aa[0];
    	for( int i=1;i<a;i++)
    	{
    		if(aa[i]<y)
    		{
    			y=aa[i];
    			z=i;
    		}
    	}    	
    	System.out.println(array[z]);
    	}
     }
}
 
