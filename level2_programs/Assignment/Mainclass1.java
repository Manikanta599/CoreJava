class work
{
    public static void coding()
    {
        System.out.println("coding");
    }
    public void typing()
    {
        System.out.println("typing");
    }
}
class open
{
    public static void on()
    {
        System.out.println("on");
        work w=new work();
        w.typing();
    }
    public void off()
    {
        System.out.println("off");
        work.coding();
    }
}

class Mainclass1
{
    public static void main(String[] args)
    {
        open.on();
        open o=new open();
        o.off();
        
    }
}