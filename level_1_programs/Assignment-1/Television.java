public class Television {
    public void off()
    {
        System.out.println("off television");
    }
    public void watch()
    {
        System.out.println("watch television");
    }
    public void on()
    {
        System.out.println("on television");
        watch();
        off();
    }

    public static void main(String[] args)
    {
        Television t=new Television();
        t.on();
        t.watch();
        t.off();
        
    }

}
