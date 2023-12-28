class A 
{
    public static int i=7;
    public void display()
    {
        System.out.println(i);
    }
}

class B extends A 
{
    public void add()
    {
        display();
        System.out.println(i+2);
    }
}

/**
 * Single3
 */
public class Single3 {

    public static void main(String[] args)
    {
        B b1=new B();
        b1.add();
        
    }
}