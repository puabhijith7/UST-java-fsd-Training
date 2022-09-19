package oops;
class StaticTest {
    int multiply(int a, int b){
        return a * b;
    }
    static int sub(int a, int b){
        return a - b;
    }
}
public class Static {
   public static void main( String[] args ) {       
        StaticTest st = new StaticTest();      
        System.out.println(" 2 * 2 = " + st.multiply(2,2));      
        System.out.println(" 2 - 3 = " + StaticTest.sub(2,3));
   }
}
