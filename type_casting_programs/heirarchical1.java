class Ele
{
    public void eleM()
    {
        System.out.println("electronics..");
    }
}

class Laptop extends Ele
{
    public void lap()
    {
        System.out.println("laptop");
    }
}
class Mobile extends Ele 
{
    public void mob()
    {
        System.out.println("mobile..");
    }
}

/**
 * heirarchical1
 */
public class heirarchical1 {

    
    public static void main(String[] args) {
        Ele e1=(Ele) new Laptop();
        e1.eleM();
        Laptop l=(Laptop) e1;
        l.lap();
        
    }
}