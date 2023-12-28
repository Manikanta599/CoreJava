interface Sup1 
{
    void sup1Met();
}

interface Sup2 
{
    void sup2Met();
}

interface Sub extends Sup1,Sup2
{
    void subMet();
}

class ImpMultiple implements Sub 
{
    public void sup1Met()
    {
        System.out.println("sup1met implemented");
    }

    public void sup2Met()
    {
        System.out.println("sup2met implemented");
    }
    public void subMet()
    {
        System.out.println("submet implemented");
    }
}

/**
 * MultipleMain
 */
abstract class MultipleMain {

    public static void main(String[] args) {
        ImpMultiple i=new ImpMultiple();
        i.sup1Met();
        i.sup2Met();
        i.subMet();
    }

    
}