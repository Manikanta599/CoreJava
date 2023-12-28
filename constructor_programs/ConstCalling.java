class B
{
   public B()
    {
        this(9.2);
        
        System.out.println("constructor with out arguments");
        
        
    }
   public B(double d)
    {
        System.out.println(d);
    }
}
/**
 * ConstCalling
 */
class ConstCalling {

    public static void main(String[] args)
    {
        B b1=new B();
    }

    
}