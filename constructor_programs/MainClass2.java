class Result
{
    public Result(String s,boolean b)
    {
        System.out.println(s);
        System.out.println(b);

    }
}



/**
 * MainClass2
 */
class MainClass2 {

    public static void main(String[] args)
    {
        Result res1=new Result("pass", true);
        Result res2=new Result("fail", false);
    }

    
}