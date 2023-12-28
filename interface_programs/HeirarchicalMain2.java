interface Sup 
{
    void supMet();
}

interface Sub1 extends Sup 
{
    void Sub1Met();
}
interface Sub2 extends Sup 
{
    void Sub2Met();
}

class Imp1 implements Sub1 
{
    public void supMet()
    {
        System.out.println("supmet implemented");
    }

    public void Sub1Met()
    {
        System.out.println("sub1met implemented");
    }
}

class Imp2 implements Sub2 
{
    public void supMet()
    {
        System.out.println("supmet implemented2");
    }

    public void Sub2Met()
    {
        System.out.println("sub2met implemented");
    }
}

/**
 * HeirarchicalMain2
 */
public class HeirarchicalMain2 {

    public static void main(String[] args) {
        Imp1 i1=new Imp1();
        i1.supMet();
        i1.Sub1Met();

        Imp2 i2=new Imp2();
        i2.supMet();
        i2.Sub2Met();
    }
}