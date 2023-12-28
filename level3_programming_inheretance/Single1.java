class A
{
    public int i;
    public A(int i)
    {
        this.i=i;
       System.out.println(i);
    }
}

class B extends A
{
    public B()
    {
        super(9);
    }
    public void print()
    {
        
        System.out.println("sub class of b");
    }
}

/**
 * Single1
 */
public class Single1 {
public static void main(String[] args) {
    

    B b1=new B();
    b1.print();
}
}