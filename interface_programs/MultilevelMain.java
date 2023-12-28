interface Smost 
{
    public void smMet();
}
interface Sup extends Smost
{
    public void supMet();
}
interface Sub extends Sup 
{
    public void subMet();
}

class Imp implements Sub 
{
    public void smMet()
    {
        System.out.println("smmet implemented");
    }
    public void supMet()
    {
        System.out.println("supmet implemented");
    }
    public void subMet()
    {
        System.out.println("submet implemented");
    }
}

/**
 * MultilevelMain
 */
public class MultilevelMain {

    public static void main(String[] args) {
        Imp i=new Imp();
        i.smMet();
        i.supMet();
        i.subMet();
    }
}