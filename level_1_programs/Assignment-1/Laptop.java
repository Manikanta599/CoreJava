public class Laptop {
    public static void filesOPen()
    {
        System.out.println("files open");
    }
    public static void openFolder()
    {
        System.out.println("folder opens");
    }
    public void clikFiles()
    {
        System.out.println("click files");
        filesOPen();
        openFolder();
    }
    public static void onLaptop()
    {

        System.out.println("Laptop ons");
        Laptop l=new Laptop();
        l.clikFiles();
        
    }

    public static void main(String[] args)
    {
        System.out.println("main method");
        onLaptop();
    }

    
}
