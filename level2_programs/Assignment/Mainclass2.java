
class Read
{
    public static void reading(String s)
    {
        System.out.println("he is "+s);
    }

}
class Write
{
    public boolean writing(boolean b)
    {
        return b;
    }

}
class Book
{
    public static void openBook()
    {
        System.out.println("book open");
        Read.reading("studying");
        Write w=new Write();
       
        System.out.println("he is "+w.writing(true));
    }
}

class Mainclass2
{
    public static void main(String[] args)
    {
        Read.reading("reading");
        Write w=new Write();
        System.out.println("he is "+w.writing(true));
        Book.openBook();

        Book.openBook();


    }

}












