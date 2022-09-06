package Public;

 class P
{
    private double num = 100;
    private int square (int a)
    {
        return a * a;
    }
}
 public class Privateclass
{
    public static void main (String args[])
    {
        P obj = new P ();
        System.out.println (obj.num); 
        System.out.println (obj.square (10)); 
    }
}
