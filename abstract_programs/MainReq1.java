abstract class Sup
{
    public void com()
    {
        System.out.println("complete method1");
    }

    abstract public void abs1();
    abstract public void abs2();
    
}

class B extends Sup
{
    public void abs1()
    {
        System.out.println("completed abs1..");
    }
    public void abs2()
    {
        System.out.println("completed abs2..");
    }

    public void call()
    {
        com();
        abs1();
        abs2();
        

    }
}

/**
 * MainReq1
 */
public class MainReq1 {

    public static void main(String[] args) {
        B b1 =new B();
        b1.call();
    }
}
