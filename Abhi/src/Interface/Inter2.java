package Interface;
interface Printable{
void print();
}
interface Showable{
void print();
}
 
class Inter2 implements Printable, Showable{
public void print(){System.out.println("Hello");}
public static void main(String args[]){
Inter2 obj = new Inter2();
obj.print();
 }
}