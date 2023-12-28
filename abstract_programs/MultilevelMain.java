abstract class Smost 
{
    abstract public void met1();
    abstract public void met2();
}

abstract class Sclass extends Smost 
{
    public void met1()
    {
        System.out.println("method 1...");
    }
}

class Subclass extends Sclass 
{
    public void met2()
    {
        System.out.println("method 2...");
    }
}

/**
 * MultilevelMain
 */
public class MultilevelMain {

    public static void main(String[] args) {
        Subclass s1=new Subclass();
        s1.met2();
        s1.met1();
    }
}