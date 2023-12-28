class FilesExplorer
{
    public static void open()
    {
        System.out.println("open fileexplorer");
    }
    public static void close()
    {
        System.out.println("close fileexplorer");
    }
}
class Click
{
    public void clickFileExplorer()
    {
         System.out.println("click ");
        FilesExplorer.open();
        FilesExplorer.close();
    }
}
class Files
{
    public static void openfile()
    {
        System.out.println("open file");
        Click c=new Click();
        c.clickFileExplorer();
    }
}

class Ass2
{
    public static void main(String[] args)
    {
        Files.openfile();
    }
}














