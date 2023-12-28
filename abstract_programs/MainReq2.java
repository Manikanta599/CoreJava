abstract class Sup
{
    abstract public void inc();
}

class Sub1 extends Sup
{
    public void inc()
    {
        System.out.println("completed sub1..");
    }
}

class Sub2 extends Sup
{
    public void inc()
    {
        System.out.println("completed sub2..");
    }
}

/**
 * MainReq2
 */
public class MainReq2 {
    public static void main(String[] args) {
        Sub1 s1=new Sub1();
        s1.inc();
        Sub2 s2=new Sub2();
        s2.inc();
    }

    
}