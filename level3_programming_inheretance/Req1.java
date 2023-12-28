class Mobile
{
    public int chargePercentage()
    {
        return 88;
    }
}

class Use extends Mobile
{
    public void chating()
    {
        System.out.println("chating ");
    }
    public void using()
    {
        System.out.println("using method  ");
        chating();
        System.out.println("charge percentage "+chargePercentage());
    }
}

/**
 * Req1
 */
public class Req1 {

    public static void main(String[] args) {
        Use u1= new Use();
        u1.using();
    }
}