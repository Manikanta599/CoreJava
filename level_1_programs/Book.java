class Book
{
    public static void read()
    {
        System.out.println("read starts..");
        System.out.println("read ends..");
    }
    

    public static void write()
    {
        System.out.println("write starts..");
        System.out.println("write ends..");
    }

    public void open()
    {
        System.out.println("open book..");
        read(); //c4
        write(); //c4
        System.out.println("close book..");
    }

    public static void main(String[] args)
    {
        System.out.println("main starts..");                     
        Book b1=new Book(); //c3
        b1.open();
        System.out.println("main ends..");
    }

    
}