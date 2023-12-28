class Book
{
    public void read()
    {
        System.out.println("reading");
    }

    public void write()
    {
        System.out.println("writing");
    }
    public static void close()
    {
        System.out.println("closing");
    }
}
class pen
{
    public void start()
    {
        System.out.println("starting");
        Book b=new Book();
        b.read();
        b.write();
    }
}
public class Ass1 {

    public static void main(String[] args)
    {
        
        pen p=new pen();
        p.start();
        Book.close();
        
        
    }
    
}
