package Date20_9;
import java.io.*;
import java.util.*;

 

class work7{

 


	public static void main(String[] args){     
	    String string = "www.google.com";    
	    String word = "";   
	    String[] words = new String[100];    
	    int length = 0;    
	        
	      
	    string = string + ".";    
	        
	    for(int i = 0; i < string.length(); i++)
	    {    
	           
	        if(string.charAt(i) != '.'){    
	            word = word + string.charAt(i);    
	        }    
	        else{    
	            
	            words[length] = word;    
	           
	            length++;    
	              
	            word = "";    
	        }    
	    } 
	    int j=0,q=0;
	    char ch;
	    String rev="";
	    for(q=0;q<=length-1;q++)
	    {	    	
	    for(int i=words[j].length()-1;i>=0;i--)
		{
			ch=words[q].charAt(i);
			rev=rev+ch;
		}
	    j++;
	    System.out.print(rev+".");
	    rev="";
	    }
	}
}