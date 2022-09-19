package Interface;
interface Printable1{
void print();
}
interface Showable1 extends Printable{
void show();
}
class Inter3 implements Showable1{
public void print(){System.out.println("Hello");}
public void show(){System.out.println("Welcome");}
 
public static void main(String args[]){
Inter3 obj = new Inter3();
obj.print();
obj.show();
 }
}
