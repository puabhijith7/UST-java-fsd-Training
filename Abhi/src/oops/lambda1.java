package oops;

interface Functional
{ 
	void abstractFun(int x);
}  
class lambda1
{ 
	public static void main(String args[]){ 
	Functional fobj = (int x)->System.out.println(2*x);//lambda head and body
    fobj.abstractFun(10);
    }
}