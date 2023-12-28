abstract class Abs 
{
    abstract public void absMet();
}

interface inf 
{
    void infMet();
}

class Sub extends Abs implements inf
{
    public void absMet()
    {
        System.out.println("abs implemeted");
    }

    public void infMet()
    {
        System.out.println("infmet implemeted");
    }
    
}
/**
 * ReqMain
 */
public class ReqMain {

    public static void main(String[] args) {
        Sub s=new Sub();
        s.absMet();
        s.infMet();
    }
}