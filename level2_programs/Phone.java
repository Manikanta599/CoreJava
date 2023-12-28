class Charge
{
    public static void chargeOn()
    {
        System.out.println("charge on");
    }
    public void chargeOff()
    {
        System.out.println("charge off");
    }
}

class Use
{
    public static void call()
    {
        System.out.println("call");
        Charge.chargeOn();
    }
    public void callOff()
    {
        System.out.println("calloff");
        Charge c=new Charge();
        c.chargeOff();
    }
}

class Phone
{
    public static void main(String[] args)
    {
        Use.call();
        Use u=new Use();
        u.callOff();

    }
}