
public class Table {
    public void close()
    {
        System.out.println("table close");
    }
    public static void use()
    {
        System.out.println("use table");
        Table t=new Table();
        t.close();
    }
    public void open()
    {
        System.out.println("table opens");
        use();
    }

    public static void main(String[] args)
    {
        System.out.println("main method");
        Table t=new Table();
        t.open();
    }



    
}
