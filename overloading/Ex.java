class Sample{

    public static void view(double z)
    {
        System.out.println("z "+z);
    }
    public static void view(char c)
    {
        System.out.println("c "+c);
    }
    public void view(int n)
    {
        System.out.println("n "+n);
    }
    
}

class Ex
{
    public static void main(String[] args)
    {
        Sample s=new Sample();
        s.view(9);
        Sample.view('h');
        Sample.view(9.9);
    }
}
