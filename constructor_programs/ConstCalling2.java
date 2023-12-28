class C
{
    public C(String s)
    {
        System.out.println("string arg "+s);
    }
    public C(boolean b){
        this("jaya");
        System.out.println("boolean arg "+b);

    }

    public C(int a,double c)
    {
        this(true);
        System.out.println("int arg "+a+"\n double arg "+c);
    }
}

/**
 * ConstCalling2
 */
class ConstCalling2 {
    public static void main(String[] args) {
        C c1=new C(9,9.9);
    }

    
}