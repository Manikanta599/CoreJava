class A 
{
    public int i=4;
    public int j=5;
    public int add()
    {
        return i+j;
    }
}

class B extends A
{
    public B()
    {
        System.out.println(add());
    }
}

/**
 * Single2
 */
public class Single2 {

   public static void main(String[] args) {
     B b1=new B();
   }

}