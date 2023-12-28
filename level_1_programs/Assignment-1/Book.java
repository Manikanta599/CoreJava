public class Book {

    public void read()
    {
        System.out.println("reading..");
    }
    public void write()
    {
        System.out.println("writing");;
    }

    public static void openBook()
    {
        Book b=new Book();
        b.write();
        b.read();
        System.out.println("book opens");
    }

    public static void main(String[] args)
    {
        System.out.println("main method");
        openBook();
    }
    
}
