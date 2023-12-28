class Document
{
    public  String fname;
    public  String ftype;
    public  int n;
    public void setDetails(String name,String type,int j)
    {
        fname=name;
        ftype=type;
        n=j;

    }


    public void printDetails()
    {
        System.out.println("file name "+fname);
        System.out.println("file type "+ftype);
        System.out.println("file size "+n);
    }

    public void convert()
    {
        int kb=n*1024;
        System.out.println(kb+" KB");
    }
}

/**
 * MainDoc
 */
class MainDoc {

    public static void main(String[] args)
    {
        Document d=new Document();
        
        d.setDetails("java", "pdf", 4);
        d.printDetails();
        d.convert();
    }

    
}