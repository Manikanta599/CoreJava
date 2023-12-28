abstract class Sup 
{
    abstract public void smet();
}

class Sub extends Sup 
{
    public void smet()
    {
        System.out.println("method completed..");
    }

    public void ownm()
    {
        System.out.println("own method");
    }
}

/**
 * ReqMain
 */
public class ReqMain {

    public static void main(String[] args) {
        Sup s1=(Sup) new Sub();
        s1.smet();
       
        Sub s2=(Sub) s1;
        s2.ownm();
        s2.smet();
    }
}