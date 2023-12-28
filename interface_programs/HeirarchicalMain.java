interface Sup 
{
    void supMet();
}
interface Sub1 extends Sup 
{
    void sub1Met();
}
interface Sub2 extends Sup 
{
    void Sub2Met();
}

class Demo implements Sub1,Sub2
{
    public void supMet()
    {
        System.out.println("supmet implemented");
    }
    public void sub1Met()
    {
        System.out.println("sub1 implemented");
    }
    public void Sub2Met()
    {
        System.out.println("sub2 implemented");
    }
}

/**
 * HeirarchicalMain
 */
public class HeirarchicalMain {

    public static void main(String[] args) {
        Demo d=new Demo();
        d.supMet();
        d.sub1Met();
        d.Sub2Met();
    }
}