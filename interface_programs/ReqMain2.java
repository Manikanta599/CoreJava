class Com
{
    public void comMet()
    {
        System.out.println("comMet ");
    }

}

interface inf 
{
    void infMet();
    
}

class Single extends Com implements inf 
{
    public void infMet()
    {
        System.out.println("infmet");
    }
}

/**
 * ReqMain2
 */
public class ReqMain2 {

    public static void main(String[] args) {
        Single s=new Single();
        s.comMet();
        s.infMet();
    }
}