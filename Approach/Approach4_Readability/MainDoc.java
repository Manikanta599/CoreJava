class Document
{
    public  String fname;
    public  String ftype;
    public  int n;
    public Document(String fname,String ftype,int n)
    {
        this.fname=fname;
        this.ftype=ftype;
        this.n=n;

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
        Document d=new Document("java", "pdf", 4);
        Document d1=new Document("python","jpg",5);
        
        
        d.printDetails();
        d.convert();
        d1.printDetails();
        d1.convert();
    }

    
}