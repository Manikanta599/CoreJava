class Inc
{
    public int increment(int n)
    {
        return ++n;
    }

}

class Dec
{
    public int decrement(int n)
    {
        
        return --n;
    }

    public static void setNum()
    {
        Inc n=new Inc();
        System.out.println("increment: "+n.increment(8));
    }
}

class Ass4
{
    public static void main(String[] args)
    {
        Dec d=new Dec();
        System.out.println("decrement "+d.decrement(10));
        Dec.setNum();
    }
}