public class Bottle {

    public void close()
    {
        System.out.println("close bottle");
    }
    public static void drink()
    {
        System.out.println("drink water");
        Bottle b=new Bottle();
        b.close();
    }
    public static void open()
    {
        System.out.println("open bottle");
        drink();
    }

    public static void main(String[] args)
    {
        open();

    }
    
}
