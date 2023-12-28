package overloading;
class Demo
{
    public void show(char c)
    {
        System.out.println("char c: "+c);
    }
    public void show(boolean a,boolean b)
    {
        System.out.println("boolean a"+a);
        System.out.println("boolean b "+b);
    }
    public void show(char m,String s,double d)
    {System.out.println("char m"+m);
    System.out.println("string s"+s);
    System.out.println("double d "+d);
    }


}

class Mainclass
{
    public static void main(String[] args)
    {
        Demo d1=new Demo();
        d1.show('m');
        d1.show(true,false);
        d1.show('m',"manikanta",9.2);
    }
}